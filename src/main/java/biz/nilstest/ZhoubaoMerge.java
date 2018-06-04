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
        put("#### 交互设计","程全芳,方王芳");
        put("#### 质量保证","许巧丹,马燕");
        put("#### 技术支撑","张天明1");
    }};

    private static String zhoubaoStr =  "2018-05-21 周报\n" +
            "\n" +
            "由 许巧丹 在 大约一小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 天津八里台测试和用例的编写\n" +
            "\n" +
            "2、下周计划\n" +
            "- 天津八里台测试和用例的编写\n" +
            "- 镇江党建云项目测试\n" +
            "\n" +
            "2018-05-21 周报\n" +
            "\n" +
            "由 马燕 在 大约 2 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 辽宁省司法厅人民调解平台问题回归和测试\n" +
            "- 天津八里台测试和用例的编写\n" +
            "\n" +
            "2、下周计划\n" +
            "- 天津八里台测试和用例的编写\n" +
            "- 镇江党建云项目测试\n" +
            "\n" +
            "2018-05-21 周报\n" +
            "\n" +
            "由 方王芳 在 大约 2 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 【外勤组】镇江党建项目 党费计算器 设计、配图标、icon\n" +
            "- 【地税安监组】天津消防logo设计\n" +
            "- 【外勤组】外勤助手设计规范评审及交接\n" +
            "- 【定制化组】石河子项目 公众版APP 切图\n" +
            "- 【外勤组】百团大战成果展示模块设计及切图\n" +
            "- 【社区组】平望项目 事项统计需求沟通及界面设计\n" +
            "- 【地税安监组】天津消防项目设计、配图标等\n" +
            "\n" +
            "2、下周计划\n" +
            "- 【地税安监组】天津消防项目设计（登录、首页、总控台）\n" +
            "- 【外勤组】镇江党建项目 登录页设计\n" +
            "- 【司法组】调解通APP UCD复测\n" +
            "\n" +
            "2018-05-21 周报\n" +
            "\n" +
            "由 张天明1 在 大约 2 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 石河子项目研发管理\n" +
            "\n" +
            "2.下周计划\n" +
            "- 石河子项目研发管理";

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
