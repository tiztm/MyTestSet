package biz.duokan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.List;


import javax.imageio.ImageIO;
import javax.swing.*;


import biz.duokan.utils.DuoKanService;
import biz.duokan.utils.delMark;
import biz.duokan.utils.readConf;
import chrriis.dj.nativeswing.swtimpl.NativeComponent;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent;
import core.util.HTMLUtil;
import db.dao.DuokanDao;
import db.entity.Duokan;


public class PrintDuokan extends JPanel {

    /**
     * 1：正常扫描书本
     * 2：扫描书本的目录
     */
    public static  String workType = "1";

    private static final long serialVersionUID = 1L;

    private static final String Thr_ID = "线程：" + UUID.randomUUID().toString().substring(0, 4);

    private static final int P_WID = 2048;

    private static final int P_HEIGHT = 1536;

    public static String filePath = "D:\\test\\";

    private static String isContinue = "0";

    private static String testMode = "0";

    private static BufferedImage loadingImg;

    private static BufferedImage refreshImg;

    private static BufferedImage priceFile;

    private static BufferedImage waitComImg = null;

    final static String BOOK_URL_BASE = "http://www.duokan.com/reader/www/app.html?id=";

    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(PrintDuokan.class);


    final JWebBrowser webBrowser = new JWebBrowser(null);

    final static JCheckBox checkBox1 = new JCheckBox("完成后停止");// 创建复选按钮;

    final static JCheckBox checkBox2 = new JCheckBox("暂停");// 创建复选按钮;

    private static JFrame frame = null;


    static String devString = "hd-";

    int countNowBookPage = 1;
    int allPageCount = 0;
    int allCount = 0;
    int errorCount = 0;
    private static int pause = 1;
    int speed = 0;
    int repeat = 0;
    int continueSuccess = 0;
    int prepare = 0;
    int bookErrorCount = 0;


    private static int precentPre = 0;
    private static int precentCotinue = 0;

    private static boolean isOK = false;

    private static List<String> bookContList = new ArrayList<>();


