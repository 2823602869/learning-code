

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

        label1 = new JLabel("��ӭ��½ѧ������ϵͳ",JLabel.CENTER);
        label1.setFont(new Font("����",1,24));
        label2 = new JLabel("�˺ţ�");
        label3 = new JLabel("���룺");
        jTextField = new JTextField();
        jPasswordField = new JPasswordField();
        rb1 = new JButton("ע��");
        bt1 = new JButton("��½");
        // Ϊָ���� Container ���� GroupLayout
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        //����GroupLayout��ˮƽ�����飬��Խ�ȼ����ParallelGroup�����ȼ�����Խ�ߡ�
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGap(5);//��Ӽ��
        hGroup.addGroup(layout.createParallelGroup().addComponent(label2)
                .addComponent(label3)
        );
        hGroup.addGap(5);//��Ӽ��
        hGroup.addGroup(layout.createParallelGroup().addComponent(label1)
                .addComponent(jPasswordField).addComponent(rb1)
                .addComponent(jTextField).addComponent(bt1));
        hGroup.addGap(5);//��Ӽ��
        layout.setHorizontalGroup(hGroup);
        //����GroupLayout�Ĵ�ֱ�����飬��Խ�ȼ����ParallelGroup�����ȼ�����Խ�ߡ�
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addGap(10);//��Ӽ��
        vGroup.addGroup(layout.createParallelGroup().addComponent(label1));
        vGroup.addGap(10);//��Ӽ��
        vGroup.addGroup(layout.createParallelGroup().addComponent(label2)
                .addComponent(jTextField));
        vGroup.addGap(5);//��Ӽ��
        vGroup.addGroup(layout.createParallelGroup().addComponent(label3)
                .addComponent(jPasswordField));
        vGroup.addGap(5);
        vGroup.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(bt1));
        vGroup.addGap(5);
        vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(rb1));
        vGroup.addGap(10);//��Ӽ��
        //���ô�ֱ��
        layout.setVerticalGroup(vGroup);
    }
}