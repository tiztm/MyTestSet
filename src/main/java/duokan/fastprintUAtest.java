package duokan;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;


import javax.swing.*;


import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationParameters;


public class fastprintUAtest extends JPanel {
    private static final long serialVersionUID = 1L;

    private static final int P_WID = 2048;

    private static final int P_HEIGHT = 1336;





    public fastprintUAtest(final String url) {
        super(new BorderLayout());
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        final String fileName = "e:\\test\\" + System.currentTimeMillis() + ".jpg";

        final JWebBrowser webBrowser = new JWebBrowser(null);

        //webBrowser.set
        webBrowser.setPreferredSize(new Dimension(P_WID,P_HEIGHT));


        WebBrowserNavigationParameters parameters = new WebBrowserNavigationParameters();
        Map<String, String> headersMap = new HashMap<String, String>();
        headersMap.put("User-Agent", "Mozilla/5.0 (iPad; CPU OS 7_0_2 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A501 Safari/9537.53");
        parameters.setHeaders(headersMap);
        webBrowser.navigate(url, parameters);
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        add(webBrowserPanel, BorderLayout.CENTER);

    }



    public static void main(String[] args) {

        System.out.println("---------------start----------");
        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("以DJ组件保存指定网页截图");
                String url = "";
                url = "http://www.duokan.com/reader/www/app.html?id=38cba76d886d4b97a3f25d48b3d4c4be";

                fastprintUAtest test = new fastprintUAtest(url);

                JScrollPane sp = new JScrollPane();


                frame.getContentPane().add(sp, BorderLayout.CENTER);
                sp.setViewportView(test);
                frame.setSize(1000, 800);
                frame.setVisible(true);//设置是否可见

                System.out.println("---------------end----------");
            }
        });
        NativeInterface.runEventPump();

    }


}