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

    private static String zhoubaoStr =  "2018-07-16 周报\n" +
            "\n" +
            "由 张天明1 在 一分钟内 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 部门周例会\n" +
            "- 面试5人\n" +
            "- 开发平台4.x 工作流整合\n" +
            "- 运维简历筛选\n" +
            "- 文档检查系统调整，6月文档要求\n" +
            "- TensorFlow功能学习\n" +
            "- 石河子项目规划会议，及任务分派\n" +
            "- TensorFlow了解及环境搭建\n" +
            "- 质量周报设计\n" +
            "- 司法项目开工会议\n" +
            "- 各组问题解决\n" +
            "\n" +
            "2、下周计划\n" +
            "- 运维面试\n" +
            "- 开发平台 Swagger整合\n" +
            "- 5.0 升级演练\n" +
            "- 实习生工作\n" +
            "- 质量周报,整理最新的质量周报模版及定时执行，开发按组统计Redmine,Jira功能\n" +
            "\n" +
            "2018-07-16周报\n" +
            "\n" +
            "由 张同锐 在 28 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 辽宁省司法行政系统综合管理信息平台编写HTML \n" +
            "- 学习了解echarts图表在html的嵌入方法\n" +
            "- 新区安监APP界面、图标设计和切图\n" +
            "- 整理常用的一些关于图标和图片素材的网站\n" +
            "- 苏州高新开发区大安全管理平台图标制作\n" +
            "- 定制化组所需图标制作\n" +
            "- 外勤组江苏财经职业技术学院banner制作\n" +
            "- 协助其他组制作一些零碎图标\n" +
            "\n" +
            "2、下周计划\n" +
            "研究学习前端知识。\n" +
            "\n" +
            "2018-07-16周报\n" +
            "\n" +
            "由 方王芳 在 大约 2 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 【司法组】辽宁省司法行政系统综合管理信息平台编写HTML \n" +
            "- 【指导】echarts图表的应用、属性修改增加等\n" +
            "- 【定制化】layChat聊天icon设计\n" +
            "- 【外勤组】配图标\n" +
            "- 【社区组】坐席工位增加，样式调整、弹窗样式\n" +
            "- 【苏州组】新区安监 改版界面设计\n" +
            "- 【苏州组】苏州高新产业技术开发区安全大联动管理平台 主界面、应急处理视觉设计\n" +
            "\n" +
            "2、下周计划\n" +
            "- 【苏州组】新区安监 改版界面设计 UCD复测\n" +
            "- 【苏州组】layChat UCD复测\n" +
            "- 研究flex布局、建立echarts图表库\n" +
            "\n" +
            "2018-07-16 周报\n" +
            "\n" +
            "由 马燕 在 大约 2 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 参与交通基地车管专家平台告警日志处理模块性能测试\n" +
            "- 智慧社区综合信息管理与服务平台民政相关模块测试\n" +
            "- jmeter学习\n" +
            "\n" +
            "2、下周计划\n" +
            "- 智慧社区综合信息管理与服务平台民政相关模块测试问题回归\n" +
            "\n" +
            "2018-07-16 周报\n" +
            "\n" +
            "由 许巧丹 在 大约 2 小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 交通基地车管专家平台告警日志处理模块性能测试\n" +
            "- 编写白银检务通的测试报告\n" +
            "- 线上文档检查（来宾、苏州司法项目）\n" +
            "\n" +
            "2、下周计划\n" +
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
