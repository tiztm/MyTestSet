package biz.shengweiexam;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/9.
 */
public class deptSql {

    static  String sql = "INSERT INTO [department] VALUES ('%s', '%s', '1', '%s');%n";


    public static void main(String[] args) {

        ImportParams params = new ImportParams();
        params.setTitleRows(0);
        params.setHeadRows(1);
        long start = new Date().getTime();
        List<deptEntity> list = ExcelImportUtil.importExcel(new File(
                "c:/dept.xls"), deptEntity.class, params);

        System.out.println(list.size());

        for (int i = 0; i <list.size() ; i++) {

            deptEntity deptEntity = list.get(i);
            String Name = deptEntity.getName();
            String valid = deptEntity.getValid();
            System.out.printf(sql,  String.format("%03d",i+1),Name, valid);
        }
    }
}
