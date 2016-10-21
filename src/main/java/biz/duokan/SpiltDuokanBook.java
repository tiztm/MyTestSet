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

    public static String favString = "<div class=\"container\">\n" +
            "<div class=\"u-colslist\">\n" +
            "<ul class=\"j-container\"><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
            "<a class=\"book\" href=\"/book/ac1c994c687c432785cea37691a9bc6b\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01SyvZIjm0M/cSuPwVr4FDvPsF.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/ac1c994c687c432785cea37691a9bc6b\" class=\"title\" hidefocus=\"hidefocus\">HTML 5网页开发实例详解</a>\n" +
            "<p class=\"u-author\"><span>周遥</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 45.00</em>\n" +
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
            "<a class=\"book\" href=\"/book/8e1e129d96ed48b1a1259fa7519cf1d5\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01GW1mVC9i5/nJxI69m95Lp01v.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/8e1e129d96ed48b1a1259fa7519cf1d5\" class=\"title\" hidefocus=\"hidefocus\">移动优先与响应式Web设计(2册)</a>\n" +
            "<p class=\"u-author\"><span>【美】Luke Wroblewski</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/ab4175a9fba643cc9cb6921f99bb0718\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01psqnmDkNm/NvPz4ctN9CLO9c.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/ab4175a9fba643cc9cb6921f99bb0718\" class=\"title\" hidefocus=\"hidefocus\">Bootstrap实战</a>\n" +
            "<p class=\"u-author\"><span>【美】David Cochran</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/e64a2861d02a4034ad81a3228f889570\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01y80MvsJZy/xMINI2ohfyD9Us.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/e64a2861d02a4034ad81a3228f889570\" class=\"title\" hidefocus=\"hidefocus\">学习响应式设计</a>\n" +
            "<p class=\"u-author\"><span>Clarissa Peterson</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 34.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/3499f2c38aae4f4f87d4feee63ff6d14\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p011gBgEmUWR/cpN0vA6LPgh6aB.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/3499f2c38aae4f4f87d4feee63ff6d14\" class=\"title\" hidefocus=\"hidefocus\">HTML5秘籍（第2版）</a>\n" +
            "<p class=\"u-author\"><span>【美】Matthew MacDonald</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 45.00</em>\n" +
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
            "<a class=\"book\" href=\"/book/ac2f1f96773b4a9f93691072587c7449\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p012wbojkOJC/KyeAob667NyS5M.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/ac2f1f96773b4a9f93691072587c7449\" class=\"title\" hidefocus=\"hidefocus\">超体验：BAT格局下的京东崛起</a>\n" +
            "<p class=\"u-author\"><span>苏醒，柴文静，黄璠</span></p>\n" +
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
            "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
            "<a class=\"book\" href=\"/book/328b750a98dd4be7b2d986f897c045c3\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01aVENeTiIH/cNSJcECzHC1Rde.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/328b750a98dd4be7b2d986f897c045c3\" class=\"title\" hidefocus=\"hidefocus\">淘宝创业内幕</a>\n" +
            "<p class=\"u-author\"><span>周俊宏</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/f4b31f15ebbf414a86c6f7ea8c48267f\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01y4xc5Wp6e/VrlywOBFcqyXpu.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/f4b31f15ebbf414a86c6f7ea8c48267f\" class=\"title\" hidefocus=\"hidefocus\">淘宝技术这十年</a>\n" +
            "<p class=\"u-author\"><span>子柳</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 8.99</em>\n" +
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
            "</li><li class=\"u-bookitm1 u-bookitm1-1\">\n" +
            "<a class=\"book\" href=\"/book/e2830b35a4bc4a17910c806845723ef4\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01O8zHWkxY7/osdD23Gw8B3tEB.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/e2830b35a4bc4a17910c806845723ef4\" class=\"title\" hidefocus=\"hidefocus\">IBM认知计算与人工智能</a>\n" +
            "<p class=\"u-author\"><span>IBM商业价值研究院</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 14.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/e7c3f41c56294254ba516ca3fd4ba296\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01NJtqGr9XP/ky3eQTEXmdbWL5.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/e7c3f41c56294254ba516ca3fd4ba296\" class=\"title\" hidefocus=\"hidefocus\">Objective-C编程（第2版）</a>\n" +
            "<p class=\"u-author\"><span>【美】Aaron Hillegass</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/39e315d4c2214368a3a49d261f695166\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01Daawh27Tm/XFxxFgcX6Li0M3.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/39e315d4c2214368a3a49d261f695166\" class=\"title\" hidefocus=\"hidefocus\">HTTP权威指南</a>\n" +
            "<p class=\"u-author\"><span>【美】David Gourley</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 60.00</em>\n" +
            "\n" +
            "<del>¥ 68.00</del>\n" +
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
            "<a class=\"book\" href=\"/book/b1ae4e3c8550449a8b9cba554f7f4698\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01vACiWnPWF/T8gAsXN9m2oUTE.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/b1ae4e3c8550449a8b9cba554f7f4698\" class=\"title\" hidefocus=\"hidefocus\">安珀志（全10册）</a>\n" +
            "<p class=\"u-author\"><span>【美】罗杰·泽拉兹尼</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 148.00</em>\n" +
            "\n" +
            "<del>¥ 198.00</del>\n" +
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
            "<a class=\"book\" href=\"/book/c0ec68797fc24a1c9ac27fdc84bab830\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01rmIHkyoKK/RovBDiSAalyV5x.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/c0ec68797fc24a1c9ac27fdc84bab830\" class=\"title\" hidefocus=\"hidefocus\">深入浅出MySQL：数据库开发、优化与管理维护(第2版)</a>\n" +
            "<p class=\"u-author\"><span>唐汉明</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 58.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/32df5a99ebb048dfa1093aa3c18e5b7f\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01uvp3vAHuw/vhqNmpffrPbWMf.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/32df5a99ebb048dfa1093aa3c18e5b7f\" class=\"title\" hidefocus=\"hidefocus\">SEO实战密码：60天网站流量提高20倍（第3版）</a>\n" +
            "<p class=\"u-author\"><span>昝辉</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 30.99</em>\n" +
            "\n" +
            "<del>¥ 88.00</del>\n" +
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
            "<a class=\"book\" href=\"/book/80fecfc9b87442f5aee542b6e5461a53\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01FGp0j3wF2/sNCkh8KI7LjAxj.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/80fecfc9b87442f5aee542b6e5461a53\" class=\"title\" hidefocus=\"hidefocus\">MySQL技术内幕（第4版）</a>\n" +
            "<p class=\"u-author\"><span>【美】Paul DuBois</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 68.00</em>\n" +
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
            "<a class=\"book\" href=\"/book/8e72879519884736a009d2ee7307b1b6\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p018Jtjwf5HC/by4qiu5Jt7oKAV.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/8e72879519884736a009d2ee7307b1b6\" class=\"title\" hidefocus=\"hidefocus\">深入Linux内核架构</a>\n" +
            "<p class=\"u-author\"><span>【德】莫尔勒</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 78.00</em>\n" +
            "\n" +
            "<del>¥ 88.00</del>\n" +
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
            "<a class=\"book\" href=\"/book/a9d30517222d4df397a746c7ab63c06b\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01sF5hBIGgZ/znLRt9sfewQ7zv.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/a9d30517222d4df397a746c7ab63c06b\" class=\"title\" hidefocus=\"hidefocus\">Oracle数据库性能优化方法论和最佳实践</a>\n" +
            "<p class=\"u-author\"><span>柳遵梁</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/e3d00ef2d05541af9d4b054fca765257\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p017i98k5Vf0/RERSdKeHJDyvHD.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/e3d00ef2d05541af9d4b054fca765257\" class=\"title\" hidefocus=\"hidefocus\">感悟Oracle核心技术</a>\n" +
            "<p class=\"u-author\"><span>罗敏</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 41.99</em>\n" +
            "\n" +
            "<del>¥ 45.00</del>\n" +
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
            "<a class=\"book\" href=\"/book/aa38bc561b2b4bb28036dc210d4b9b2f\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p013zu9GRow0/3tE8kXlMyDL7tZ.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/aa38bc561b2b4bb28036dc210d4b9b2f\" class=\"title\" hidefocus=\"hidefocus\">深入理解Bootstrap</a>\n" +
            "<p class=\"u-author\"><span>徐涛</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 30.00</em>\n" +
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
            "<a class=\"book\" href=\"/book/5c890b8999514a6a81e0d90b30eb7b8d\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01ZqzHreKXu/Ud7XS2TndNrkqy.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/5c890b8999514a6a81e0d90b30eb7b8d\" class=\"title\" hidefocus=\"hidefocus\">jQuery技术内幕：深入解析jQuery架构设计与实现原理</a>\n" +
            "<p class=\"u-author\"><span>高云</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 18.00</em>\n" +
            "\n" +
            "<del>¥ 45.00</del>\n" +
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
            "<a class=\"book\" href=\"/book/1dac6438b3a34be2a56b3b21d47ae514\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p013RLOCv3IC/SumfPJiuvVXGsn.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/1dac6438b3a34be2a56b3b21d47ae514\" class=\"title\" hidefocus=\"hidefocus\">编写可读代码的艺术</a>\n" +
            "<p class=\"u-author\"><span>【美】Dustin Boswell</span></p>\n" +
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
            "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
            "<a class=\"book\" href=\"/book/1e791646ab36497f9e76213f7fe060ab\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01fdTJff6x4/KgjHqCMeMOQRZs.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/1e791646ab36497f9e76213f7fe060ab\" class=\"title\" hidefocus=\"hidefocus\">这就是台湾，这才是台湾</a>\n" +
            "<p class=\"u-author\"><span>廖信忠</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 13.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/a77de5d36d254fe384d4b9ebd07fd7a3\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01kD58qVQWU/vFVWtCczA5DX91.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/a77de5d36d254fe384d4b9ebd07fd7a3\" class=\"title\" hidefocus=\"hidefocus\">实录毛泽东 3（1945-1956）</a>\n" +
            "<p class=\"u-author\"><span>李捷</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/a88775d26a804f07a215bd753f86b8a2\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01eXzGtBtR1/VqiCXYDqQzamNv.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/a88775d26a804f07a215bd753f86b8a2\" class=\"title\" hidefocus=\"hidefocus\">若星汉天空</a>\n" +
            "<p class=\"u-author\"><span>今何在</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 3.99</em>\n" +
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
            "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
            "<a class=\"book\" href=\"/book/77100d127ad840a4a7cae02c8ef252e1\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01EdJKQCAXz/Lmiclnhs4YQ6cc.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/77100d127ad840a4a7cae02c8ef252e1\" class=\"title\" hidefocus=\"hidefocus\">史上最强日本史（全三册）</a>\n" +
            "<p class=\"u-author\"><span>樱雪丸</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/38a3a318a7bf4522aafbd4ed06a8a3d9\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01ZAefeKfGD/b6ooE3dxZmFdDv.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/38a3a318a7bf4522aafbd4ed06a8a3d9\" class=\"title\" hidefocus=\"hidefocus\">在难搞的日子笑出声来</a>\n" +
            "<p class=\"u-author\"><span>大鹏</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 4.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/61401a960c7d4a66a9f1db52471516b2\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01kjcXtNMBj/mTLqiTrZgTzgZc.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/61401a960c7d4a66a9f1db52471516b2\" class=\"title\" hidefocus=\"hidefocus\">费马大定理：一个困惑了世间智者358年的谜</a>\n" +
            "<p class=\"u-author\"><span>【英】西蒙·辛格(Simon Singh)</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 15.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/503f904218b54f46951637ff647d078a\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01PhAXX0Vp3/9lDGaIcLA57XyB.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/503f904218b54f46951637ff647d078a\" class=\"title\" hidefocus=\"hidefocus\">百科图解枪械知识</a>\n" +
            "<p class=\"u-author\"><span>瀚鼎文化工作室</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 8.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/576bc00c56a4461ab9085e54af01747a\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01qdX5WRfYA/fxqMBOoxjFDKt2.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/576bc00c56a4461ab9085e54af01747a\" class=\"title\" hidefocus=\"hidefocus\">最后的帝国：沉睡的与惊醒的「满洲国」</a>\n" +
            "<p class=\"u-author\"><span>【德】恩斯特·柯德士</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 8.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/4b951f030d3b4eea84d44571eda0d2c7\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01ECFtQac4p/vpaH2kH62q6B3Y.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/4b951f030d3b4eea84d44571eda0d2c7\" class=\"title\" hidefocus=\"hidefocus\">设计冲刺：谷歌风投如何5天完成产品迭代</a>\n" +
            "<p class=\"u-author\"><span>【美】杰克·纳普</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 25.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/d03d793c220f4cafb21cc4199039cd71\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01zfDVoEYIj/9Hh7tvh6NZQdgw.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/d03d793c220f4cafb21cc4199039cd71\" class=\"title\" hidefocus=\"hidefocus\">算法技术手册</a>\n" +
            "<p class=\"u-author\"><span>【美】海涅曼</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/7bf1322897914dc69eeef1214c12f2d5\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01TCrCP6buj/Go8Xkw5gYb4mfK.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/7bf1322897914dc69eeef1214c12f2d5\" class=\"title\" hidefocus=\"hidefocus\">深入理解Android：WebKit卷</a>\n" +
            "<p class=\"u-author\"><span>孟德国</span></p>\n" +
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
            "<span>已加入购物车</span>\n" +
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
            "<a class=\"book\" href=\"/book/1ee082acfbe24cabb9d24cb4c52ab877\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p013p3bhjNsI/4KxvJfuQrsoo9M.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/1ee082acfbe24cabb9d24cb4c52ab877\" class=\"title\" hidefocus=\"hidefocus\">编写高质量代码：改善Java程序的151个建议</a>\n" +
            "<p class=\"u-author\"><span>秦小波</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 18.00</em>\n" +
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
            "<a class=\"book\" href=\"/book/cc92a4e4faf6478382b7589a913452dc\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01LhblIFY9a/qW7p9lhmq4XHFd.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/cc92a4e4faf6478382b7589a913452dc\" class=\"title\" hidefocus=\"hidefocus\">Struts2技术内幕：深入解析Struts2架构设计与实现原理</a>\n" +
            "<p class=\"u-author\"><span>陆舟</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 25.00</em>\n" +
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
            "<a class=\"book\" href=\"/book/76a9d99038f1450dac770c7cfe173b6f\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01Qh2kPEZTa/qY92CcxgqFNeXO.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/76a9d99038f1450dac770c7cfe173b6f\" class=\"title\" hidefocus=\"hidefocus\">看透Spring MVC：源代码分析与实践</a>\n" +
            "<p class=\"u-author\"><span>韩路彪</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/9732db623a5c4e05b802ab0165daa0b4\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01LhSx5Hgdz/fDNPGbDwWnUdcW.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/9732db623a5c4e05b802ab0165daa0b4\" class=\"title\" hidefocus=\"hidefocus\">编写高质量代码：Web前端开发修炼之道</a>\n" +
            "<p class=\"u-author\"><span>曹刘阳</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 1.99</em>\n" +
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
            "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
            "<a class=\"book\" href=\"/book/524a0ecfa51240eca28f1e659d602768\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01lKCyfu48X/KUtwWPRo1CbTqm.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/524a0ecfa51240eca28f1e659d602768\" class=\"title\" hidefocus=\"hidefocus\">Android系统源代码情景分析</a>\n" +
            "<p class=\"u-author\"><span>罗升阳</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 9.99</em>\n" +
            "\n" +
            "<del>¥ 88.00</del>\n" +
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
            "<a class=\"book\" href=\"/book/bf3c05448bf44ac2a24a036391b0db4c\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p016yBo3pHiU/hFYu4qphksHlQR.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/bf3c05448bf44ac2a24a036391b0db4c\" class=\"title\" hidefocus=\"hidefocus\">硬件系统工程师宝典</a>\n" +
            "<p class=\"u-author\"><span>张志伟</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 13.99</em>\n" +
            "\n" +
            "<del>¥ 68.00</del>\n" +
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
            "<a class=\"book\" href=\"/book/82426bfd98b545a28f421c8a31f85e81\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01BR1jI6Vxp/OcM1HZqfethsqe.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/82426bfd98b545a28f421c8a31f85e81\" class=\"title\" hidefocus=\"hidefocus\">边城</a>\n" +
            "<p class=\"u-author\"><span>沈从文</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 6.00</em>\n" +
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
            "<a class=\"book\" href=\"/book/aafa236d0684459cadd681feec7364d4\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01bB5def5tG/mNPHo1nlZhLANo.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/aafa236d0684459cadd681feec7364d4\" class=\"title\" hidefocus=\"hidefocus\">知乎选修课系列（共二册）</a>\n" +
            "<p class=\"u-author\"><span>知乎</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 9.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/9e090f833a884553b3165edc214c7352\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01w1BGZ6BGk/CC5UPXXIIYhWMY.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/9e090f833a884553b3165edc214c7352\" class=\"title\" hidefocus=\"hidefocus\">JavaScript面向对象编程指南</a>\n" +
            "<p class=\"u-author\"><span>【加】Stoyan Stefanov</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/439bd2990a6d48f7b53dc67bc08002b3\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01Vtsnevd1i/MTgJVSxjIthJDQ.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/439bd2990a6d48f7b53dc67bc08002b3\" class=\"title\" hidefocus=\"hidefocus\">JavaScript编程全解</a>\n" +
            "<p class=\"u-author\"><span>【日】井上诚一郎，土江拓郎，滨边将太</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/478661cfaf9c4c05860806e6ea087962\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01sYm2V2RaC/Ck4IEu0X839Jwd.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/478661cfaf9c4c05860806e6ea087962\" class=\"title\" hidefocus=\"hidefocus\">深入理解Java虚拟机：JVM高级特性与最佳实践（第2版）</a>\n" +
            "<p class=\"u-author\"><span>周志明</span></p>\n" +
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
            "<a class=\"book\" href=\"/book/4f870a087c64489d9900366c00052f8b\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01sCmP42Pkg/sRjVHFkXzJl1Nj.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/4f870a087c64489d9900366c00052f8b\" class=\"title\" hidefocus=\"hidefocus\">星巴克：关于咖啡、商业和文化的传奇</a>\n" +
            "<p class=\"u-author\"><span>【美】泰勒·克拉克</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 30.00</em>\n" +
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
            "<a class=\"book\" href=\"/book/9f5bd1a704584467b85e5acb8b62271a\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01ObTx0l3MK/m47jj5RJl0TY76.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/9f5bd1a704584467b85e5acb8b62271a\" class=\"title\" hidefocus=\"hidefocus\">手把手教你开咖啡店</a>\n" +
            "<p class=\"u-author\"><span>陈玉伟</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 1.99</em>\n" +
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
            "<a class=\"book\" href=\"/book/a05ac927cf544108b35c6776479a94db\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/s010/p01lwmWee9Su/RLWIpKsLJUQ1jK.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/a05ac927cf544108b35c6776479a94db\" class=\"title\" hidefocus=\"hidefocus\">星巴克的秘密：咖啡别倒得太满</a>\n" +
            "<p class=\"u-author\"><span>戴维·汤普森 (David Thompson)</span></p>\n" +
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
            "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
            "<a class=\"book\" href=\"/book/26600c33d5be476baf58f78cd8b53b24\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01pj2N4Lgqv/n7OHE3BmT47rSP.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/26600c33d5be476baf58f78cd8b53b24\" class=\"title\" hidefocus=\"hidefocus\">你想在一杯咖啡中喝到什么？（三联生活周刊）</a>\n" +
            "<p class=\"u-author\"><span>三联生活周刊</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 2.99</em>\n" +
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
            "</li><li class=\"u-bookitm1 u-bookitm1-1 \">\n" +
            "<a class=\"book\" href=\"/book/6509e429a2f1413c82601a5d114d80cd\" hidefocus=\"hidefocus\">\n" +
            "<img src=\"http://cover.read.duokan.com/mfsv2/download/fdsc3/p01ZoRLpN6Jg/eU0Qnvy5dQpSXs.jpg!t\" ondragstart=\"return false;\" oncontextmenu=\"return false;\" onload=\"onLoadImg(this)\" style=\"display: block;\">\n" +
            "\n" +
            "</a>\n" +
            "<div class=\"info\">\n" +
            "<div class=\"wrap\">\n" +
            "<a href=\"/book/6509e429a2f1413c82601a5d114d80cd\" class=\"title\" hidefocus=\"hidefocus\">一杯好咖啡的秘密</a>\n" +
            "<p class=\"u-author\"><span>雅趣编辑部</span></p>\n" +
            "\n" +
            "<div class=\"u-price\">\n" +
            "\n" +
            "<em>¥ 2.99</em>\n" +
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
            "</li></ul>\n" +
            "</div>\n" +
            "</div>";


    public static void main(String[] args) {


        favString=favString.replaceAll("\n", "").replaceAll("\r", "");
        List<String> patternString = HTMLUtil.getPatternString(favString, "<a href=\"/book/.*?</a>");

        for (String bookString : patternString) {
            //System.out.println(bookString);

            String id = HTMLUtil.getBetweenString(bookString, "href=\"/book/", "\" class=");
            String name = HTMLUtil.getBetweenString(bookString, "hidefocus\">", "</a>");
            SearchDuokanBookIntoDB.storeBook(id, name,"收藏夹");
        }


    }


}