    /**
     * 截图线程
     * @return
     */
    private Thread makePrintThread() {
        return new Thread() {
            public void run() {


                try {

                    Thread.sleep(20000);

                    Duokan duokanBook = DuoKanService.rtnNextBook();


                    while (duokanBook != null) {

                        DuoKanService.runningBook(duokanBook.getId());

                        String bookId = duokanBook.getUrl() + "";
                        final String url = BOOK_URL_BASE + bookId;


                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {

                                webBrowser.executeJavascript("$(window).bind('beforeunload');");
                                webBrowser.executeJavascript(" window.onbeforeunload = null;");

                                webBrowser.navigate(url);

                            }
                        });


                        String bookName = duokanBook.getName();

                        //logger.info(Thr_ID+"-"+"任务队列剩余：" + (waitBookMap.size() - j));
                        logger.info(Thr_ID + "-" + "开始扫描：" + bookName);
                        frame.setTitle("正在扫描：" + bookName);
                        File f = new File(filePath + bookName);
                        f.mkdir();

                        while (true) {


                            while (!isOK) {

                                if (webBrowser.getLoadingProgress() == 100) {
                                    isOK = true;
                                }

                                if (precentPre == webBrowser.getLoadingProgress()) {
                                    precentCotinue++;
                                } else {
                                    precentCotinue = 0;
                                }

                                //6s进度不动就继续
                                if (precentCotinue > 30) {
                                    isOK = true;
                                    precentCotinue = 0;
                                    logger.info(Thr_ID + "-" + "超过6s未能100%加载，直接截图");
                                }
                                precentPre = webBrowser.getLoadingProgress();

                                Thread.sleep(200);
                            }

                            while (pause == 0) {
                                Thread.sleep(10 * 1000l);
                            }


                            //准备工作
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    webBrowser.executeJavascript("$('.j-close').click();");
                                }
                            });
                            Thread.sleep(500 + speed);
                            prepare++;

                            if (prepare == 15) {
                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {

                                        webBrowser.executeJavascript("$('.j-cancel').click();");
                                        webBrowser.executeJavascript("$('.j-close').click();");

                                    }
                                });
                            }

                            if (prepare == 25) {
                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {

                                        webBrowser.executeJavascript(" $('.j-itm:first').click();");
                                        webBrowser.executeJavascript("$('.j-pageup').click();");

                                    }
                                });
                            }


                            if (prepare < 40) continue;


                            /**
                             * printResult ：
                             * 0 - 全新图片
                             * 1 - 与上一次相同
                             * 2 - 与loading图片相同
                             * 3 - 与重新刷新图片相同
                             *
                             * 5 - 存在购买页面
                             */
                            int printResult = printScreen(filePath + bookName + File.separator + String.format("%04d", PrintDuokan.this.countNowBookPage) + ".png", false);

                            allCount++;

                            //如果连续出现刷新当前页超过40次，强制前进
                            if (printResult == 2 || printResult == 3) {
                                errorCount++;
                                if (errorCount > 40) {
                                    errorCount = 0;
                                    logger.info(Thr_ID + "-" + "由于长期无法翻页，强制前进");
                                    SwingUtilities.invokeLater(new Runnable() {
                                        public void run() {
                                            webBrowser.executeJavascript("$('.j-cancel').click();");
                                            webBrowser.executeJavascript("$('.j-close').click();");

                                            webBrowser.executeJavascript("$('.j-pagedown').click();");
                                        }
                                    });

                                    continue;

                                }


                            }


                            if (printResult == 5) {
                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {
                                        webBrowser.executeJavascript("$('.j-close').click();");
                                    }
                                });
                                logger.info(Thr_ID + "-" + "发现购买按钮，刷新页面...");
                                Thread.sleep(5000);
                            }


                            if (printResult == 0) {

                                //扫描成功

                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {
                                        webBrowser.executeJavascript("$('.j-cancel').click();");
                                        webBrowser.executeJavascript("$('.j-close').click();");

                                        webBrowser.executeJavascript("$('.j-pagedown').click();");

                                        String htmlContent = webBrowser.getHTMLContent();


                                        java.util.List<String> patternString = HTMLUtil.getPatternString(htmlContent, "<svg xmlns=\"http://www.w3.org/2000/svg\".*?</svg>");

//                                         得到文本信息
//
//                                        if(bookContList.size()==0)
//                                        {
//                                            bookContList = patternString;
//                                        }
//                                        else
//                                        {
//                                            String lastCont = bookContList.get(bookContList.size() - 1);
//
//                                            int beginPos = 0;
//
//                                            for (int i = patternString.size()-1; i > -1; i--) {
//                                                String nowStr = patternString.get(i);
//
//                                                if(nowStr.equals(lastCont))
//                                                {
//                                                    beginPos = i;
//                                                }
//                                            }
//
//
//                                            for(int i = beginPos+1;i<patternString.size();i++)
//                                            {
//                                                bookContList.add(patternString.get(i));
//                                            }
//
//                                        }
//
//
//
//                                        for (String s : bookContList) {
//
//                                            //
//
//                                            s = s.replaceFirst("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"433\" height=\"577\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">",
//                                                    "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"1016\" height=\"1364\" viewBox=\"0 0 433 577\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">");
//
//
//                                            System.out.println(s);
//                                        }




                                    }
                                });





                                countNowBookPage++;
                                allPageCount++;
                                repeat = 0;
                                logger.info(Thr_ID + "-" + "正在扫描第" + countNowBookPage + "页;本次扫描：" + allPageCount + ";循环次数：" + allCount);
                                frame.setTitle("" + bookName + "-第" + countNowBookPage + "页;（" + allPageCount +
                                        "/" + allCount + "）");
