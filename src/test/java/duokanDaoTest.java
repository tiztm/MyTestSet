
import db.dao.DuokanDao;
import db.entity.Duokan;
import org.junit.Test;

import java.io.File;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/21.
 */
public class duokanDaoTest {
    
    @Test
    public void test()
    {
        Duokan object = new Duokan();
        object.setUrl("4ee434");

        object.setId(1212);

        System.out.println(DuokanDao.dao.update(object));

        Duokan bean = DuokanDao.dao.getBean("select * from duokan where url='4ee434';");

        System.out.println(bean.getUrl());


    }

    @Test
    public void test2()
    {
        Duokan bean = DuokanDao.dao.getBean("select * from duokan where isdown=0 and (isrunning is null or isrunning !=1);");
        String basePath =  "D:\\test\\" ;
        File pdfFile = new File(basePath+bean.getName());
        if(pdfFile.exists())
            System.out.println("-yes");

    }


}
