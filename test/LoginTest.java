package com.taoli.test;

/**
 * @program: JavaTraining
 * @description ѧ������ϵͳ��½ҳ��
 * @create: 2020-10-21 10:22
 * @author: taoli
 **/

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LoginTest extends JFrame {

    JLabel title = new JLabel("��ӭ��½ѧ������ϵͳ",JLabel.CENTER);
    JLabel loginUser = new JLabel("�û�����");
    JTextField print = new JTextField();
    JLabel loginpswd = new JLabel("���룺");
    JPasswordField passwd = new JPasswordField();
    //������ť
    JButton login = new JButton("��½");
    JButton register = new JButton("ע��");
    // ���Բ���
    SpringLayout springLayout = new SpringLayout();
    JPanel centerpanel = new JPanel(springLayout);
    public static void main(String[] args) {
        new LoginTest();
    }

    public LoginTest(){
        Container contentPane = getContentPane();
        title.setFont(new Font("�����п�",Font.PLAIN,40));
        Font centerFont = new Font("����", 1, 15);
        loginUser.setFont(centerFont);
        print.setPreferredSize(new Dimension(200,30));
        loginpswd.setFont(centerFont);
        passwd.setPreferredSize(new Dimension(200,30));
        login.setFont(centerFont);
        register.setFont(centerFont);
        // ����������
        centerpanel.add(loginUser);
        centerpanel.add(print);
        centerpanel.add(loginpswd);
        centerpanel.add(passwd);
        centerpanel.add(login);
        centerpanel.add(register);
        contentPane.add(title,BorderLayout.NORTH);
        contentPane.add(centerpanel,BorderLayout.CENTER);
        // ����
        Spring sum = Spring.sum(Spring.sum(Spring.width(loginUser), Spring.width(print)), Spring.constant(20));
        int x = sum.getValue()/2;
        //loginUser
        springLayout.putConstraint(SpringLayout.WEST,loginUser,-x,SpringLayout.HORIZONTAL_CENTER,centerpanel);
        springLayout.putConstraint(SpringLayout.NORTH,loginUser,20,SpringLayout.NORTH,centerpanel);
        //print
        springLayout.putConstraint(SpringLayout.WEST,print,20,SpringLayout.EAST,loginUser);
        springLayout.putConstraint(SpringLayout.NORTH,print,0,SpringLayout.NORTH,loginUser);
        //loginpswd
        springLayout.putConstraint(SpringLayout.EAST,loginpswd,0,SpringLayout.EAST,loginUser);
        springLayout.putConstraint(SpringLayout.NORTH,loginpswd,20,SpringLayout.SOUTH,loginUser);
        //passwd
        springLayout.putConstraint(SpringLayout.WEST,passwd,20,SpringLayout.EAST,loginpswd);
        springLayout.putConstraint(SpringLayout.NORTH,passwd,0,SpringLayout.NORTH,loginpswd);
        //login
        springLayout.putConstraint(SpringLayout.WEST,login,20,SpringLayout.EAST,loginpswd);
        springLayout.putConstraint(SpringLayout.NORTH,login,20,SpringLayout.SOUTH,loginpswd);
        //register
        springLayout.putConstraint(SpringLayout.WEST,register,30,SpringLayout.EAST,login);
        springLayout.putConstraint(SpringLayout.NORTH,register,0,SpringLayout.NORTH,login);

        this.setTitle("ѧ������ϵͳ");
        URL Connection = LoginTest.class.getResource("logo.png");
        Image imageIcon = new ImageIcon(Connection).getImage();
        this.setIconImage(imageIcon);
        this.setSize(500,300);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}