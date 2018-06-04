package biz.duokan.utils;

import biz.duokan.entity.PageEntity;
import core.util.HTMLUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/21.
 */
public class splitCataHTML {


    public static void main(String[] args) {

        String html = "<div class=\"rd_dirct\"><ul class=\"nav nav-list\"><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"2\" page_to=\"2\">版权信息<span>2</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"4\" page_to=\"4\">科 学<span>4</span></a><ul class=\"nav nav-list\"><li class=\"final active\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"5\" page_to=\"26\">面对人工智能，我们在担心什么？<span>5</span></a></li></ul></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"27\" page_to=\"27\">银河奖征文<span>27</span></a><ul class=\"nav nav-list\"><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"28\" page_to=\"46\">奇 点<span>28</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"47\" page_to=\"78\">哪 吒<span>47</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"79\" page_to=\"93\">生命的河<span>79</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"94\" page_to=\"111\">羞 耻<span>94</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"112\" page_to=\"134\">弈<span>112</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"135\" page_to=\"151\">仰光在燃烧<span>135</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"152\" page_to=\"168\">天堂的黄昏<span>152</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"169\" page_to=\"184\">你是人，还是机器？<span>169</span></a></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"185\" page_to=\"194\">人类最后的钟声为谁而鸣？<span>185</span></a></li><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"195\" page_to=\"204\">卖花的男孩<span>195</span></a></li></ul></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"205\" page_to=\"205\">世界科幻<span>205</span></a><ul class=\"nav nav-list\"><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"206\" page_to=\"224\">莫克森的主人<span>206</span></a></li><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"225\" page_to=\"246\">由“恐惧谷”到“恍惚峰”——及其政策面的应用<span>225</span></a></li></ul></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"247\" page_to=\"247\">惊奇档案<span>247</span></a><ul class=\"nav nav-list\"><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"248\" page_to=\"267\">换个角度看A.I.——动漫里的人工智能<span>248</span></a></li><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"268\" page_to=\"282\">硅碳之争<span>268</span></a></li></ul></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"283\" page_to=\"283\">不存在日报<span>283</span></a><ul class=\"nav nav-list\"><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"284\" page_to=\"296\">作弊机<span>284</span></a></li></ul></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"297\" page_to=\"297\">校园之星<span>297</span></a><ul class=\"nav nav-list\"><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"298\" page_to=\"310\">答 案<span>298</span></a></li></ul></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"311\" page_to=\"311\">科幻学徒笔记<span>311</span></a><ul class=\"nav nav-list\"><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"312\" page_to=\"324\">现实和幻想的复调——拉美科幻初探<span>312</span></a></li></ul></li><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"325\" page_to=\"325\">科幻杂谈<span>325</span></a><ul class=\"nav nav-list\"><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"326\" page_to=\"335\">弈棋不足惧，叙事最危险——科幻人士漫谈AlphaGo大破李世石<span>326</span></a></li></ul></li><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"336\" page_to=\"336\">回声<span>336</span></a><ul class=\"nav nav-list\"><li><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"337\" page_to=\"347\">27届银河奖·最佳封面脑洞化<span>337</span></a></li><li class=\"final\"><a class=\"j-itm\" href=\"javascript:void(0)\" page_from=\"348\" page_to=\"356\">“AlphaGo” VS. 李世石，Fight！<span>348</span></a></li></ul></li></ul></div>";


        PageEntity pageEntity = splitHTML(html);

    }

    public static PageEntity splitHTML(String html) {

        //最多五级
        PageEntity[] rootEntity = {new PageEntity("root"),null,null,null,null};

        PageEntity curParentPage = rootEntity[0];

        List<PageEntity> pageEntityList = new ArrayList<>();
        List<String> patternString = HTMLUtil.getPatternString( html,"age_to.*?a>");

        for (String s : patternString) {




            String name = HTMLUtil.getBetweenString(s, "\">", "<sp");
            String page = HTMLUtil.getBetweenString(s, "n>", "</spa");
            Integer pageInt = 0;
            pageInt = Integer.parseInt(page);

            PageEntity curpage = new PageEntity(name);
            curpage.setNum(pageInt);


            //if(name.contains(".")) name = "    "+name;
            int blank = (name.substring(0,(name.length()>11?10:name.length())).split("\\.")).length-1;


            curParentPage = rootEntity[blank];

            curpage.setParent(curParentPage);

            rootEntity[blank+1] = curpage;

            pageEntityList.add(curpage);


            //System.out.println(name+" ---- "+page);


        }

        for (PageEntity pageEntity : pageEntityList) {


            PageEntity parent = pageEntity.getParent();
            System.out.println(pageEntity.getName());
            List<PageEntity> peList = parent.getPeList();
            if(peList==null) {
                peList = new ArrayList<>();
                parent.setPeList(peList);
            }

            peList.add(pageEntity);

            //System.out.println(pageEntity.getName()+" -> "+ parent.getName());
        }

        return rootEntity[0];

    }

}
