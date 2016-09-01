package duokan;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import java.util.Set;


import javax.imageio.ImageIO;
import javax.swing.*;


import chrriis.dj.nativeswing.swtimpl.NativeComponent;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserDecorator;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent;


public class fastprint extends JPanel {
    private static final long serialVersionUID = 1L;


    /**
     * !!!最重要!!!
     * 扫描的书籍ID
     */
    //final static String BOOK_ID = "ad732c840fd441638c443ac48a51e573";





    private static final int P_WID = 2048;

    private static final int P_HEIGHT = 1536;

    public static String filePath =  "D:\\test\\" ;

    private static String isContinue = "0";

    private static String loadpic = "loading.png";

    private static BufferedImage loadingImg ;

//
//    private static String whitepic = "fullwhite.png";
//
//    private static BufferedImage whiteImg ;

    private static String refreshpic = "refresh.png";

    private static BufferedImage refreshImg ;



    private static BufferedImage waitComImg = null ;




    final static String BOOK_URL_BASE = "http://www.duokan.com/reader/www/app.html?id=";



    final JWebBrowser webBrowser = new JWebBrowser(null);

    int i=1;

    int repeat = 0;

    int prepare = 0;


    public fastprint() {
        super(new BorderLayout());
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        webBrowserPanel.setPreferredSize(new Dimension(P_HEIGHT,P_WID));
        webBrowser.useWebkitRuntime();
        webBrowser.setBarsVisible(true);
        webBrowser.navigate("https://www.duokan.com/");
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        add(webBrowserPanel, BorderLayout.CENTER);



        JPanel southPanel = new JPanel();


        //southPanel.setBorder(BorderFactory.createTitledBorder("自定义"));
        JButton setCustomButton = new JButton("开始扫描");
        setCustomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Thread t = getThread();
                t.start();

            }
        });



        southPanel.add(setCustomButton);
        add(southPanel, BorderLayout.NORTH);
    }

    private Thread getThread() {
        return new Thread() {
                        public void run() {

                            Map<String, String> waitBookMap = checkwait.readFileByLines();
                            Set<String> strings = waitBookMap.keySet();
                            String[] keyArray = new String[strings.size()];
                            int count = 0;
                            for (String string : strings) {
                                keyArray[count] = string;
                                count++;
                            }

                            System.out.println("书籍："+waitBookMap.size());


                            for (int j = 0; j <strings.size() ; j++) {
                                String bookId = keyArray[j];
                                final String url=BOOK_URL_BASE+bookId;


                                SwingUtilities.invokeLater(new Runnable() {
                                    public void run() {

                                        webBrowser.executeJavascript("$(window).bind('beforeunload');");
                                        webBrowser.executeJavascript(" window.onbeforeunload = null;");

                                        webBrowser.navigate(url);
                                    }
                                });



                                String bookName = waitBookMap.get(bookId);


                                System.out.println("begin----"+bookName+new Date());
                                File f = new File(filePath + bookName);
                                f.mkdir();

                                while (true) {

                                    try {

                                        //准备工作

                                        Thread.sleep(200);
                                        prepare++;

                                        if(prepare==45)
                                        {
                                            SwingUtilities.invokeLater(new Runnable() {
                                                public void run() {

                                                    webBrowser.executeJavascript("$('.j-cancel').click();");
                                                    webBrowser.executeJavascript("$('.j-close').click();");

                                                }
                                            });
                                        }

                                        if(prepare==85)
                                        {
                                            SwingUtilities.invokeLater(new Runnable() {
                                                public void run() {

                                                    webBrowser.executeJavascript(" $('.j-itm:first').click();");
                                                    webBrowser.executeJavascript("$('.j-pageup').click();");

                                                }
                                            });
                                        }


                                        if(prepare<160) continue;



                                        /**
                                         * 0 - 全新图片
                                         * 1 - 与上一次相同
                                         * 2 - 与loading图片相同
                                         * 3 - 与重新刷新图片相同
                                         */
                                        int printResult = pringScreen(filePath + bookName + File.separator + String.format("%04d", fastprint.this.i) + ".png");
                                        if(printResult==0)
                                        {

                                            SwingUtilities.invokeLater(new Runnable() {
                                                public void run() {
                                                    webBrowser.executeJavascript("$('.j-cancel').click();");
                                                    webBrowser.executeJavascript("$('.j-close').click();");
                                                    webBrowser.executeJavascript("$('.j-pagedown').click();");
                                                }
                                            });
                                            i++;
                                            repeat=0;
                                            System.out.println("第："+i+"页");
                                        }


                                        if(printResult==2) {
                                            //与上次相同的话
                                            System.out.println("loading----"+new Date());
                                            Thread.sleep(1000);
                                        }


                                        if(printResult==3) {
                                            //刷新当前页
                                            System.out.println("refresh----"+new Date());

                                            SwingUtilities.invokeLater(new Runnable() {
                                                public void run() {
                                                    webBrowser.executeJavascript(" $('.u-btn-retry').click();");
                                                }
                                            });

                                            Thread.sleep(1000);
                                        }



                                        if(printResult==1) {
                                            //连续5次与上次相同的话，结束

                                            repeat++;

                                            if(repeat<6) {
                                                if (repeat > 3)
                                                {
                                                    SwingUtilities.invokeLater(new Runnable() {
                                                        public void run() {
                                                            webBrowser.executeJavascript("$('.j-cancel').click();");
                                                            webBrowser.executeJavascript("$('.j-close').click();");
                                                            webBrowser.executeJavascript("$('.j-pagedown').click();");
                                                        }
                                                    });
                                                }
                                                Thread.sleep(1000);

                                            }
                                            else {

                                                SwingUtilities.invokeLater(new Runnable() {
                                                    public void run() {
                                                        webBrowser.executeJavascript("$(window).unbind('beforeunload');");
                                                        webBrowser.executeJavascript(" window.onbeforeunload = null;");
                                                        webBrowser.navigate("https://www.duokan.com/");
                                                    }
                                                });


                                                if(i<3) {
                                                    j--;
                                                }
                                                else if(isContinue==null||isContinue.equals("0"))
                                                {
                                                    //只一本
                                                    Thread.sleep(2000);
                                                    System.exit(0);

                                                }

                                                prepare = 0;
                                                i=1;
                                                System.out.println("end----"+bookName+new Date());

                                                Thread.sleep(2000);


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
        //data 就是所谓图形学当中的直方图的概念
        return data;
    }
    public static int compare(BufferedImage imgPath1, BufferedImage imgPath2){

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
        System.out.println("差距："+(int)((result/xiansu)*100));
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

        image = image.getSubimage(126,542,  610, 880);
        //小尺寸
        //image = image.getSubimage(310,110,  406, 550);

        BufferedImage temImg =  image.getSubimage(120,240,  210, 120);

        BufferedImage yemaImg =  image.getSubimage(297,534,  120, 32);


        int i = compare(temImg, loadingImg);
        if(i==100) return 2;
//        i =  compare(image, whiteImg);
//        if(i==100) return 2;

        int i2 = compare(temImg, refreshImg);
        if(i2==100) return 3;

        if(waitComImg!=null)
        {
            int i1 = compare(yemaImg, waitComImg);
            if(i1==100) return 1;
        }


        ImageIO.write(image, "png", new File(fileName));

        //ImageIO.write(temImg, "png", new File(fileName+"1"));
        waitComImg = yemaImg;
        return 0;
    }


    public static void main(String[] args) throws Exception {

        System.out.println("---------------start----------");


        Map<String, String> stringStringMap = readConf.readFileByLines();


        if(stringStringMap.get("con")!=null&&stringStringMap.get("con").length()>0)
        {
            isContinue =stringStringMap.get("con");
        }



        if(stringStringMap.get("basepath")!=null&&stringStringMap.get("basepath").length()>0)
        {
            filePath =stringStringMap.get("basepath");
        }

        System.out.println(isContinue);

        System.out.println(filePath);

        String devString = "";

        if(stringStringMap.get("devString")!=null&&stringStringMap.get("devString").length()>0)
        {
            devString =stringStringMap.get("devString");
        }



        System.out.println(devString);
        /**
         * 在IDE里跑的时候请打开！
         *  */
         //devString = "dev-";


        loadingImg =  ImageIO.read(new FileInputStream(filePath+"bin/"+devString+loadpic));

    //    whiteImg  =  ImageIO.read(new FileInputStream(filePath+"bin/"+whitepic));

        refreshImg  =  ImageIO.read(new FileInputStream(filePath+"bin/"+devString+refreshpic));

        //System.out.println(loadingImg.getHeight());



        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("以DJ组件保存指定网页截图");


                fastprint test = new fastprint();
                JScrollPane jScrollPane = new JScrollPane();
                jScrollPane.setViewportView(test);
                frame.getContentPane().add(jScrollPane, BorderLayout.CENTER);
                frame.setSize(1280, 1000);
                //frame.setResizable(false);
//                frame.invalidate();
//                frame.pack();
                frame.setVisible(true);//设置是否可见

                System.out.println("---------------end----------");
            }
        });
        NativeInterface.runEventPump();

    }


}