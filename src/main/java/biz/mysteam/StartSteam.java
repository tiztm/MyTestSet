package biz.mysteam;

import biz.mysteam.util.ResourceUtil;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/19.
 */
public class StartSteam {

    public static final String MY_NAME = "";

    /**
     * 菜单回馈
     */
    static class MenuActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event ) {
            System.out.println("Selected: "+event.getActionCommand());
        }
    }

    /**
     * 按钮回馈
     */
    static class MouseActionListener implements MouseListener {
        public void  mouseClicked(MouseEvent e) {


            System.out.println("clicked "+e.getComponent().getName());

        }

        /**
         * Invoked when a mouse button has been pressed on a component.
         *
         * @param e
         */
        @Override
        public void mousePressed(MouseEvent e) {

        }

        /**
         * Invoked when a mouse button has been released on a component.
         *
         * @param e
         */
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        /**
         * Invoked when the mouse enters a component.
         *
         * @param e
         */
        @Override
        public void mouseEntered(MouseEvent e) {

        }

        /**
         * Invoked when the mouse exits a component.
         *
         * @param e
         */
        @Override
        public void mouseExited(MouseEvent e) {

        }
        // 还有mouseEntered/mouseExited/mousePressed/mouseReleased
    }


    JFrame frame=new JFrame(MY_NAME+"管理");

    public static void main(String[] args) throws IOException {

        StartSteam startSteam = new StartSteam();


        menuSet(startSteam);



        MouseActionListener mouseActionListener = new MouseActionListener();


        JPanel biggerPanel = new JPanel();
        biggerPanel.setLayout(new GridLayout(1,3));


        for (int i = 0; i <5 ; i++) {
            JPanel redPanel = new JPanel();
            redPanel.setBackground(new Color(12+i*30, 122+i*30, 122+i*30));

            redPanel.setName(i+"");
            redPanel.addMouseListener(mouseActionListener);

            biggerPanel.add(redPanel);
        }



        startSteam.frame.add(biggerPanel,BorderLayout.CENTER);


        startWindow(startSteam);










    }

    public static void menuSet(StartSteam startSteam) {
        MenuActionListener menuListener = new MenuActionListener();
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("管理");
        JMenuItem newMenuItem = new JMenuItem("新建"+MY_NAME, KeyEvent.VK_N);
        newMenuItem.addActionListener(menuListener);
        fileMenu.add(newMenuItem);


        menuBar.add(fileMenu);
        startSteam.frame.setJMenuBar(menuBar);
    }

    public static void startWindow(StartSteam startSteam) throws IOException {

        double lx= Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double ly=Toolkit.getDefaultToolkit().getScreenSize().getHeight();

        startSteam.frame.setDefaultLookAndFeelDecorated(true);

        BufferedImage bi = ResourceUtil.getImage("/img/steam.png");
        startSteam.frame.setIconImage(bi);
        startSteam.frame.setLocation(new Point((int)(lx/2)-250,(int)(ly/2)-100));//设定窗口出现位置
        startSteam.frame.setSize(500,170);//设定窗口大小
        startSteam.frame.setVisible(true);//窗口可见
        startSteam.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//使能关闭窗口，结束程序
    }
}
