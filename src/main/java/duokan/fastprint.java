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
    final static String BOOK_ID = "ad732c840fd441638c443ac48a51e573";





    private static final int P_WID = 1024;

    private static final int P_HEIGHT = 768;

    private static String filePath =  "D:\\test\\" ;


    private static String loadpic = "loading.png";

    private static BufferedImage loadingImg ;


    private static String whitepic = "fullwhite.png";

    private static BufferedImage whiteImg ;

    private static String refreshpic = "refresh.png";

    private static BufferedImage refreshImg ;



    private static BufferedImage waitComImg = null ;




    final static String BOOK_URL = "http://www.duokan.com/reader/www/app.html?id="+BOOK_ID;



    final JWebBrowser webBrowser = new JWebBrowser(null);

    int i=1;

    int repeat = 0;

    int prepare = 0;


    public fastprint(final String url) {
        super(new BorderLayout());
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        webBrowser.useWebkitRuntime();
        webBrowser.setBarsVisible(true);
        webBrowser.navigate("https://www.duokan.com/");
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        add(webBrowserPanel, BorderLayout.CENTER);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));


        add(panel, BorderLayout.SOUTH);


        JPanel southPanel = new JPanel();


        //southPanel.setBorder(BorderFactory.createTitledBorder("自定义"));
        JButton setCustomButton = new JButton("开始扫描");
        setCustomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                webBrowser.navigate(url);


                File f = new File(filePath + BOOK_ID);
                f.mkdir();



                Thread t = new Thread() {
                    public void run() {
                        while (true) {

                                try {

                                    //准备工作

                                    Thread.sleep(100);
                                    prepare++;

                                    if(prepare==15)
                                    {
                                        SwingUtilities.invokeLater(new Runnable() {
                                            public void run() {

                                                webBrowser.executeJavascript("$('.j-cancel').click();");
                                                webBrowser.executeJavascript("$('.j-close').click();");

                                                webBrowser.executeJavascript(" $('.j-itm:first').click();");
                                                webBrowser.executeJavascript("$('.j-pageup').click();");

                                            }
                                        });
                                    }

                                        if(prepare<20) continue;





                                    /**
                                     * 0 - 全新图片
                                     * 1 - 与上一次相同
                                     * 2 - 与loading图片相同
                                     * 3 - 与重新刷新图片相同
                                     */
                                    int printResult = pringScreen(filePath + BOOK_ID + File.separator + String.format("%04d", fastprint.this.i) + ".png");
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
                                                    webBrowser.navigate("https://www.duokan.com/");
                                                }
                                            });
                                            Thread.sleep(1000);
                                            System.exit(0);
                                        }
                                    }

                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }




                        }
                        }

                };
                t.start();



            }
        });

        JButton setCustom2Button = new JButton("跳过");
        setCustom2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                webBrowser.executeJavascript("$('.j-cancel').click();");

                webBrowser.executeJavascript("$('.j-close').click();");

            }
        });


        southPanel.add(setCustomButton);
        southPanel.add(setCustom2Button);
        add(southPanel, BorderLayout.SOUTH);
    }




    public static int[] getData(BufferedImage name)throws Exception{
        BufferedImage img = name;
        BufferedImage slt = new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
        slt.getGraphics().drawImage(img,0,0,100,100,null);
        //ImageIO.write(slt,"jpeg",new File("slt.jpg"));
        int[] data = new int[256];
        for(int x = 0;x<slt.getWidth();x++){
            for(int y = 0;y<slt.getHeight();y++){
                int rgb = slt.getRGB(x,y);
                Color myColor = new Color(rgb);
                int r = myColor.getRed();
                int g = myColor.getGreen();
                int b = myColor.getBlue();
                data[(r+g+b)/3]++;
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
        for(int i = 0;i<256;i++){
            int abs = Math.abs(s[i]-t[i]);
            int max = Math.max(s[i],t[i]);
            result += (1-((float)abs/(max==0?1:max)));
        }
        return (int)((result/256)*100);
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

        image = image.getSubimage(288,72,  426, 570);
        //小尺寸
        //image = image.getSubimage(310,110,  406, 550);

        BufferedImage temImg =  image.getSubimage(120,240,  210, 120);


        int i = compare(temImg, loadingImg);
        if(i==100) return 2;
//        i =  compare(image, whiteImg);
//        if(i==100) return 2;

        int i2 = compare(temImg, refreshImg);
        if(i2==100) return 3;

        if(waitComImg!=null)
        {
            int i1 = compare(temImg, waitComImg);
            if(i1==100) return 1;
        }


        ImageIO.write(image, "png", new File(fileName));

        //ImageIO.write(temImg, "png", new File(fileName+"1"));
        waitComImg =temImg;
        return 0;
    }


    public static void main(String[] args) throws Exception {

        System.out.println("---------------start----------");


        loadingImg =  ImageIO.read(new FileInputStream(filePath+loadpic));

        whiteImg  =  ImageIO.read(new FileInputStream(filePath+whitepic));

        refreshImg  =  ImageIO.read(new FileInputStream(filePath+refreshpic));



        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("以DJ组件保存指定网页截图");
                String url =  BOOK_URL;

                fastprint test = new fastprint(url);
                frame.getContentPane().add(test, BorderLayout.CENTER);
                frame.setSize(P_WID, P_HEIGHT+100);
//                frame.invalidate();
//                frame.pack();
                frame.setVisible(true);//设置是否可见

                System.out.println("---------------end----------");
            }
        });
        NativeInterface.runEventPump();

    }


}