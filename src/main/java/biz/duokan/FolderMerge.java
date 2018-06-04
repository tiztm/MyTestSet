package biz.duokan;


import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Administrator on 2016/9/1 0001.
 */
public class FolderMerge implements ActionListener {


        JFrame frame=new JFrame("文件夹合并 v0.1 by miruoming");
        JTabbedPane tabPane=new JTabbedPane();//选项卡布局
        Container containerMain =new Container();//布局1
        JLabel labelSelect1 =new JLabel("主文件夹");
        JTextField text1 =new JTextField();
        JButton btnMerge =new JButton("合并");
        JButton btn1 =new JButton("...");

    JLabel labelSelect2 =new JLabel("待并入文件夹");
    JTextField text2 =new JTextField();
    JButton btn2 =new JButton("...");

        JFileChooser jfc=new JFileChooser();//文件选择器



        FolderMerge(){
            jfc.setCurrentDirectory(new File("d:\\"));//文件选择器的初始目录定为d盘
            jfc.setFileSelectionMode(   JFileChooser.DIRECTORIES_ONLY );//设定只能选择到文件

            FileFilter filefilter = new FileFilter() {

                public boolean accept(File file) {
                    if(file.isDirectory())
                    {
                        return true;
                    }
                    return false;
                }

                @Override
                public String getDescription() {
                    return "文件夹";
                }
            };

            jfc.setFileFilter(filefilter);

            //下面两行是取得屏幕的高度和宽度
            double lx=Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            double ly=Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            frame.setLocation(new Point((int)(lx/2)-250,(int)(ly/2)-100));//设定窗口出现位置
            frame.setSize(500,210);//设定窗口大小
            frame.setContentPane(tabPane);//设置布局
            //下面设定标签等的出现位置和高宽
            labelSelect1.setBounds(10,20,100,20);
            text1.setBounds(110,20,295,20);
            btn1.setBounds(410,20,50,20);

            labelSelect2.setBounds(10,60,100,20);
            text2.setBounds(110,60,295,20);
            btn2.setBounds(410,60,50,20);



            btnMerge.setBounds(200,100,100,30);
            btnMerge.addActionListener(this);//添加事件处理
            btn1.addActionListener(this);//添加事件处理
            btn2.addActionListener(this);//添加事件处理
            containerMain.add(labelSelect1);
            containerMain.add(text1);
            containerMain.add(btnMerge);
            containerMain.add(btn1);

            containerMain.add(labelSelect2);
            containerMain.add(text2);
            containerMain.add(btn2);
            containerMain.add(jfc);
            tabPane.add("文件选择", containerMain);//添加布局1
            frame.setVisible(true);//窗口可见
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//使能关闭窗口，结束程序
        }


        public void actionPerformed(ActionEvent e){//事件处理
            if(e.getSource().equals(btnMerge)){//判断触发方法的按钮是哪个

                String mainFolderName = text1.getText();

                String subFolderName = text2.getText();

                File mainFolder=new File(mainFolderName);

                File subFolder=new File(subFolderName);

                File listMain[]=mainFolder.listFiles();

                System.out.println(listMain.length);
                
                int curPoint = listMain.length+1;


                File listSub[]=subFolder.listFiles();
                //listSub[0].getParent()

                for (int i = 0; i < listSub.length; i++) {
                    String subPNGName = String.format("%04d", i+1);

                    String mainPNGName = String.format("%04d", curPoint);

                    File sub = new File(subFolderName+File.separator+subPNGName+".png");
                    sub.renameTo(new File(mainFolderName+File.separator+mainPNGName+".png"));
                    curPoint++;
                }

                JOptionPane.showMessageDialog(frame, "合并目录成功!");
                

            }

            if(e.getSource().equals(btn1)){
                int state=jfc.showOpenDialog(null);//此句是打开文件选择器界面的触发语句
                if(state==1){
                    return;//撤销则返回
                }
                else{
                    File f=jfc.getSelectedFile();//f为选择到的文件
                    text1.setText(f.getAbsolutePath());
                }
            }

            if(e.getSource().equals(btn2)){
                int state=jfc.showOpenDialog(null);//此句是打开文件选择器界面的触发语句
                if(state==1){
                    return;//撤销则返回
                }
                else{
                    File f=jfc.getSelectedFile();//f为选择到的文件
                    text2.setText(f.getAbsolutePath());
                }
            }
        }
        public static void main(String[] args) {
            new FolderMerge();
        }

}
