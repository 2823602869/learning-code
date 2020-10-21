

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;

public class Newtest extends javax.swing.JFrame {
    public static void main(String[] args) {
        Newtest f = new Newtest();
    }

    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField jTextField;
    JPasswordField jPasswordField;
    JButton rb1;

    JButton bt1;


    public Newtest() {
        this.setVisible(true);

        this.setSize(250, 220);
        this.setVisible(true);
        this.setLocation(400, 200);

        label1 = new JLabel("欢迎登陆学生管理系统",JLabel.CENTER);
        label1.setFont(new Font("宋体",1,24));
        label2 = new JLabel("账号：");
        label3 = new JLabel("密码：");
        jTextField = new JTextField();
        jPasswordField = new JPasswordField();
        rb1 = new JButton("注册");
        bt1 = new JButton("登陆");
        // 为指定的 Container 创建 GroupLayout
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        //创建GroupLayout的水平连续组，，越先加入的ParallelGroup，优先级级别越高。
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGap(5);//添加间隔
        hGroup.addGroup(layout.createParallelGroup().addComponent(label2)
                .addComponent(label3)
        );
        hGroup.addGap(5);//添加间隔
        hGroup.addGroup(layout.createParallelGroup().addComponent(label1)
                .addComponent(jPasswordField).addComponent(rb1)
                .addComponent(jTextField).addComponent(bt1));
        hGroup.addGap(5);//添加间隔
        layout.setHorizontalGroup(hGroup);
        //创建GroupLayout的垂直连续组，，越先加入的ParallelGroup，优先级级别越高。
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGap(10);//添加间隔
        vGroup.addGroup(layout.createParallelGroup().addComponent(label1));
        vGroup.addGap(10);//添加间隔
        vGroup.addGroup(layout.createParallelGroup().addComponent(label2)
                .addComponent(jTextField));
        vGroup.addGap(5);//添加间隔
        vGroup.addGroup(layout.createParallelGroup().addComponent(label3)
                .addComponent(jPasswordField));
        vGroup.addGap(5);
        vGroup.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(bt1));
        vGroup.addGap(5);
        vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(rb1));
        vGroup.addGap(10);//添加间隔
        //设置垂直组
        layout.setVerticalGroup(vGroup);
    }
}