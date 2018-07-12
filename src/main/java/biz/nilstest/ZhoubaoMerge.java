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

    private static String zhoubaoStr =  "2018-07-02周报\n" +
            "\n" +
            "由 张天明1 在 一分钟内 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "\n" +
            "- Kettle培训\n" +
            "- PTL5搭建及代码生成测试，功能会议\n" +
            "- 大学生会议及培训\n" +
            "- 司法组立项会议\n" +
            "- 社区项目代码启动优化\n" +
            "- 开发平台5.0培训会议\n" +
            "- 内部验收小组会议\n" +
            "- UIUE培训准备\n" +
            "- 立项项目录入系统\n" +
            "- 石河子项目计划、会议及文档整理\n" +
            "\n" +
            "2、下周计划\n" +
            "\n" +
            "- 开发平台5.0优化意见\n" +
            "- 石河子项目进度跟进\n" +
            "- 社区安监项目跟进\n" +
            "\n" +
            "2018-07-02周报\n" +
            "\n" +
            "由 张同锐 在 18 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 安监政务信息公开页面设计及和html静态页面制作；\n" +
            "- 纪检监察组廉政档案管理平台登录页修改；\n" +
            "- 外勤助手部分页面组件修改；\n" +
            "- 智慧安监产品 剩余关键页面（多种角色）及视觉 评审\n" +
            "\n" +
            "2、下周计划\n" +
            "暂无\n" +
            "\n" +
            "2018-07-02周报\n" +
            "\n" +
            "由 方王芳 在 26 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 【苏州组】园区安监政务信息公开设计及HTML\n" +
            "- 【司法组】监狱项目 需求沟通、登录及主界面设计\n" +
            "- 【司法组】辽宁省司法行政综合业务平台需求沟通、登录及主界面设计 两套方案 以及修改\n" +
            "- 【外勤组】外勤新版设计规范 增加各种输入列表等 需求沟通\n" +
            "- 【地税组】智慧安监产品 剩余关键页面（多种角色）及视觉 评审\n" +
            "\n" +
            "2、下周计划\n" +
            "- 【苏州组】苏州工业园区档案管理中心信息化项目 去某局参观学习（界面）\n" +
            "- 【书法协会】海报 设计\n" +
            "- Axure RP 培训\n" +
            "\n" +
            "2018-07-02 周报\n" +
            "\n" +
            "由 马燕 在 大约 2 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 辽宁省司法厅人民调解平台手机端测试和问题回归\n" +
            "- 智慧社区综合信息管理与服务平台部分事项测试\n" +
            "- 性能测试关于mysql、中间件调优学习\n" +
            "\n" +
            "2、下周计划\n" +
            "- 智慧社区综合信息管理与服务平台部分事项测试\n" +
            "- 以石河子为例的自动化测试框架改进\n" +
            "\n" +
            "2018-07-02周报\n" +
            "\n" +
            "由 许巧丹 在 大约 3 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 江苏省南京地方税务局电子税务管理中心项目测试\n" +
            "- 江苏省南京地方税务局电子税务管理中心项目编写测试计划、测试用例、问题跟踪和系统测试报告\n" +
            "- 线上文档检查\n" +
            "- 项目验收和维护规范文档学习\n" +
            "\n" +
            "2、下周计划\n" +
            "- 培训ppt的准备\n" +
            "- 其他项目安排的测试工作";

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
