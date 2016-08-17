package DBGenerator;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.StringUtils;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 *
 * <p>根据PO生成表创建sql<p>
 * <p>根据read方法上的注解，生成数据库字段信息，没有read方法的Field跳过<p>
 * @since jdk1.6
 * @date 2016-8-15
 */
public class DBGenerator {

    /**
     *
     * 根据类的注解信息生成表sql
     * @param clazz
     * @return
     */
    public String generate(Class clazz){
        if(!clazz.isAnnotationPresent(Table.class)){
            throw new RuntimeException("No Annotation[Table] founded in class["+clazz.getName()+"]");
        }
        Table table = (Table)clazz.getAnnotation(Table.class);
        String tableName = table.name();
        StringBuilder sb = new StringBuilder("-- Create table\n");
        sb.append("create table " + tableName + "\n");
        sb.append("(\n");
        Field[] fieldArr = clazz.getDeclaredFields();
        int maxLength = getMaxLength(clazz, fieldArr);
        String primaryKey = generateFields(clazz, sb, fieldArr, maxLength);
        sb.append(");\n");
        generatePrimaryKey(sb, tableName, primaryKey);
        return sb.toString();
    }

    /**
     * 生成sql字段
     * @param clazz
     * @param sb
     * @param fieldArr
     * @param primaryKey
     * @param maxLength
     * @return
     */

    private String generateFields(Class clazz, StringBuilder sb,
                                  Field[] fieldArr, int maxLength) {
        String primaryKey = "";
        Field field;
        for(int i=0;i<fieldArr.length;i++){
            field = fieldArr[i];
            int offset;
            try {
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
                Method mt = pd.getReadMethod();
                if(null != mt){
                    Column col = (Column)mt.getAnnotation(Column.class);
                    writeBlankSpace(sb, 2);
                    sb.append(col.name());
                    offset = maxLength - col.name().length();
                    writeBlankSpace(sb, offset);
                    writeBlankSpace(sb, 1);
                    sb.append(convertJava2Oracle(field, col));
                    if(mt.isAnnotationPresent(Id.class)){
                        sb.append(" not null");
                        primaryKey = col.name();
                    }
                }
            } catch (IntrospectionException e) {
                //找不到readMethod,跳过
                //throw new RuntimeException("No " + field.getName() + "'s ReadMethod founded in class["+clazz.getName()+"]");
                continue;
            }
            if(i != (fieldArr.length -1)){
                sb.append(",");
            }
            sb.append("\n");
        }
        return primaryKey;
    }

    /**
     * 生成主键sql
     * @param tableName
     * @param sb
     * @param primaryKey
     */

    private void generatePrimaryKey(StringBuilder sb, String tableName, String primaryKey) {
        if(StringUtils.isNotBlank(primaryKey)){
            sb.append("alter table " + tableName + "\n");
            sb.append("  add primary key (" + primaryKey + ")\n");
            sb.append("  using index;");
        }
    }

    /**
     * 获得Field最大长度
     * @param clazz
     * @param fieldArr
     */

    private int getMaxLength(Class clazz, Field[] fieldArr) {
        Field field;
        int maxLength = 0;
        for(int i=0;i<fieldArr.length;i++){
            field = fieldArr[i];
            PropertyDescriptor pd;
            try {
                pd = new PropertyDescriptor(field.getName(), clazz);
                Method mt = pd.getReadMethod();
                if(null != mt){
                    if(!mt.isAnnotationPresent(Column.class)){
                        throw new RuntimeException("No Annotation[Column] founded in Method["+mt.getName()+"]");
                    }
                    Column col = (Column)mt.getAnnotation(Column.class);
                    int temLength = col.name().length();
                    if(temLength > maxLength){
                        maxLength = temLength;
                    }
                }
            } catch (IntrospectionException e) {
                //找不到readMethod,跳过
                //throw new RuntimeException("No " + field.getName() + "'s ReadMethod founded in class["+clazz.getName()+"]");
                continue;
            }
        }
        return maxLength;
    }

    /**
     *
     * 将java类型转换为orable类型
     * @param field
     * @param col
     * @return
     */
    private String convertJava2Oracle(Field field, Column col){
        //TODO 此处可根据自己需要做类型转换
        String type = "VARCHAR2";
        if(field.getType().equals(String.class)){
            type = "VARCHAR2(" + col.length() + ")";
        }else if(field.getType().equals(java.util.Date.class) || field.getType().equals(java.sql.Date.class)){
            type = "DATE";
        }else if(field.getType().equals(Integer.class)){
            type = "NUMBER";
        }
        return type;
    }

    /**
     *
     * 输出空格
     * @param sb
     * @param n
     */
    private void writeBlankSpace(StringBuilder sb, int n){
        for(int i=0;i<n;i++){
            sb.append(" ");
        }
    }
}