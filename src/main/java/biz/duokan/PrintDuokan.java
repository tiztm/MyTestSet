package biz.duokan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.UUID;


import javax.imageio.ImageIO;
import javax.swing.*;


import biz.duokan.utils.DuoKanService;
import biz.duokan.utils.checkwait;
import biz.duokan.utils.delMark;
import biz.duokan.utils.readConf;
import chrriis.dj.nativeswing.swtimpl.NativeComponent;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import db.entity.Duokan;


public class PrintDuokan extends JPanel {
    private static final long serialVersionUID = 1L;

    private static final String Thr_ID = UUID.randomUUID().toString().substring(0,6);

    private static final int P_WID = 2048;

    private static final int P_HEIGHT = 1536;

    public static String filePath =  "D:\\test\\" ;

    private static String isContinue = "0";

    private static String loadpic = "loading.png";

    private static BufferedImage loadingImg ;

    private static String refreshpic = "refresh.png";

    private static BufferedImage refreshImg ;

    private static BufferedImage waitComImg = null ;

    final static String BOOK_URL_BASE = "http://www.duokan.com/reader/www/app.html?id=";

    final JWebBrowser webBrowser = new JWebBrowser(null);

    int i=1;

    int speed=0;

    int repeat = 0;

    int continueSuccess = 0;

    int prepare = 0;


    public PrintDuokan() {
        super(new BorderLayout());
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        webBrowser.setPreferredSize(new Dimension(P_WID,P_HEIGHT));
        webBrowser.setSize(new Dimension(P_WID,P_HEIGHT));
        webBrowser.useWebkitRuntime();
        webBrowser.setBarsVisible(true);
        webBrowser.navigate("https://www.duokan.com/");
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        add(webBrowserPanel, BorderLayout.CENTER);

    }

    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(PrintDuokan.class);


