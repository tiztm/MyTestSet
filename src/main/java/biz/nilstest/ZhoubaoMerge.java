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

    private static String zhoubaoStr =  "\n" +
            "2018-06-25周报\n" +
            "\n" +
            "由 张天明1 在 一分钟内 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "\n" +
            "- 文档检查\n" +
            "- 统计上线项目清单且确定石河子工作量文档\n" +
            "- 面试6人\n" +
            "- 外勤党建问题解决\n" +
            "- 制定组件纳入规范并与定制化组会议确认\n" +
            "- 确定代码开发规范\n" +
            "- 研发流行的开发框架并对开发平台5.0测试，发送优化意见\n" +
            "\n" +
            "2、下周计划\n" +
            "- 制作基于阿里规则的SONAR插件\n" +
            "- 制作优化的Tomcat8\n" +
            "- 与电信业务部门交流前端开发技术\n" +
            "- 面试工作\n" +
            "- 安监项目产品版本框架搭建\n" +
            "- 新大学生项目\n" +
            "\n" +
            "2018-06-25周报\n" +
            "\n" +
            "由 张同锐 在 25 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 宜地先锋图标修改、网站banner图、app banner图、建党节加载页面制作；\n" +
            "- 江苏省教育厅纪检监察管理平台登录页背景图修改；\n" +
            "- 辅助园区安监政务信息公开页面设计；\n" +
            "- 智慧安监产品 概念设计汇报 评审\n" +
            "\n" +
            "2、下周计划\n" +
            "- 园区安监政务信息公开页面设计；\n" +
            "- 监狱项目 信息架构评审、交互设计等\n" +
            "\n" +
            "2018-06-25 周报\n" +
            "\n" +
            "由 马燕 在 32 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 辽宁省司法厅人民调解平台手机端测试和问题回归\n" +
            "- 智慧社区综合信息管理与服务平台部分事项测试\n" +
            "\n" +
            "2、下周计划\n" +
            "- 智慧社区综合信息管理与服务平台部分事项测试\n" +
            "- 辽宁省司法厅人民调解平台手机端问题回归\n" +
            "\n" +
            "2018-06-25 周报\n" +
            "\n" +
            "由 方王芳 在 37 分钟 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 【定制化组】收费处外网申报系统验证界面设计，修改图片\n" +
            "- 【社区组】镇江智慧平望大数据指挥中心 图片修改\n" +
            "- 【外勤组】宜地先锋党建配图标，图标修改等\n" +
            "- 【苏州组】苏州工业园区档案管理中心信息化项目 界面需求沟通 出差\n" +
            "- 【苏州组】园区安监政务信息公开 需求沟通及设计\n" +
            "- 【地税安监组】智慧安监产品 概念设计汇报 评审\n" +
            "\n" +
            "2、下周计划\n" +
            "- 【苏州组】园区安监政务信息公开设计及HTML\n" +
            "- 【苏州组】苏州工业园区档案管理中心信息化项目 去某局参观学习（界面）\n" +
            "- 【司法组】监狱项目 信息架构评审、交互设计等 \n" +
            "- 【书法协会】海报 设计\n" +
            "\n" +
            "2018-06-25 周报\n" +
            "\n" +
            "由 许巧丹 在 大约一小时 之前添加\n" +
            "\n" +
            "1、本周工作\n" +
            "- 人社局劳动就业和社保卡对接的事项测试\n" +
            "- 线上文档检查\n" +
            "\n" +
            "2、下周计划\n" +
            "- 人社局劳动就业和社保卡对接的事项测试";

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
