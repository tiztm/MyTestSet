package duokan;

import chrriis.dj.nativeswing.swtimpl.NativeComponent;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import com.rui.utils.HTMLUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class fastread extends JPanel {
    private static final long serialVersionUID = 1L;


    /**
     * !!!最重要!!!
     * 扫描的书籍ID
     */
    final static String BOOK_ID = "ad732c840fd441638c443ac48a51e573";





    private static final int P_WID = 1024;

    private static final int P_HEIGHT = 768;

    public static String filePath =  "D:\\test\\" ;

    private static String isContinue = "0";


    final static String BOOK_URL_BASE = "http://www.duokan.com/reader/www/app.html?id=";



    final JWebBrowser webBrowser = new JWebBrowser(null);

    int i=1;

    int repeat = 0;

    int prepare = 0;


    public fastread() {
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

                Thread t = getThread();
                t.start();

            }
        });



        southPanel.add(setCustomButton);
        add(southPanel, BorderLayout.SOUTH);
    }

    String htmlContent = "";

    String oldWord = "";


    private Thread getThread() {
        return new Thread() {
                        public void run() {

                            Map<String, String> waitBookMap = checkwait.readFileByLines();

                            waitBookMap  = new HashMap<>();
                            waitBookMap.put("c5d19099e6944e4fb9fcd73b12c2e18e","像计算机科学家一样思考Java");

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

                                        Thread.sleep(100);
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

                                        if(prepare==35)
                                        {
                                            SwingUtilities.invokeLater(new Runnable() {
                                                public void run() {

                                                    webBrowser.executeJavascript(" $('.j-itm:first').click();");
                                                    webBrowser.executeJavascript("$('.j-pageup').click();");

                                                }
                                            });
                                        }


                                        if(prepare<50) continue;

                                        Thread.sleep(300);

                                        SwingUtilities.invokeLater(new Runnable() {
                                            public void run() {
                                                htmlContent = webBrowser.getHTMLContent();
                                            }
                                        });



                                        while (htmlContent.equals(""))
                                        {
                                            Thread.sleep(100);
                                        }
                                        //System.out.println(htmlContent);


                                        String betweenString = HTMLUtil.getBetweenString(htmlContent, "<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"433\" height=\"577\" xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\">"
                                                , "</svg>");


                                        String nowWord = duokanhtml2txt.htmlTotxt(betweenString);
                                        if(!oldWord.equals(nowWord))
                                            System.out.print("--"+nowWord);

                                        SwingUtilities.invokeLater(new Runnable() {
                                            public void run() {
                                                webBrowser.executeJavascript("$('.j-cancel').click();");
                                                webBrowser.executeJavascript("$('.j-close').click();");
                                                webBrowser.executeJavascript("$('.j-pagedown').click();");
                                            }
                                        });
                                        i++;
                                        repeat=0;
                                        //System.out.println("第："+i+"页");
                                        htmlContent = "";
                                        oldWord = nowWord;

                                        //if(i>6) System.exit(0);



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


        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("TXT保存网页");


                fastread test = new fastread();
                frame.getContentPane().add(test, BorderLayout.CENTER);
                frame.setSize(P_WID, P_HEIGHT+100);
                frame.setResizable(false);
//                frame.invalidate();
//                frame.pack();
                frame.setVisible(true);//设置是否可见

                System.out.println("---------------end----------");
            }
        });
        NativeInterface.runEventPump();

    }


}