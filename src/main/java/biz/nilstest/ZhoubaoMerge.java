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

    private static String zhoubaoStr =  "2018-09-10 周报\n" +
            "\n" +
            "由 张天明1 在 一分钟内 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 石河子项目研发管理\n" +
            "- 质量周报统计\n" +
            "- 安监问题解决\n" +
            "- 导入8月项目\n" +
            "- 石河子项目新迭代功能讨论及问题解决\n" +
            "- 石河子新功能评审会议\n" +
            "- Orion系统加入验收日期\n" +
            "- 数据库字段说明设计\n" +
            "\n" +
            "2、下周计划\n" +
            "- 石河子项目研发管理\n" +
            "- 移动端框架讨论\n" +
            "- 分布式能力平台设计与研究\n" +
            "\n" +
            "2018-09-10周报\n" +
            "\n" +
            "由 张同锐 在 25 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 司法组法律服务平台前端html代码优化；\n" +
            "- 外勤组党建app新版高保真界面设计；\n" +
            "- 社区组全要素智能监控系统流程沟通\n" +
            "\n" +
            "2、下周计划\n" +
            "- 外勤组党建app新版高保真界面设计；\n" +
            "- 天津消防首页设计\n" +
            "\n" +
            "2018-09-10周报\n" +
            "\n" +
            "由 方王芳 在 大约一小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 【司法组】辽宁省综合管理平台图表嵌入\n" +
            "- 【社区组】镇江智慧平望大数据指挥中心APP 实事项目模块设计及配8个图标\n" +
            "- 【定制化组】【景德镇项目】工位图设计 5P\n" +
            "- 【社区组】全要素网格智能监控系统 需求沟通去客户现场\n" +
            "- 【安监组】消防项目天津市滨海区图片修改\n" +
            "- 【安监组】消防项目改版需求沟通\n" +
            "- 【定制化组】【无锡水利项目】防汛物资仓库模块平台+手机端 需求沟通、手机端信息架构整理、交互设计\n" +
            "- 【司法组】【山东监狱管理局移动办公】交互评审\n" +
            "\n" +
            "2、下周计划\n" +
            "- 【定制化组】【无锡水利项目三个模块】手机端交互设计 \n" +
            "- 【司法组】【山东监狱管理局移动办公】高保真设计\n" +
            "\n" +
            "2018-09-10 周报\n" +
            "\n" +
            "由 马燕 在 大约 2 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 南京智慧社区综合信息管理与服务平台新增功能（28个模块）测试\n" +
            "- 南京智慧社区综合信息管理与服务平台已测功能模块问题回归\n" +
            "- 征收处外网申报项目问题回归\n" +
            "\n" +
            "2、下周计划\n" +
            "- 南京智慧社区综合信息管理与服务平台新增功能测试\n" +
            "\n" +
            "2018-09-10 周报\n" +
            "\n" +
            "由 许巧丹 在 大约 3 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 文档检查（天津电信北辰区消防局消防物联网监控平台项目--安监等）\n" +
            "- 江阴防汛物资管理系统需求第二次讨论会议\n" +
            "- 学习loadrunner性能测试（关联数组）\n" +
            "- 江阴防汛物资管理系统需求学习，画流程图，整理需求\n" +
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