    private Thread getThread() {
        return new Thread() {
                        public void run() {

                            Duokan duokanBook = DuoKanService.rtnNextBook();
                            while (duokanBook!=null) {

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
                                logger.info(Thr_ID+"-"+"begin----" + bookName + new Date());
                                File f = new File(filePath + bookName);
                                f.mkdir();

                                while (true) {

                                    try {

                                        //准备工作
                                        SwingUtilities.invokeLater(new Runnable() {
                                            public void run() {
                                                webBrowser.executeJavascript("$('.j-cancel').click();");
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
                                         */
                                        int printResult = pringScreen(filePath + bookName + File.separator + String.format("%04d", PrintDuokan.this.i) + ".png");
                                        if (printResult == 0) {

                                            SwingUtilities.invokeLater(new Runnable() {
                                                public void run() {
                                                    webBrowser.executeJavascript("$('.j-cancel').click();");
                                                    webBrowser.executeJavascript("$('.j-close').click();");
                                                    webBrowser.executeJavascript("$('.j-pagedown').click();");
                                                }
                                            });
                                            i++;
                                            repeat = 0;
                                            logger.info(Thr_ID+"-"+"正在扫描第" + i + "页");

                                            if (speed > 0)
                                                speed = speed - 100;

                                            continueSuccess++;

                                            if (continueSuccess > 20) {
                                                speed = -300;
                                            }

                                        }


                                        if (printResult == 2) {
                                            //与上次相同的话
                                            logger.info(Thr_ID+"-"+"等待中..." );
                                            Thread.sleep(5000);
                                            speed = 1300;
                                            continueSuccess = 0;
                                        }


                                        if (printResult == 3) {
                                            //刷新当前页
                                            logger.info(Thr_ID+"-"+"刷新当前页..." );

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

                                            speed = 1300;
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
                                                        webBrowser.navigate("https://www.duokan.com/");
                                                    }
                                                });


                                                if (i < 3) {
                                                   // j--;
                                                } else if (isContinue == null || isContinue.equals("0")) {

                                                    DuoKanService.endBook(duokanBook.getId());
                                                    //只一本
                                                    Thread.sleep(2000);
                                                    System.exit(0);

                                                }

                                                prepare = 0;
                                                i = 1;
                                                logger.info(Thr_ID+"-"+"end----" + bookName + new Date());

                                                Thread.sleep(2000);


                                                DuoKanService.endBook(duokanBook.getId());

                                                Thread.sleep(1000);

                                                duokanBook = DuoKanService.rtnNextBook();


                                                break;
                                            }
                                        }

                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }
                                }
                            }

                            }




                    };
    }


    public static int[] getData(BufferedImage name)throws Exception{
        BufferedImage slt = name;
        //ImageIO.write(slt,"jpeg",new File("slt.jpg"));
        int[] data = new int[slt.getWidth()*slt.getHeight()/16];


        int da = 0;
        int w = slt.getWidth()/8*5;
        int h = slt.getHeight()*5/8;
        for(int x = slt.getWidth()/8*3;x<w;x++){
            for(int y = slt.getHeight()*3/8;y<h;y++){
                data[da] = slt.getRGB(x,y);
                da++;
            }
        }
        slt = null;
        //data 就是所谓图形学当中的直方图的概念
        return data;
    }
    public static int compare(String name,BufferedImage imgPath1, BufferedImage imgPath2){

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
        for(int i = 0; i< xiansu; i++){
            if(s[i]==t[i])
                result++;
            /*
            int abs = Math.abs(s[i]-t[i]);
            int max = Math.max(s[i],t[i]);
            result += (1-((float)abs/(max==0?1:max)));
            */


        }
        s= null;
        t = null;
        logger.debug(name+"差距："+(int)((result/xiansu)*100));
        return (int)((result/xiansu)*100);
    }



    /**
     * 比较图片是否相同
     * @param fileName
     * @return
     * 0 - 全新图片
     * 1 - 与上一次相同
     * 2 - 与loading图片相同
     * 3 - 与重新刷新图片相同
     * @throws IOException
     */
    private int pringScreen(String fileName) throws IOException {
        NativeComponent nativeComponent = webBrowser
                .getNativeComponent();
        Dimension imageSize = new Dimension();
        imageSize.width = P_WID;
        imageSize.height = P_HEIGHT;
        //nativeComponent.setSize(imageSize);
        BufferedImage image = new BufferedImage(imageSize.width,
                imageSize.height, BufferedImage.TYPE_INT_RGB);
        nativeComponent.paintComponent(image);

        image = image.getSubimage(592,152,  864, 1154);
        //小尺寸
        //image = image.getSubimage(310,110,  406, 550);
        BufferedImage temImg =  image.getSubimage(166*2,279*2,  107*2, 41*2);;//image.getSubimage(120,240,  210, 120);

        BufferedImage yemaImg =   image.getSubimage(338*2-33,549*2,  76*2, 20*2);;//image.getSubimage(297,534,  120, 32);



        int i = compare("与Loading的",temImg, loadingImg);
        if(i==100) return 2;

//        i =  compare(image, whiteImg);
//        if(i==100) return 2;

        int i2 = compare("与刷新按钮的",temImg, refreshImg);
        if(i2==100) return 3;

        if(waitComImg!=null)
        {
            int i1 = compare("与上一页的",yemaImg, waitComImg);
            if(i1==100) return 1;
        }


        ImageIO.write(delMark.delBufferMark(image), "png", new File(fileName));

        //ImageIO.write(temImg, "png", new File(fileName+"1"));

        //ImageIO.write(yemaImg, "png", new File(fileName+"2"));
        waitComImg = null;
        waitComImg = yemaImg;
        image.flush();
        temImg.flush();
        yemaImg.flush();
        image = null;temImg = null;yemaImg=null;
        return 0;
    }


    public static void main(String[] args) throws Exception {

        logger.info(Thr_ID+"-"+"---------------start----------");


        Map<String, String> stringStringMap = readConf.readFileByLines();


        if(stringStringMap.get("con")!=null&&stringStringMap.get("con").length()>0)
        {
            isContinue =stringStringMap.get("con");
        }



        if(stringStringMap.get("basepath")!=null&&stringStringMap.get("basepath").length()>0)
        {
            filePath =stringStringMap.get("basepath");
        }

        logger.info(Thr_ID+"-"+isContinue);

        logger.info(Thr_ID+"-"+filePath);

        String devString = "hd-";

        if(stringStringMap.get("devString")!=null&&stringStringMap.get("devString").length()>0)
        {
            devString =stringStringMap.get("devString");
        }



        //logger.info(Thr_ID+"-"+devString);


        loadingImg =  ImageIO.read(new FileInputStream(filePath+"bin/"+devString+loadpic));

    //    whiteImg  =  ImageIO.read(new FileInputStream(filePath+"bin/"+whitepic));

        refreshImg  =  ImageIO.read(new FileInputStream(filePath+"bin/"+devString+refreshpic));

        //logger.info(Thr_ID+"-"+loadingImg.getHeight());



        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("以DJ组件保存指定网页截图");


                final PrintDuokan test = new PrintDuokan();
                JScrollPane jScrollPane = new JScrollPane();
                jScrollPane.setViewportView(test);


                JPanel southPanel = new JPanel();


                //southPanel.setBorder(BorderFactory.createTitledBorder("自定义"));
                JButton setCustomButton = new JButton("开始扫描");
                setCustomButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        Thread t = test.getThread();
                        t.start();

                    }
                });



                southPanel.add(setCustomButton);
                frame.getContentPane().add(southPanel, BorderLayout.NORTH);


                frame.getContentPane().add(jScrollPane, BorderLayout.CENTER);
                frame.setSize(800, 600);
                //frame.setResizable(false);
//                frame.invalidate();
//                frame.pack();
                frame.setVisible(true);//设置是否可见

                logger.info(Thr_ID+"-"+"---------------end----------");
            }
        });
        NativeInterface.runEventPump();

    }


}