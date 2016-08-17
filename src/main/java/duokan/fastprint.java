package duokan;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;


import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


import chrriis.dj.nativeswing.swtimpl.NativeComponent;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent;


public class fastprint extends JPanel {
    private static final long serialVersionUID = 1L;

    private static final int P_WID = 1024;

    private static final int P_HEIGHT = 768;





    public fastprint(final String url, final int maxWidth, final int maxHeight) {
        super(new BorderLayout());
        JPanel webBrowserPanel = new JPanel(new BorderLayout());
        final String fileName = "e:\\test\\" + System.currentTimeMillis() + ".jpg";

        final JWebBrowser webBrowser = new JWebBrowser(null);
        webBrowser.setBarsVisible(false);
        webBrowser.navigate(url);
        webBrowserPanel.add(webBrowser, BorderLayout.CENTER);
        add(webBrowserPanel, BorderLayout.CENTER);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));
        webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
             // 监听加载进度
             public void loadingProgressChanged(WebBrowserEvent e) {
                // 当加载完毕时
                 System.out.println("---------e.getWebBrowser().getLoadingProgress():" + e.getWebBrowser().getLoadingProgress());
                 if (e.getWebBrowser().getLoadingProgress() == 100) {
                     try {

                         webBrowser.executeJavascript("alert(seajs.use('app/reader/page_control.js'));");
                         webBrowser.executeJavascript("alert(seajs1.use('app/reader/page_control.js'));");

                        Thread.sleep(600);
                         NativeComponent nativeComponent = webBrowser
                                 .getNativeComponent();
                         Dimension imageSize = new Dimension();
                         imageSize.width = P_WID;
                         imageSize.height = P_HEIGHT;
                         nativeComponent.setSize(imageSize);
                         BufferedImage image = new BufferedImage(imageSize.width,
                                 imageSize.height, BufferedImage.TYPE_INT_RGB);
                         nativeComponent.paintComponent(image);



                        // image = image.getSubimage(48, 148, 364, 337);

                         ImageIO.write(image, "jpg", new File(fileName));
                     } catch (Exception ex) {
                         ex.printStackTrace();
                     }
                     System.exit(0);
                 }
             }
        });
        add(panel, BorderLayout.SOUTH);


    }



    public static void main(String[] args) {

        System.out.println("---------------start----------");
        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                JFrame frame = new JFrame("以DJ组件保存指定网页截图");
                String url = "";
                url = "http://www.duokan.com/reader/www/app.html?id=860e404fad654eaca62ebfd5a5b056d4";

                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                int width = (int) d.getWidth();
                int height = (int) d.getHeight();
                fastprint test = new fastprint(url, width, height);
                frame.getContentPane().add(test, BorderLayout.CENTER);
                frame.setSize(P_WID, P_HEIGHT);
                frame.invalidate();
                frame.pack();
                frame.setVisible(false);//设置是否可见

                System.out.println("---------------end----------");
            }
        });
        NativeInterface.runEventPump();

    }


}