package biz.temptest;

import biz.duokan.FolderMerge;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2016/10/26.
 */
public class FolderRename implements ActionListener {

    JFrame frame=new JFrame("文件夹批量重命名 v0.1 by miruoming");
    JTabbedPane tabPane=new JTabbedPane();//选项卡布局
    Container containerMain =new Container();//布局1
    JLabel labelSelect1 =new JLabel("主文件夹");
    JTextField text1 =new JTextField();
    JButton btnMerge =new JButton("删除前缀");
    JButton btn1 =new JButton("...");



    JFileChooser jfc=new JFileChooser();//文件选择器



    FolderRename(){
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



        btnMerge.setBounds(200,100,100,30);
        btnMerge.addActionListener(this);//添加事件处理
        btn1.addActionListener(this);//添加事件处理
        containerMain.add(labelSelect1);
        containerMain.add(text1);
        containerMain.add(btnMerge);
        containerMain.add(btn1);

        containerMain.add(jfc);
        tabPane.add("文件选择", containerMain);//添加布局1
        frame.setVisible(true);//窗口可见
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//使能关闭窗口，结束程序
    }


    public void actionPerformed(ActionEvent e){//事件处理
        if(e.getSource().equals(btnMerge)){//判断触发方法的按钮是哪个


            int qianzhuiNum = "《小公主苏菲亚》".length();

            String mainFolderName = text1.getText();

            File mainFolder=new File(mainFolderName);

            File listMain[]=mainFolder.listFiles();

            System.out.println(listMain.length);

            for (File file : listMain) {

                String absolutePath = file.getParent();
                String name = file.getName();
                name = name.substring(qianzhuiNum);
               // System.out.println(absolutePath+"-"+name);
                file.renameTo(new File(absolutePath+File.separator+name));
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


    }
    public static void main(String[] args) {
        new FolderRename();
    }
}
