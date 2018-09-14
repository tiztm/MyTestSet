package biz;

import core.util.HTMLUtil;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2018/1/18.
 */
public class MailResize {

    private static String mailAdrList = "\"聂彦岭\" \"18951603140@189.cn\", \"齐旭峰\" \"18963603554@189.cn\", \"孙开文\" \"18112998218@189.cn\", \"沈权\" \"15366181347@189.cn\", \"史秋磊\" \"15366181472@189.cn\", \"王鼎乙然\" \"17798502621@189.cn\", \"王峰\" \"18951607240@189.cn\", \"吴刚\" \"17798502782@189.cn\", \"伍宏杰\" \"15366181473@189.cn\", \"王鹏程\" \"18963609578@189.cn\", \"王巍\" \"15366181462@189.cn\", \"王贤豪\" \"18963603549@189.cn\", \"王晓克\" \"18963603527@189.cn\", \"许巧丹\" \"18963609575@189.cn\", \"徐瑞\" \"15366181443@189.cn\", \"许涛\" \"18951607226@189.cn\", \"邢学新\" \"18036810161@189.cn\", \"杨海涛\" \"18112998271@189.cn\", \"杨明\" \"18951607256@189.cn\", \"杨楠\" \"18951603147@189.cn\", \"严树炜\" \"18915500522@189.cn\", \"于文龙\" \"15366181376@189.cn\", \"张奥军\" \"18951607281@189.cn\", \"张爱萍\" \"15301586319@189.cn\", \"周彬\" \"18962106809@189.cn\", \"周二玄\" \"18115120556@189.cn\", \"张汉侗\" \"15366181353@189.cn\", \"朱弘威\" \"15366181437@189.cn\", \"周明\" \"18951603177@189.cn\", \"张天明\" \"15301586334@189.cn\", \"张同锐\" \"18963609573@189.cn\", \"赵通玉\" \"18951603149@189.cn\", \"朱益\" \"17798502609@189.cn\", \"朱宇\" \"18915982315@189.cn\", \"张月飞\" \"15366181404@189.cn\", \"周云琳\" \"18963609582@189.cn\", \"张政\" \"17798502632@189.cn\"\n"+
            "白轩丞<15366181325@189.cn>,   卞相权<18915982391@189.cn>,   陈诚<18963603535@189.cn>,   陈坚<15366181467@189.cn>,   陈建2<17798502682@189.cn>,   曹铭毅<15366181461@189.cn>,   陈琦<18915898021@189.cn>,   程全芳<18963609567@189.cn>,   陈天智<17312623682@189.cn>,   陈雪霖<15366181452@189.cn>,  范恩川<18963603575@189.cn>,   方王芳<18963609579@189.cn>,   郭宝岛<15366180054@189.cn>,   郭亚东<1515886175@qq.com>,   黄健雄<15366181431@189.cn>,   杭凯<18951603152@189.cn>,   花磊<18951603118@189.cn>,   侯威<17798502771@189.cn>,   胡志忠<17798502697@189.cn>,   姜东<18963603566@189.cn>,   鞠晖<18951603148@189.cn>,   金龙<18915982318@189.cn>,   金晓东<15366181363@189.cn>,   敬习飞<18951603167@189.cn>,   康书恒<18963603505@189.cn>,   寇万宝<18951607228@189.cn>,   梁何<15366189518@189.cn>,   李华<15301586364@189.cn>,   罗进<15301586743@189.cn>,   李俊宇<15366181379@189.cn>,   李路<15366181463@189.cn>,   路朋恒<17798502702@189.cn>,   陆婷<18036810195@189.cn>,   陆阳洋<18115561189@189.cn>,   骆媛媛<17798502601@189.cn>,   马燕<18963603569@189.cn>,   毛颖飞<13382772775@189.cn>\n";


    public static void main(String[] args) {
        String[] split = mailAdrList.split(",");
        int i  = 1;
        for (String s : split) {
                //s=  s.replaceAll("\"","");
            String trim = s.trim();
            String betweenString = HTMLUtil.getBetweenString(trim, "<", ">");
            if(betweenString.length()<1)
            {
                 betweenString = HTMLUtil.getBetweenString(trim, " \"", "\"");
            }
            System.out.print(betweenString+",");
            i++;
        }

        System.out.print(i);
    }
}