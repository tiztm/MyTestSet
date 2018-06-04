package biz.svnmanager;

import java.util.ArrayList;
import java.util.List;

import static biz.svnmanager.WorkerCompare.diffList;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2017/1/18.
 */
public class DirCompare {
    public static void main(String[] args) {
        String str40 = " authz\n" +
                " authz-windows\n" +
                " backup.log\n" +
                " eagleEye\n" +
                " e通项目维护\n" +
                " htpasswd\n" +
                " jsgj\n" +
                " jsgs1.0\n" +
                " server.pid\n" +
                " SVN\n" +
                " YCZHLY1.0\n" +
                " 丹阳质量技术监督局\n" +
                " 公安大巡防系统\n" +
                " 南京中地\n" +
                " 南京人社局移动OA\n" +
                " 南京依维柯巡修系统\n" +
                " 南京医保\n" +
                " 南京卫岗\n" +
                " 南京卫生局\n" +
                " 南京国检\n" +
                " 南京安监\n" +
                " 南京市政府云秘书\n" +
                " 南京恒宇鑫家电维修派单\n" +
                " 南京旅游局\n" +
                " 南京智慧地税\n" +
                " 南京汇通达维修\n" +
                " 南京环保\n" +
                " 南京组工作交接事项\n" +
                " 南京肯德基\n" +
                " 南京自来水巡检\n" +
                " 南京蒙牛快销\n" +
                " 南京邮政\n" +
                " 南京鼓楼农贸\n" +
                " 售前产品资料\n" +
                " 基础项目模板\n" +
                " 安巡通\n" +
                " 定制项目组\n" +
                " 宠物语音\n" +
                " 工管E通\n" +
                " 常州烟草\n" +
                " 常州短信平台\n" +
                " 无锡组\n" +
                " 智慧社区\n" +
                " 智慧税务\n" +
                " 江苏国税移动OA\n" +
                " 泰州安全生产\n" +
                " 泰州工商E通\n" +
                " 演示项目\n" +
                " 盐都政务\n" +
                " 移动危险源\n" +
                " 综治E通\n" +
                " 臣功药业\n" +
                " 苏国电器\n" +
                " 苏州康力电梯工程管理系统\n" +
                " 镇江团队\n" +
                " 雨润快销\n" +
                " 驻地日常工作\n" +
                " 鼓楼区检察院";


        String str54 = ".\n" +
                "..\n" +
                "Android\n" +
                "android项目组\n" +
                "authz\n" +
                "authz-windows\n" +
                "authz.bak\n" +
                "backup.log\n" +
                "CZTN_ZS315_1.0\n" +
                "CZYC\n" +
                "CZYC_RFID1.0\n" +
                "DKZL\n" +
                "DTPX_PDA1.0\n" +
                "GGET1.0\n" +
                "GTZY\n" +
                "htpasswd\n" +
                "ictjc\n" +
                "ictmap\n" +
                "JMEJ1.0\n" +
                "jsgj\n" +
                "jsgj.rar\n" +
                "jsgs1.0\n" +
                "JSSCHJ\n" +
                "JSZJ\n" +
                "JTND1.0\n" +
                "JTNDQX\n" +
                "KSGKYDOA2.0\n" +
                "NJWSJZSYYGHXT1.0\n" +
                "NJYZJWXET1.0\n" +
                "NMGKSY1.0\n" +
                "NTYW1.0\n" +
                "NYWGXSET1.0\n" +
                "Project\n" +
                "RYDW2.0\n" +
                "server.pid\n" +
                "SFET1.0\n" +
                "SFET2.0\n" +
                "szdj\n" +
                "SZJJHLZDSSJSY1.0\n" +
                "SZYLWLET1.0\n" +
                "TZHYY\n" +
                "WJYJJ1.68\n" +
                "WQZS1.0\n" +
                "WQZS2.0\n" +
                "xiaowai\n" +
                "YCZHLY1.0\n" +
                "YCZHLY1.0.rar\n" +
                "yljw\n" +
                "YXGL1.0\n" +
                "ZHSQ\n" +
                "ZLJSJDJ\n" +
                "人民调解\n" +
                "公司项目\n" +
                "发改委智慧社区\n" +
                "司法E通一期\n" +
                "外勤E通\n" +
                "外勤助手\n" +
                "宿迁安监\n" +
                "工管E通\n" +
                "工管E通ios\n" +
                "常州人大信息服务\n" +
                "常州烟草E通\n" +
                "快消E通\n" +
                "扬州市政外巡E通\n" +
                "施工现场\n" +
                "智慧社区\n" +
                "省体彩\n" +
                "移动OA\n" +
                "美工图片\n" +
                "质监局\n" +
                "部门项目\n" +
                "青奥直播";

        String[] split40 = str40.split("\n");

        List<String> svnworkers = new ArrayList<>();
        for (String s : split40) {
            svnworkers.add(s.trim());
            System.out.println(s.trim());
        }

        String[] split54 = str54.split("\n");


        List<String> svnworkers2 = new ArrayList<>();
        for (String s : split54) {
            svnworkers2.add(s.trim());
            System.out.println(s.trim());
        }

        //System.out.println(diffList(svnworkers,svnworkers2));


    }
}
