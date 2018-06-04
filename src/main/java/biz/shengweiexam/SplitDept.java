package biz.shengweiexam;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;

import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/21.
 */
public class SplitDept {

    public static final String newDeptNames = "中邮人寿保险股份有限公司江苏分公司，中国大地财产保险股份有限公司江苏分公司，浙商银行股份有限公司南京分行，陆家嘴国泰人寿保险有限责任公司江苏分公司，省农村信用社联合社，省高级人民法院";//"泰康养老保险股份有限公司江苏分公司、泰山财产保险股份有限公司江苏分公司、阳光财产保险股份有限公司江苏省分公司、信诚人寿保险有限公司江苏分公司、华安财产保险股份有限公司江苏分公司、渤海财产保险股份有限公司江苏分公司、信泰人寿保险股份有限公司江苏分公司、百年人寿保险股份有限公司江苏分公司、中英人寿保险有限公司江苏分公司、富德财产保险股份有限公司江苏分公司、富德生命人寿保险有限公司江苏分公司、民生人寿保险股份有限公司江苏分公司、农银人寿保险股份有限公司江苏分公司、北大方正人寿保险有限公司江苏分公司、恒安标准人寿保险有限公司江苏分公司、中德安联人寿保险有限公司江苏分公司、中国人民人寿保险股份有限公司江苏分公司、浙商财产保险股份有限公司江苏分公司、永诚财产保险股份有限公司江苏分公司、前海人寿保险股份有限公司江苏分公司、亚太财产保险有限公司江苏分公司、同方全球人寿保险有限公司江苏分公司、合众人寿保险股份有限公司江苏分公司、新光海航人寿保险有限责任公司江苏分公司、中银三星人寿保险有限公司江苏分公司、三星财产保险（中国）有限公司苏州分公司、君康人寿保险股份有限公司江苏分公司、安诚财产保险股份有限公司江苏分公司、中宏人寿保险有限公司江苏分公司、东京海上日动火灾保险（中国）有限公司江苏分公司、日本财产保险（中国）有限公司江苏分公司、幸福人寿保险股份有限公司江苏分公司、中美联泰大都会人寿保险有限公司江苏分公司、中融人寿保险股份有限公司江苏分公司、三井住友海上火灾保险（中国）有限公司江苏分公司、英大泰和人寿保险股份有限公司江苏分公司、英大泰和财产保险股份有限公司江苏分公司、华泰人寿保险股份有限公司江苏分公司、光大永明人寿保险股份有限公司江苏分公司、安达保险有限公司江苏分公司、平安健康保险股份有限公司江苏分公司、平安养老保险股份有限公司江苏分公司、国泰财产保险有限公司江苏分公司、瑞再企商保险有限公司江苏分公司、信达财产保险股份有限公司江苏分公司、紫金财产保险股份有限公司江苏分公司、省政务服务管理办公室、中石化华东石油工程有限公司";

    public static void main(String[] args) {

//
//        ImportParams params = new ImportParams();
//        params.setTitleRows(0);
//        params.setHeadRows(1);
//        long start = new Date().getTime();
//
//        List<deptEntity> list = ExcelImportUtil.importExcel(new File(
//                "d:/dept.xls"), deptEntity.class, params);
//
//
//        String nameString = "";
//        String codeString = "";
//        for (int i = 0; i <list.size() ; i++) {
//
//            deptEntity deptEntity = list.get(i);
//            nameString = nameString+","+deptEntity.getName();
//            codeString = codeString+","+ deptEntity.getValid();
//        }


        String[] split = newDeptNames.split("，");
        for (String s : split) {



                System.out.println(s);

        }
        System.out.println( "------------");

        for (String s : split) {


                String code = (int)(Math.random() * 9000 + 1000) + "";
                System.out.println( code);
            }


    }

}
