package biz.maven;

        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.List;

        import org.dom4j.Attribute;
        import org.dom4j.Document;
        import org.dom4j.DocumentException;
        import org.dom4j.DocumentHelper;
        import org.dom4j.Element;
        import org.dom4j.dom.DOMElement;
        import org.dom4j.io.SAXReader;
        import org.dom4j.io.XMLWriter;


public class ReadJARForMaven {


    public final static String COMMON_PATH= "${project.basedir}/WebRoot/WEB-INF/lib/";

    public final static String FLAG = "/fglib/";

    public final static String VERISION = "1.0.0";

    public final static String SYSTEM = "system";




/*<groupId>com.sk.basecode</groupId>
<artifactId>portal-basecode</artifactId>
<version>1.0</version>
<scope>system</scope>
<systemPath>${project.basedir}/WebRoot/WEB-INF/lib/portalbasecode.jar</systemPath> */

    /**
     * 内容
     * @param list
     * @return
     */
    public Document getNewDc(List<String> list, String path){

//创建新document
        Document dc = DocumentHelper.createDocument();
//Element root = dc.getRootElement();
        Element root = new DOMElement("dependencies");
        dc.add(root);

        for (int i = 0; i < list.size(); i++) {

            Element el = new DOMElement("dependency");

            Element groupId = new DOMElement("groupId");
            groupId.addText(list.get(i));
            Element artifactId = new DOMElement("artifactId");
            artifactId.addText(list.get(i));
            Element version = new DOMElement("version");
            version.addText(VERISION);
            Element scope = new DOMElement("scope");
            scope.addText(SYSTEM);
            Element systemPath = new DOMElement("systemPath");
            systemPath.addText(COMMON_PATH+list.get(i));

//添加节点
            el.add(groupId);
            el.add(artifactId);
            el.add(version);
            el.add(scope);
            el.add(systemPath);

            root.add(el);

//logger.info(el.getData());
        }

//将document 写到文件中取
        try {
//写入之前检查是否存在该文件，存在则删除
            if(new File(path).exists()){
                new File(path).delete();
            }

            XMLWriter xmlw = new XMLWriter(new FileWriter(new File(path)));
            xmlw.write(dc);
            xmlw.close();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }


        return dc;
    }

    /**
     * xml 源
     * @param dc
     * @return
     */
    public List<String> contentList(Document dc){

        List<String> list = new ArrayList<String>();

        Element root = dc.getRootElement();
        for (Iterator iterator = root.elementIterator(); iterator.hasNext();) {
            Element child = (Element) iterator.next();
            Attribute attribute = child.attribute("path");
            String value = attribute.getValue();
            if(value != null && value.startsWith(FLAG)){
                list.add(value.substring(FLAG.length()));
            }else{
                continue;
            }
        }

        return list;
    }


    /**
     * 通过路径获取源
     * @param path
     * @return
     */
    public Document getSrcDc(String path){

        File file = new File(path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e1) {
// TODO Auto-generated catch block
                e1.printStackTrace();
            }
            System.out.println(path+"文件不存在");
            try {
                throw new Exception();
            } catch (Exception e) {
// TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        SAXReader reader = new SAXReader();
        Document dc = null;
        try {
            dc = reader.read(file);
        } catch (DocumentException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dc;
    }

    //直接读取lib路径
    public List<String> getJarNameByPath(String path){
        List<String> tempList = new ArrayList<String>();
        File file = new File(path);
        if(file.isDirectory()){
            String[] list = file.list();
            for (int i = 0; i < list.length; i++) {
                if(list[i].endsWith("jar")){
                    System.out.println(list[i]);
                    tempList.add(list[i]);
                }
            }
        }else{
            System.err.println("指定文件路径错误，该路径对应的不是一个文件目录");
        }
        return tempList;
    }

    public static void main(String[] args) {
        ReadJARForMaven rx = new ReadJARForMaven();

        List<String> contentList = rx.getJarNameByPath("" +
                "D:\\JavaWork\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\platform\\WEB-INF\\lib");


        String newFilePath = "D:\\out"+System.currentTimeMillis()+".xml";
        System.out.println("开始时间："+System.currentTimeMillis());
        rx.getNewDc(contentList, newFilePath);
        System.out.println("结束时间："+System.currentTimeMillis());

    }

}