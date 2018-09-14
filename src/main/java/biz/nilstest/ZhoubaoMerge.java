package biz.nilstest;

import core.util.HTMLUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2018/3/30.
 */
public class ZhoubaoMerge {

    static  HashMap<String, String > groupMap = new HashMap<String, String>(){{
        put("#### 交互设计","张同锐,方王芳");
        put("#### 质量保证","许巧丹,马燕");
        put("#### 技术支撑","张天明1");
    }};

    private static String zhoubaoStr =  "2018-08-20周报\n" +
            "\n" +
            "由 张天明1 在 一分钟内 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 质量周报优化\n" +
            "- 测试培训学习\n" +
            "- 天阙情况报告\n" +
            "- Nginx日志分析优化\n" +
            "- 漏洞扫描问题讨论\n" +
            "- 天阙研发管理PPT及会议讨论优化\n" +
            "- bug周报优化\n" +
            "- 石河子研发讨论\n" +
            "- 开发平台4.0优化\n" +
            "- S2-057漏洞确认及POC研究\n" +
            "- 4.0 优化\n" +
            "\n" +
            "2、下周计划\n" +
            "- 开发平台4.0版本定制版\n" +
            "- 石河子项目研发\n" +
            "- 移动端框架讨论\n" +
            "- 天阙会议\n" +
            "\n" +
            "2018-08-20周报\n" +
            "\n" +
            "由 张同锐 在 11 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 新区安监app页面测试，并反馈问题；\n" +
            "- 苏州组-苏州城市建设投资app登录、启动、首页界面设计与切图；\n" +
            "- 昆山开发区监察系统前端代码修改；\n" +
            "- 司法组-泗阳县司法局社区矫正指挥平台logo修改；\n" +
            "- 外勤组-安次安监banner图和logo修改\n" +
            "\n" +
            "2、下周计划\n" +
            "暂无\n" +
            "\n" +
            "2018-08-20 周报\n" +
            "\n" +
            "由 马燕 在 11 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 社区组南京智慧社区综合信息管理与服务平台测试报告\n" +
            "- 参加培训\n" +
            "- 社区组南京智慧社区综合信息管理与服务平台新功能测试\n" +
            "- 外勤组外勤助手70轮迭代问题回归及升级支撑\n" +
            "- 社区组扬州智慧社区综合信息管理与服务平台新功能测试\n" +
            "\n" +
            "2、下周计划\n" +
            "- 社区组扬州智慧社区综合信息管理与服务平台测试报告\n" +
            "- 社区组扬州智慧社区综合信息管理与服务平台新功能测试\n" +
            "\n" +
            "2018-08-20周报\n" +
            "\n" +
            "由 方王芳 在 29 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 【苏州组】logo修改\n" +
            "- 【外勤组】图片修改、外勤新版APP 切图\n" +
            "- 【司法组】辽宁省司法行政系统综合管理信息平台 配合开发调整样式\n" +
            "- 【社区组】镇江智慧平望大数据指挥中心 图片修改\n" +
            "- 【外勤组】【党建项目】党费缴纳功能模块6P 界面设计及切图\n" +
            "培训\n" +
            "\n" +
            "2、下周计划\n" +
            "- 【定制化组】无锡水利局项目 建议做可用性测试\n" +
            "\n" +
            "2018-08-20周报\n" +
            "\n" +
            "由 许巧丹 在 大约一小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 文档检查（环卫一线工人免费早餐信息管理平台-邢学新、苏州电信制造业物联网智能产品连接管理平台开发合同_邢学新等）\n" +
            "- 培训《软件测试的概念和敏捷测试流程》\n" +
            "- 根据近阶段文档检查，输出文档中存在的一些问题\n" +
            "- 学习loadrunner性能测试\n" +
            "\n" +
            "2、下周计划\n" +
            "- 各项目组安排的测试工作\n" +
            "- 继续学习loadrunner视频";

    private static Map<String,String>  thisMap = new HashMap<>();
    private static Map<String,String>  nextMap = new HashMap<>();


    public static void main(String[] args) {

        String[] split = zhoubaoStr.split("\n");

        String userName = "";
        String thisworkStr = "";
        String curworkStr = "";
        for (String s : split) {
            if(s.contains(" 之前添加"))
            {
                if(thisworkStr.length()>0)
                {


                    thisMap.put(userName,thisworkStr);
                    nextMap.put(userName,curworkStr);
                }



                userName =  HTMLUtil.getBetweenString(s,"由 "," 在");
                thisworkStr = "";
                curworkStr = "";
                continue;
            }

            if(s.contains("本周工作")||s.length()<1)
            {
                continue;
            }

            if(s.contains("下周计划"))
            {
                thisworkStr = curworkStr;
                curworkStr = "";

                continue;
            }

            if(s.startsWith("- "))
            {
                curworkStr = curworkStr+"\r\n"+s;
            }


        }

        thisMap.put(userName,thisworkStr);
        nextMap.put(userName,curworkStr);



        System.out.println("## 本周情况");
        outZhoubao(thisMap);


        System.out.println("## 下周计划情况");

        outZhoubao(nextMap);

        System.out.println("## 需要协调的问题");



    }

    public static void outZhoubao(Map<String,String> workMap) {
        Set<String> strings = groupMap.keySet();
        for (String groupName : strings) {
            String s = groupMap.get(groupName);

            System.out.println(groupName);
            String[] usernames = s.split(",");
            for (String username : usernames) {
                String workStr = workMap.get(username);
                System.out.print(workStr);
            }

            System.out.println("\r\n\r\n");
        }
    }
}
