import javax.swing.*;
import java.awt.*;

/**
 * ѧ������ϵͳgui
 */
public class Studentadmin extends JFrame{
    public static void main(String[] args) {
        StudentGui();
    }
    public static void StudentGui(){
        JFrame jFrame = new JFrame("ѧ������ϵͳ"); //����
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("��ӭ��½ѧ������ϵͳ", JLabel.CENTER); //�����ǩ
        jLabel.setFont(new Font("����",1,24));
        JLabel jLabel1 = new JLabel("�û�����"); // �û���
        JLabel jLabel2 = new JLabel("���룺"); // ����
        JTextField jTextField = new JTextField(); //�û�������
        JTextField jTextField1 = new JTextField(); //��������
        JButton jButton = new JButton("��½");
        JButton jButton1 = new JButton("ע��");

        JPanel jPanel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(jPanel);
        jPanel.setLayout(groupLayout);
        // �Զ��������֮��ļ�϶
        groupLayout.setAutoCreateGaps(true);
        // �Զ����������봥�������߿�����֮��ļ�϶
        groupLayout.setAutoCreateContainerGaps(true);

        // ˮƽ���У����£� btn01 �� btn02
        GroupLayout.ParallelGroup hParalGroup01 = groupLayout.createParallelGroup().addComponent(jLabel1).addComponent(jLabel2);

        // ˮƽ���У����£�btn03 �� btn04
        GroupLayout.ParallelGroup hParalGroup02 = groupLayout.createParallelGroup().addComponent(jTextField).addComponent(jTextField1);

        // ˮƽ���У����ң�hParalGroup01 �� hParalGroup02
        GroupLayout.SequentialGroup hSeqGroup = groupLayout.createSequentialGroup().addGroup(hParalGroup01).addGroup(hParalGroup02);
        groupLayout.setHorizontalGroup(hSeqGroup);
        /**
        // ��ֱ���У����ң�btn01 �� btn03
        GroupLayout.ParallelGroup hParalGroup01 = groupLayout.createParallelGroup().addComponent(jLabel1).addComponent(jLabel2,GroupLayout.PREFERRED_SIZE,65,GroupLayout.PREFERRED_SIZE);
        // ��ֱ���У����ң�btn02 �� btn04
        GroupLayout.ParallelGroup hParalGroup02 = groupLayout.createParallelGroup().addComponent(jTextField).addComponent(jTextField1);
        // ˮƽ���У����ң�hParalGroup01 �� hParalGroup02
        GroupLayout.SequentialGroup hSeqGroup = groupLayout.createSequentialGroup().addGroup(hParalGroup01).addGroup(hParalGroup02);
        groupLayout.setHorizontalGroup(hSeqGroup);
        */
        jFrame.setContentPane(jPanel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
