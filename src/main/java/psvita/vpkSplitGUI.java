package psvita;


import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.event.*;
/**
 * Created by Administrator on 2016/9/1 0001.
 */
public class vpkSplitGUI implements ActionListener {


        JFrame frame=new JFrame("VPK文件分解 v0.1 by miruoming");
        JTabbedPane tabPane=new JTabbedPane();//选项卡布局
        Container con=new Container();//布局1
        JLabel label2=new JLabel("选择VPK文件");
        JTextField text2=new JTextField();
        JButton button1=new JButton("分解");
        JButton button2=new JButton("...");
        JFileChooser jfc=new JFileChooser();//文件选择器
    vpkSplitGUI(){
            jfc.setCurrentDirectory(new File("d:\\"));//文件选择器的初始目录定为d盘
            //下面两行是取得屏幕的高度和宽度
            double lx=Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            double ly=Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            frame.setLocation(new Point((int)(lx/2)-250,(int)(ly/2)-100));//设定窗口出现位置
            frame.setSize(500,170);//设定窗口大小
            frame.setContentPane(tabPane);//设置布局
            //下面设定标签等的出现位置和高宽
            label2.setBounds(10,20,100,20);
            text2.setBounds(110,20,295,20);
            button1.setBounds(200,60,100,30);
            button2.setBounds(410,20,50,20);
            button1.addActionListener(this);//添加事件处理
            button2.addActionListener(this);//添加事件处理

            con.add(label2);
            con.add(text2);
            con.add(button1);
            con.add(button2);
            con.add(jfc);
            tabPane.add("文件选择",con);//添加布局1
            frame.setVisible(true);//窗口可见
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//使能关闭窗口，结束程序
        }
        public void actionPerformed(ActionEvent e){//事件处理
            if(e.getSource().equals(button1)){//判断触发方法的按钮是哪个

                VpkUnzip.filePath  = text2.getText();
                int res = VpkUnzip.unzipFile();

                if(res==1)
                {
                    JOptionPane.showMessageDialog(frame, "解压出错！请使用360解压之类软件自行解压缩为符合VitaShellRui安装格式");
                }
                else
                {
                    JOptionPane.showMessageDialog(frame, "解压成功!请将该目录下同名文件夹复制到机器上安装");
                }

                text2.setText("");

            }
            if(e.getSource().equals(button2)){
                jfc.setFileSelectionMode(0);//设定只能选择到文件

                //create a FileFilter and override its accept-method
                FileFilter filefilter = new FileFilter() {

                    public boolean accept(File file) {
                        //if the file extension is .txt return true, else false
                        if(file.isDirectory())
                        {
                            return true;
                        }


                        if (file.getName().toLowerCase().endsWith(".vpk")) {
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public String getDescription() {
                        return "vpk文件";
                    }
                };

                jfc.setFileFilter(filefilter);
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
            new vpkSplitGUI();
        }

}