//                                            if (speed > 0)
//                                                speed = speed - 100;

                                continueSuccess++;
                                errorCount = 0;
                                if (continueSuccess > 15) {
                                    speed = -300;
                                }

                            }


                            if (printResult == 2) {
                                //与上次相同的话
                                logger.info(Thr_ID + "-" + "等待中...");
                                Thread.sleep(5000);
                                speed = 0;
                                continueSuccess = 0;
                            }


                            if (printResult == 3) {
                                //刷新当前页
                                logger.info(Thr_ID + "-" + "刷新当前页...");

                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {
                                        webBrowser.executeJavascript(" $('.u-btn-retry').click();");

                                    }
                                });

                                Thread.sleep(200);
                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {
                                        webBrowser.executeJavascript(" $('.u-btn-retry').click();");
                                    }
                                });

                                Thread.sleep(200);
                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {
                                        webBrowser.executeJavascript(" $('.u-btn-retry').click();");
                                    }
                                });

                                Thread.sleep(5000);

                                speed = 0;
                                continueSuccess = 0;
                            }


                            if (printResult == 1) {
                                //连续5次与上次相同的话，结束

                                repeat++;

                                if (repeat < 6) {
                                    if (repeat > 3) {
                                        SwingUtilities.invokeLater(new Runnable() {
                                            public void run() {
                                                webBrowser.executeJavascript("$('.j-cancel').click();");
                                                webBrowser.executeJavascript("$('.j-close').click();");

                                                webBrowser.executeJavascript("$('.j-pagedown').click();");
                                            }
                                        });
                                    }
                                    Thread.sleep(1000);

                                } else {

                                    SwingUtilities.invokeLater(new Runnable() {
                                        public void run() {
                                            webBrowser.executeJavascript("$(window).unbind('beforeunload');");
                                            webBrowser.executeJavascript(" window.onbeforeunload = null;");

                                            webBrowser.navigate("http://www.duokan.com/");

                                        }
                                    });


                                    if (countNowBookPage < 3) {

                                        bookErrorCount++;

                                        if(bookErrorCount>10)
                                        {
                                            Thread.sleep(2000);
                                            System.exit(0);
                                        }


                                        prepare = 0;
                                        countNowBookPage = 1;
                                        // 重新扫描本书
                                        logger.info(Thr_ID + "-" + "重新扫描，扫描失败：" + bookName);
                                    } else {

                                        prepare = 0;
                                        countNowBookPage = 1;

                                        DuoKanService.endBook(duokanBook.getId());
                                        if (isContinue == null || isContinue.equals("0")) {
                                            //只一本
                                            Thread.sleep(2000);
                                            System.exit(0);

                                        }

                                        logger.info(Thr_ID + "-" + "扫描完成：" + bookName);
                                        Thread.sleep(1000);

                                        duokanBook = DuoKanService.rtnNextBook();

                                    }

                                    break;

                                }
                            }


                        }
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }


        };
    }


    private Thread makeCataThread() {
        return new Thread() {
            public void run() {


                try {

                    Thread.sleep(20000);



                    Duokan duokanBook = DuoKanService.rtnNextCataWaitBook();


                    while (duokanBook != null) {



                        String bookId = duokanBook.getUrl() + "";
                        final String url = BOOK_URL_BASE + bookId;


                        SwingUtilities.invokeAndWait(new Runnable() {
                            public void run() {

                                webBrowser.executeJavascript("$(window).bind('beforeunload');");
                                webBrowser.executeJavascript(" window.onbeforeunload = null;");

                                webBrowser.navigate(url);

                            }
                        });




                        String bookName = duokanBook.getName();

                        logger.info(Thr_ID + "-" + "目录：" + bookName);
                        frame.setTitle("目录：" + bookName);
                        String trim = "";

                        while (true) {
                            Thread.sleep(3000);

                            trim = rtnCataString().trim();
                            if (!trim.contains("目录内容")) {

                                break;
                            }
                        }

                        duokanBook.setCatastring(trim.replaceAll("'","\""));
                        DuokanDao.dao.update(duokanBook);

                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                webBrowser.executeJavascript("$(window).unbind('beforeunload');");
                                webBrowser.executeJavascript(" window.onbeforeunload = null;");

                                webBrowser.navigate("http://www.duokan.com/");

                            }
                        });

                        Thread.sleep(3000);
                        duokanBook = DuoKanService.rtnNextCataWaitBook();



                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }


        };
    }


    private static int[] getData(BufferedImage name) throws Exception {
        BufferedImage slt = name;
        //ImageIO.write(slt,"jpeg",new File("slt.jpg"));
        int[] data = new int[slt.getWidth() * slt.getHeight() / 16];


        int da = 0;
        int w = slt.getWidth() / 8 * 5;
        int h = slt.getHeight() * 5 / 8;
        for (int x = slt.getWidth() / 8 * 3; x < w; x++) {
            for (int y = slt.getHeight() * 3 / 8; y < h; y++) {
                data[da] = slt.getRGB(x, y);
                da++;
            }
        }
        slt = null;
        //data 就是所谓图形学当中的直方图的概念
        return data;
    }

    public static int compare(String name, BufferedImage imgPath1, BufferedImage imgPath2) {

        int[] s;
        int[] t;
        try {
            s = getData(imgPath1);
            t = getData(imgPath2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

        float result = 0F;
        int xiansu = imgPath1.getWidth() * imgPath1.getHeight() / 16;
        for (int i = 0; i < xiansu; i++) {
            if (s[i] == t[i])
                result++;
            /*
            int abs = Math.abs(s[i]-t[i]);
            int max = Math.max(s[i],t[i]);
            result += (1-((float)abs/(max==0?1:max)));
            */


        }
        s = null;
        t = null;
        logger.debug(name + "差距：" + (int) ((result / xiansu) * 100));
        //System.out.println(name+"差距："+(int)((result/xiansu)*100));
        return (int) ((result / xiansu) * 100);
    }


    private void paintNow() throws IOException {
        String filePath = "d://" + new Date().getTime() + ".png";
        printScreen(filePath, true);
    }


    /**
     * 比较图片是否相同
     *
     * @param fileName
     * @return 0 - 全新图片
     * 1 - 与上一次相同
     * 2 - 与loading图片相同
     * 3 - 与重新刷新图片相同
     * @throws IOException
     */
    private int printScreen(String fileName, boolean onlyPrint) throws IOException {
        NativeComponent nativeComponent = webBrowser
                .getNativeComponent();
        Dimension imageSize = new Dimension();
        imageSize.width = P_WID;
        imageSize.height = P_HEIGHT;
        //nativeComponent.setSize(imageSize);
        BufferedImage image = new BufferedImage(imageSize.width,
                imageSize.height, BufferedImage.TYPE_INT_RGB);


        int width = 152;
        if (!devString.equals("hd-"))
            width = 150;

        Graphics2D g2 = (Graphics2D) image.getGraphics();

        Rectangle[] rectangles = new Rectangle[]{new Rectangle(592, width, 864, 1154)};

        nativeComponent.print(g2);
        //nativeComponent(image,rectangles);

        BufferedImage imageNew = image.getSubimage(592, width, 864, 1154);

        image.flush();

        g2.dispose();

        image = imageNew;

        imageNew = null;


        //如果只是为了截图，此处返回即可；
        if (onlyPrint) {
            ImageIO.write(delMark.delBufferMark(image), "png", new File(fileName));
            return -1;
        }

        //小尺寸
        //image = image.getSubimage(310,110,  406, 550);
        BufferedImage temImg = image.getSubimage(166 * 2, 279 * 2, 107 * 2, 41 * 2);
        ;//image.getSubimage(120,240,  210, 120);

        BufferedImage yemaImg = image.getSubimage(338 * 2 - 33, 549 * 2, 76 * 2, 20 * 2);
        ;//image.getSubimage(297,534,  120, 32);


        int i = compare("与Loading的", temImg, loadingImg);
        if (i == 100) return 2;

//        i =  compare(image, whiteImg);
//        if(i==100) return 2;

        int i2 = compare("与刷新按钮的", temImg, refreshImg);
        if (i2 == 100) return 3;


        BufferedImage priceTemImg = image.getSubimage(186 * 2, 411 * 2, 60 * 2, 30 * 2);

        int i5 = compare("与购买按钮的", priceTemImg, priceFile);
        if (i5 == 100) return 5;

        if (waitComImg != null) {
            int i1 = compare("与上一页的", yemaImg, waitComImg);
            if (i1 == 100) return 1;
        }


        ImageIO.write(delMark.delBufferMark(image), "png", new File(fileName));

        if (testMode.endsWith("1")) {
            ImageIO.write(temImg, "png", new File(fileName + "1"));
            ImageIO.write(priceTemImg, "png", new File(fileName + "2"));
        }

        if (waitComImg != null) {
            waitComImg.flush();
            waitComImg = null;
        }

        waitComImg = yemaImg;

        image.flush();
        temImg.flush();
        priceTemImg.flush();
        image = null;
        temImg = null;
        yemaImg = null;
        priceTemImg = null;
        return 0;
    }

    static  String cataString ;

    private String rtnCataString() throws InvocationTargetException, InterruptedException {


        SwingUtilities.invokeAndWait(new Runnable() {
            public void run() {

                cataString = webBrowser.getHTMLContent();

            }
        });



        cataString=cataString.replaceAll("\n", "").replaceAll("\r", "");

        String betweenString = "<div class=\"rd_dirct"+HTMLUtil.getBetweenString(cataString, "rd_dirct", "<div class=\"rd_bookmark");

        return betweenString;


    }



    public static void main(String[] args) throws Exception {

        logger.info(Thr_ID + "-" + "---------------start----------");


        Map<String, String> stringStringMap = readConf.readFileByLines();


        if (stringStringMap.get("containerMain") != null && stringStringMap.get("containerMain").length() > 0) {
            isContinue = stringStringMap.get("containerMain");
        }

        if (stringStringMap.get("workType") != null && stringStringMap.get("workType").length() > 0) {
            workType = stringStringMap.get("workType");
        }




        String testModeString = stringStringMap.get("testMode");


        if (testModeString != null && testModeString.length() > 0) {
            testMode = testModeString;
        }


        if (stringStringMap.get("basepath") != null && stringStringMap.get("basepath").length() > 0) {
            filePath = stringStringMap.get("basepath");
        }

        logger.info(Thr_ID + "-" + isContinue);

        logger.info(Thr_ID + "-" + filePath);


        if (stringStringMap.get("devString") != null && stringStringMap.get("devString").length() > 0) {
            devString = stringStringMap.get("devString");
        }


        String loadpic = "loading.png";
        loadingImg = ImageIO.read(new FileInputStream(filePath + "bin/" + loadpic));


        String refreshpic = "refresh.png";
        refreshImg = ImageIO.read(new FileInputStream(filePath + "bin/" + refreshpic));


        String priceFileName = "price.png";
        priceFile = ImageIO.read(new FileInputStream(filePath + "bin/" + priceFileName));


        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                frame = new JFrame("多看抓取");

                final PrintDuokan test = new PrintDuokan();

                JScrollPane jp = test.makePanel();

                JPanel southPanel = makeCtrlPanel(test);


                frame.getContentPane().add(jp, BorderLayout.CENTER);
                frame.getContentPane().add(southPanel, BorderLayout.NORTH);
                frame.setSize(800, 600);
                frame.setVisible(true);//设置是否可见
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//使能关闭窗口，结束程序

                test.webBrowser.getNativeComponent().requestFocus();


                if(workType.endsWith("1")) {



                    Thread t = test.makePrintThread();
                    t.start();

                }else if(workType.endsWith("2")) {
                    Thread t = test.makeCataThread();
                    t.start();
                }

                logger.info(Thr_ID + "-" + "---------------end----------");
            }
        });



        Thread t2 = new Thread() {
            public void run() {
                autoZoom();
            }
        };
        t2.start();



        NativeInterface.runEventPump();


    }


    /**
     * 页面构建
     * @return
     */
    private JScrollPane makePanel() {

        JScrollPane jScrollPane = new JScrollPane();
        webBrowser.setPreferredSize(new Dimension(P_WID, P_HEIGHT));
        webBrowser.setBarsVisible(true);
        webBrowser.navigate("http://www.duokan.com/");
        webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
                                             public void loadingProgressChanged(WebBrowserEvent e) {
                                                 if (e.getWebBrowser().getLoadingProgress() < 100) {
                                                     isOK = false;
                                                 }
                                             }
                                         }
        );
        jScrollPane.setViewportView(webBrowser);
        return jScrollPane;
    }



    /**
     * 页面构建
     * @return
     */
    public static JPanel makeCtrlPanel(final PrintDuokan test) {
        JPanel southPanel = new JPanel();
        JButton setCustomButton = new JButton("开始扫描");
        setCustomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Thread t = test.makePrintThread();
                t.start();

                //setCustomButton.setVisible(false);

            }
        });

        JButton justPantBtn = new JButton("截图");
        justPantBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    test.paintNow();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });


        JButton cataBtn = new JButton("获取目录");
        cataBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    System.out.println(test.rtnCataString());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });


        checkBox1.setSelected((isContinue == null || isContinue.equals("0")) ? true : false);

        checkBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (checkBox1.isSelected())
                    isContinue = "0";
                else
                    isContinue = "1";


            }
        });


        checkBox2.setSelected(false);

        checkBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (checkBox2.isSelected())
                    pause = 0;
                else
                    pause = 1;


            }
        });

        southPanel.add(cataBtn);
        southPanel.add(justPantBtn);
        southPanel.add(checkBox2);
        southPanel.add(checkBox1);
        return southPanel;
    }

    /**
     * 缩放到200%
     */
    public static void autoZoom() {
        try {


            Thread.sleep(5000);


            Robot r = new Robot();//创建自动化工具对象

            for (int i = 0; i < 4; i++) {

                Thread.sleep(300);


                r.keyPress(KeyEvent.VK_CONTROL);//按下左Contrl  keycode为17

                r.keyPress(KeyEvent.VK_ADD);

                r.keyRelease(KeyEvent.VK_ADD);

                r.keyRelease(KeyEvent.VK_CONTROL);//释放左Control键


            }

            logger.info("Zoom Over!");

            logger.info("Begin Work!");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}