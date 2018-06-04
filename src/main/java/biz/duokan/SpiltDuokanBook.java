package biz.duokan;

import core.util.HTMLUtil;

import java.util.List;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/9/23.
 * Description: 分解字符串插入数据库
 */
public class SpiltDuokanBook {


    public static void main(String[] args) {
        //String favString =
        String favString = "<div class=\"container\">\n" +
                "<div class=\"u-colslist\">\n" +
                "<ul class=\"j-container\"><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/72f4e5069e9c4210b60313ffa99bdd7c\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01ddfZbr797/Vc88bR757nWpo7.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/72f4e5069e9c4210b60313ffa99bdd7c\" class=\"title\" hidefocus=\"hidefocus\">Hadoop应用开发技术详解</a>\n" +
                "<p class=\"u-author\"><span>刘刚</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 30.00</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/8ca630833b5940299f9aac75c539dfcf\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01EKPKYfovb/eUeOWIr5jBv43y.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/8ca630833b5940299f9aac75c539dfcf\" class=\"title\" hidefocus=\"hidefocus\">Hadoop核心技术</a>\n" +
                "<p class=\"u-author\"><span>翟周伟</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1  u-bookitm1-hover\">\n" +
                "<a class=\"book\" href=\"/book/fc57cbce9aab42f694c030bfd983218d\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01kn76SYyb5/IdzLY6CWI5bOJP.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/fc57cbce9aab42f694c030bfd983218d\" class=\"title\" hidefocus=\"hidefocus\">Hadoop基础教程</a>\n" +
                "<p class=\"u-author\"><span>【英】Garry Turkington</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 19.99</em>\n" +
                "\n" +
                "<del>¥ 25.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/33d759a0465e4c8d80dd042f49b30786\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01U3gOgwbRA/OhrQKY9yTyW3qi.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/33d759a0465e4c8d80dd042f49b30786\" class=\"title\" hidefocus=\"hidefocus\">Hadoop应用架构</a>\n" +
                "<p class=\"u-author\"><span>【美】Mark Grover</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 34.99</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/f8d8670b9bfd4979b15463552098d6dc\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p016d2jVwnTm/Xu1sjX9cJRq3Gv.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/f8d8670b9bfd4979b15463552098d6dc\" class=\"title\" hidefocus=\"hidefocus\">Hadoop实战</a>\n" +
                "<p class=\"u-author\"><span>陆嘉恒</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/e2cff6aed6c84e05b300e3e814507112\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01FreCIPUSQ/7Pea6rkQbQXQnU.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/e2cff6aed6c84e05b300e3e814507112\" class=\"title\" hidefocus=\"hidefocus\">Spark大数据处理：原理、算法与实例</a>\n" +
                "<p class=\"u-author\"><span>刘军</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/e351b2b2d4c548ffb28ce857fc192461\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01RifT3EBEG/v70ZXrVcQhEEzT.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/e351b2b2d4c548ffb28ce857fc192461\" class=\"title\" hidefocus=\"hidefocus\">大数据（3.0升级版）</a>\n" +
                "<p class=\"u-author\"><span>涂子沛</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 23.99</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/1c273aacd95d46bdb04695b39dca41c5\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01QXA7CCmj9/CMD9Zo1ilSGn6T.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/1c273aacd95d46bdb04695b39dca41c5\" class=\"title\" hidefocus=\"hidefocus\">白话大数据与机器学习</a>\n" +
                "<p class=\"u-author\"><span>高扬</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/9ec21d1d610542f9b84ba7b7f506e80d\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01rsSc3Mq1L/W8r9QAkyGswOL7.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/9ec21d1d610542f9b84ba7b7f506e80d\" class=\"title\" hidefocus=\"hidefocus\">大数据技术入门</a>\n" +
                "<p class=\"u-author\"><span>杨正洪</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 32.99</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/c78282b1295444ddafee6ab2685db65a\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01RNRrVEoSI/N7rauodnIEivrb.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/c78282b1295444ddafee6ab2685db65a\" class=\"title\" hidefocus=\"hidefocus\">Python网络爬虫实战</a>\n" +
                "<p class=\"u-author\"><span>胡松涛</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 19.99</em>\n" +
                "\n" +
                "<del>¥ 25.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/041c91f4a3f04980afedc9b938f25c38\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p0187C2TBImV/vkr8iS9S5XcHG8.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/041c91f4a3f04980afedc9b938f25c38\" class=\"title\" hidefocus=\"hidefocus\">软技能：代码之外的生存指南</a>\n" +
                "<p class=\"u-author\"><span>【美】John Z. Sonmez</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 30.00</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/58406e3f88034f02afbd2435a55e9a13\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01vekUBTM4q/g4pMIkr6aDDdnT.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/58406e3f88034f02afbd2435a55e9a13\" class=\"title\" hidefocus=\"hidefocus\">垃圾回收的算法与实现</a>\n" +
                "<p class=\"u-author\"><span>【日】中村成洋</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 50.00</em>\n" +
                "\n" +
                "<del>¥ 60.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/861caf4b460d4a62b9e8d10cb5ea786a\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01NkIaQE8S9/zGeMGPvp0xWSBu.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/861caf4b460d4a62b9e8d10cb5ea786a\" class=\"title\" hidefocus=\"hidefocus\">Thymeleaf 3完全手册</a>\n" +
                "<p class=\"u-author\"><span>甘明</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 40.00</em>\n" +
                "\n" +
                "<del>¥ 50.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/2496abbd53ba488295d6476efc2b6f66\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01sJzMOaT3j/3PTxl9Alhfap1O.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/2496abbd53ba488295d6476efc2b6f66\" class=\"title\" hidefocus=\"hidefocus\">JavaScript实战</a>\n" +
                "<p class=\"u-author\"><span>汤东</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 7.99</em>\n" +
                "\n" +
                "<del>¥ 12.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/498284fdb9df4d729220859abd405c58\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01ylDNxdJQb/PtBWhQoDxu5a5X.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/498284fdb9df4d729220859abd405c58\" class=\"title\" hidefocus=\"hidefocus\">威胁建模：设计和交付更安全的软件</a>\n" +
                "<p class=\"u-author\"><span>【美】亚当·斯塔克</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 30.00</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/e648bd7af84b4e36a56049ffc65333df\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01TN2vk06BQ/DdORwk6a4S8ap4.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/e648bd7af84b4e36a56049ffc65333df\" class=\"title\" hidefocus=\"hidefocus\">深入理解网站优化：提升网站转化率的艺术与科学</a>\n" +
                "<p class=\"u-author\"><span>【美】Rich Page</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/f31b959a1d994c79b226057009806207\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01BWCDcdR3D/P4ln42qRj8K1dM.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/f31b959a1d994c79b226057009806207\" class=\"title\" hidefocus=\"hidefocus\">文案大师进阶指南（共四册）</a>\n" +
                "<p class=\"u-author\"><span>【美】约瑟夫·休格曼</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 113.99</em>\n" +
                "\n" +
                "<del>¥ 128.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/ad2df9b0fda94ccf88eb8e2977eca286\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01nD1IqIgCg/n9ViyUmI4a3Xfx.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/ad2df9b0fda94ccf88eb8e2977eca286\" class=\"title\" hidefocus=\"hidefocus\">王小波全集（全十卷）</a>\n" +
                "<p class=\"u-author\"><span>王小波</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 30.00</em>\n" +
                "\n" +
                "<del>¥ 180.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/384248587b2b11e28ba100163e0123ac\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01D44jo118D/hAAuF3ccdHYvMz.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/384248587b2b11e28ba100163e0123ac\" class=\"title\" hidefocus=\"hidefocus\">英雄传说</a>\n" +
                "<p class=\"u-author\"><span>刘建超</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 4.99</em>\n" +
                "\n" +
                "<del>¥ 6.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/683bfd4986fe4aa984c20ace9f0b6f6b\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01sZNp2USt8/J2pTY7McIBzoaL.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/683bfd4986fe4aa984c20ace9f0b6f6b\" class=\"title\" hidefocus=\"hidefocus\">我们的历史（全七册）</a>\n" +
                "<p class=\"u-author\"><span>新历史合作社</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 12.00</em>\n" +
                "\n" +
                "<del>¥ 18.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/45036376afe64827baa60a5142da2130\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01jsi1mYLbj/jQJEtekO7ibb7H.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/45036376afe64827baa60a5142da2130\" class=\"title\" hidefocus=\"hidefocus\">蚂蚁金服：科技金融独角兽的崛起</a>\n" +
                "<p class=\"u-author\"><span>由曦</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 35.99</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/fb492c4551594528a1f7494fa9752e03\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01aHVawQiec/OZuH1tKOvhehZ8.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/fb492c4551594528a1f7494fa9752e03\" class=\"title\" hidefocus=\"hidefocus\">奇货（全八册）</a>\n" +
                "<p class=\"u-author\"><span>唐小豪</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 55.99</em>\n" +
                "\n" +
                "<del>¥ 73.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/3fa6f0c1c2cc422fb25fff6dfc79491b\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01BoldujajO/TjN8Vla1jvS198.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/3fa6f0c1c2cc422fb25fff6dfc79491b\" class=\"title\" hidefocus=\"hidefocus\">Android应用性能优化最佳实践</a>\n" +
                "<p class=\"u-author\"><span>罗彧成</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/86ea9112e23a4d78badb3792bc1fa389\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01SN2XynmKb/ND1VUWI1HjrWW6.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/86ea9112e23a4d78badb3792bc1fa389\" class=\"title\" hidefocus=\"hidefocus\">Java性能权威指南</a>\n" +
                "<p class=\"u-author\"><span>【美】Scott Oaks</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 40.00</em>\n" +
                "\n" +
                "<del>¥ 60.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/f3259996ec0342f4a88149936504529c\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01r0USFCICb/UbBK6eMmWAvV8A.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/f3259996ec0342f4a88149936504529c\" class=\"title\" hidefocus=\"hidefocus\">Android编程权威指南（第2版）</a>\n" +
                "<p class=\"u-author\"><span>【美】Bill Phillips</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 50.00</em>\n" +
                "\n" +
                "<del>¥ 60.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
                "<a class=\"book\" href=\"/book/3b90998edc4f436c947abf374d76f0fd\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01WpUuSLpN6/eTQoQ5bSC5vulL.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/3b90998edc4f436c947abf374d76f0fd\" class=\"title\" hidefocus=\"hidefocus\">Android开发精要</a>\n" +
                "<p class=\"u-author\"><span>范怀宇</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/26b18594d9904e2cba03e827e8035a77\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p0104VEfezSe/E7xFlRJgQnubzC.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/26b18594d9904e2cba03e827e8035a77\" class=\"title\" hidefocus=\"hidefocus\">Orange'S：一个操作系统的实现</a>\n" +
                "<p class=\"u-author\"><span>于渊</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 12.00</em>\n" +
                "\n" +
                "<del>¥ 18.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/21b3481d910d4831a83369de8432fec5\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01JSjGwhpwL/VZKbJOPz4ArTJs.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/21b3481d910d4831a83369de8432fec5\" class=\"title\" hidefocus=\"hidefocus\">破坏之王：DDoS攻击与防范深度剖析</a>\n" +
                "<p class=\"u-author\"><span>鲍旭华</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 18.00</em>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/b2cd55378cee4d9e8143c88cae96ed05\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01wfqljTn0L/hAvEP4H69HeTlr.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/b2cd55378cee4d9e8143c88cae96ed05\" class=\"title\" hidefocus=\"hidefocus\">MongoDB权威指南</a>\n" +
                "<p class=\"u-author\"><span>【美】Kristina Chodorow</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/0d71c373334d41ada932243f264fa179\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p0185mZOwUGE/Jo23RHWLbtJDNX.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/0d71c373334d41ada932243f264fa179\" class=\"title\" hidefocus=\"hidefocus\">通关！游戏设计之道（第2版）</a>\n" +
                "<p class=\"u-author\"><span>【美】Scott Rogers</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 50.00</em>\n" +
                "\n" +
                "<del>¥ 60.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/3f3e520deda14f1a947a59d30ce9b7bb\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01JZvFOEUcm/iw1jPdhcQk2ilU.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/3f3e520deda14f1a947a59d30ce9b7bb\" class=\"title\" hidefocus=\"hidefocus\">决胜UX：互联网产品用户体验策略</a>\n" +
                "<p class=\"u-author\"><span>【美】Jaime Levy</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 30.00</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/fbd041c463294d8cbd261075b0a6b85f\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p015u66yHKzh/PDrRvegd8QtxCt.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/fbd041c463294d8cbd261075b0a6b85f\" class=\"title\" hidefocus=\"hidefocus\">Java 8实战</a>\n" +
                "<p class=\"u-author\"><span>【英】Raoul-Gabriel Urma</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 40.00</em>\n" +
                "\n" +
                "<del>¥ 50.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/f8e582900c474beb88c10afae0f248f3\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01YYQyaFyFP/qzxiWpMjiB2vlw.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/f8e582900c474beb88c10afae0f248f3\" class=\"title\" hidefocus=\"hidefocus\">黑客攻防技术宝典：浏览器实战篇</a>\n" +
                "<p class=\"u-author\"><span>【澳】Wade Alcorn</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 54.99</em>\n" +
                "\n" +
                "<del>¥ 73.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/4d79615c057545538c6bf4d0bb79780c\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01Fq7EvioMV/5H0T9xo5UxFwSU.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/4d79615c057545538c6bf4d0bb79780c\" class=\"title\" hidefocus=\"hidefocus\">MySQL与MariaDB学习指南</a>\n" +
                "<p class=\"u-author\"><span>【美】Russell J.T.Dyer</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 40.00</em>\n" +
                "\n" +
                "<del>¥ 50.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/b746097c8acf4164b548f2ca93877291\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01mzBocDgGB/bC51vuYxMgLXPU.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/b746097c8acf4164b548f2ca93877291\" class=\"title\" hidefocus=\"hidefocus\">高性能Android应用开发</a>\n" +
                "<p class=\"u-author\"><span>【美】Doug Sillars</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 30.00</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/5efd94da5c13426ca518b7988857f56c\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p015hcmqYknb/4TtMzmeSqAAk0I.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/5efd94da5c13426ca518b7988857f56c\" class=\"title\" hidefocus=\"hidefocus\">终极算法：机器学习和人工智能如何重塑世界</a>\n" +
                "<p class=\"u-author\"><span>【美】佩德罗·多明戈斯</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 40.99</em>\n" +
                "\n" +
                "<del>¥ 50.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/a144dcdeba1946d584dbf8b03a8dac2f\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01zNkrwtZRK/Frh5L4Dw0H1lCv.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/a144dcdeba1946d584dbf8b03a8dac2f\" class=\"title\" hidefocus=\"hidefocus\">速度与激情：以网站性能提升用户体验</a>\n" +
                "<p class=\"u-author\"><span>【美】Lara Callender Hogan</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/8a9ab51cd67c4a91b2509256cf289bbc\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01YUdAaHb5q/Im3NzjZoYP4ZoE.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/8a9ab51cd67c4a91b2509256cf289bbc\" class=\"title\" hidefocus=\"hidefocus\">Linux命令行与shell脚本编程大全（第3版）</a>\n" +
                "<p class=\"u-author\"><span>【美】Ricahard Blum</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 54.99</em>\n" +
                "\n" +
                "<del>¥ 73.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/06ef1daca64741f0ac11d23e1baad827\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p0154vEtd1x2/9Dp3ZJoOYEA95k.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/06ef1daca64741f0ac11d23e1baad827\" class=\"title\" hidefocus=\"hidefocus\">进化：从孤胆极客到高效团队</a>\n" +
                "<p class=\"u-author\"><span>【美】布莱恩.菲茨帕特里克</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 22.99</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/129d7ed9019c4ba68de8ed0caf241484\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01ixd3F0tDl/6v2VVaLFT7TFju.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/129d7ed9019c4ba68de8ed0caf241484\" class=\"title\" hidefocus=\"hidefocus\">解析顶层设计</a>\n" +
                "<p class=\"u-author\"><span>曾迪琰</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 14.99</em>\n" +
                "\n" +
                "<del>¥ 18.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/8bc6a107a17442bba51d152c9a211621\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01DdKheVgnv/fIihgIDJ8HX7T5.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/8bc6a107a17442bba51d152c9a211621\" class=\"title\" hidefocus=\"hidefocus\">Spring Boot实战</a>\n" +
                "<p class=\"u-author\"><span>【美】Craig Walls</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 30.00</em>\n" +
                "\n" +
                "<del>¥ 40.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/70c84d7f2d654d8587e3104fff2dcbe9\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01NJSbuVrch/7Ure78LoADmOC4.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/70c84d7f2d654d8587e3104fff2dcbe9\" class=\"title\" hidefocus=\"hidefocus\">Spark最佳实践</a>\n" +
                "<p class=\"u-author\"><span>陈欢</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/096b1597125b4e6ca05c9c5674de76c8\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01gRBCps87l/XF0fOgrJpYM5TO.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/096b1597125b4e6ca05c9c5674de76c8\" class=\"title\" hidefocus=\"hidefocus\">程序员第二步：从程序员到项目经理</a>\n" +
                "<p class=\"u-author\"><span>尹华山</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 18.00</em>\n" +
                "\n" +
                "<del>¥ 25.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/92ac1cb6c00a4774ae75b3ab01d31992\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01ngR1z1YTm/0TcIuj5ECfegeX.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/92ac1cb6c00a4774ae75b3ab01d31992\" class=\"title\" hidefocus=\"hidefocus\">干净的数据：数据清洗入门与实践</a>\n" +
                "<p class=\"u-author\"><span>【美】Megan Squire</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 25.00</em>\n" +
                "\n" +
                "<del>¥ 30.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/29e4ecd685c844f0b996b767f7a25c51\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01OjSQIkaBb/AON0Vp4WeXTHuz.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/29e4ecd685c844f0b996b767f7a25c51\" class=\"title\" hidefocus=\"hidefocus\">CSS揭秘</a>\n" +
                "<p class=\"u-author\"><span>【希】韦鲁</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 50.00</em>\n" +
                "\n" +
                "<del>¥ 60.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/48cb0c3574c2459abe1c6d91db1841d2\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01sIpjuTDsd/SHCJENr9fE7b0D.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/48cb0c3574c2459abe1c6d91db1841d2\" class=\"title\" hidefocus=\"hidefocus\">自制编译器</a>\n" +
                "<p class=\"u-author\"><span>【日】青木峰郎</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 50.00</em>\n" +
                "\n" +
                "<del>¥ 60.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/7f380a03336b40ff981b3ea8d7181906\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01dYFShiRrS/Nz0o7uXHvqoujm.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/7f380a03336b40ff981b3ea8d7181906\" class=\"title\" hidefocus=\"hidefocus\">JSON必知必会</a>\n" +
                "<p class=\"u-author\"><span>【美】Lindsay Bassett</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 18.00</em>\n" +
                "\n" +
                "<del>¥ 25.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
                "<a class=\"book\" href=\"/book/74c43c07f9ae460785c299cc477004cf\" hidefocus=\"hidefocus\">\n" +
                "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01U9g7MMd5g/XP1JFuBZYiC45Q.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
                "\n" +
                "</a>\n" +
                "<div class=\"info\">\n" +
                "<div class=\"wrap\">\n" +
                "<a href=\"/book/74c43c07f9ae460785c299cc477004cf\" class=\"title\" hidefocus=\"hidefocus\">HTML5与WebGL编程</a>\n" +
                "<p class=\"u-author\"><span>【美】Tony Parisi</span></p>\n" +
                "\n" +
                "<div class=\"u-price\">\n" +
                "\n" +
                "<em>¥ 40.00</em>\n" +
                "\n" +
                "<del>¥ 50.00</del>\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<div class=\"act\">\n" +
                "<a class=\"j-delete delete\" href=\"javascript:void(0);\" hidefocus=\"hidefocus\">取消收藏</a>\n" +
                "\n" +
                "<span class=\"u-sep\">|</span>\n" +
                "\n" +
                "\n" +
                "<a href=\"javascript:void(0)\" class=\"j-cart\" hidefocus=\"hidefocus\">加入购物车</a><span style=\"display:none\">已加入购物车</span>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"mask j-mask\">\n" +
                "<div class=\"u-mask1\"></div>\n" +
                "<a class=\"show -showfav j-restore\" href=\"javascript:void(0)\" hidefocus=\"hidefocus\">恢复收藏</a>\n" +
                "</div>\n" +
                "</li></ul>\n" +
                "</div>\n" +
                "</div>";

        favString=favString.replaceAll("\n", "").replaceAll("\r", "");
        List<String> patternString = HTMLUtil.getPatternString(favString, "<a href=\"/book/.*?</a>");

        for (String bookString : patternString) {
            //System.out.println(bookString);

            String id = HTMLUtil.getBetweenString(bookString, "href=\"/book/", "\" class=");
            String name = HTMLUtil.getBetweenString(bookString, "hidefocus\">", "</a>");
            SearchDuokanBookIntoDB.storeBook(id, name,"收藏夹",2);
        }


    }


}
