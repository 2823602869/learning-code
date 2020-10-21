import javax.swing.*;
import java.awt.*;

/**
 * 学生管理系统gui
 */
public class Studentadmin extends JFrame{
    public static void main(String[] args) {
        StudentGui();
    }
    public static void StudentGui(){
        JFrame jFrame = new JFrame("学生管理系统"); //窗口
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("欢迎登陆学生管理系统", JLabel.CENTER); //标题标签
        jLabel.setFont(new Font("宋体",1,24));
        JLabel jLabel1 = new JLabel("用户名："); // 用户名
        JLabel jLabel2 = new JLabel("密码："); // 密码
        JTextField jTextField = new JTextField(); //用户名输入
        JTextField jTextField1 = new JTextField(); //密码输入
        JButton jButton = new JButton("登陆");
        JButton jButton1 = new JButton("注册");

        JPanel jPanel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(jPanel);
        jPanel.setLayout(groupLayout);
        // 自动创建组件之间的间隙
        groupLayout.setAutoCreateGaps(true);
        // 自动创建容器与触到容器边框的组件之间的间隙
        groupLayout.setAutoCreateContainerGaps(true);

        // 水平并行（上下） btn01 和 btn02
        GroupLayout.ParallelGroup hParalGroup01 = groupLayout.createParallelGroup().addComponent(jLabel1).addComponent(jLabel2);

        // 水平并行（上下）btn03 和 btn04
        GroupLayout.ParallelGroup hParalGroup02 = groupLayout.createParallelGroup().addComponent(jTextField).addComponent(jTextField1);

        // 水平串行（左右）hParalGroup01 和 hParalGroup02
        GroupLayout.SequentialGroup hSeqGroup = groupLayout.createSequentialGroup().addGroup(hParalGroup01).addGroup(hParalGroup02);
        groupLayout.setHorizontalGroup(hSeqGroup);
        /**
        // 垂直并行（左右）btn01 和 btn03
        GroupLayout.ParallelGroup hParalGroup01 = groupLayout.createParallelGroup().addComponent(jLabel1).addComponent(jLabel2,GroupLayout.PREFERRED_SIZE,65,GroupLayout.PREFERRED_SIZE);
        // 垂直并行（左右）btn02 和 btn04
        GroupLayout.ParallelGroup hParalGroup02 = groupLayout.createParallelGroup().addComponent(jTextField).addComponent(jTextField1);
        // 水平串行（左右）hParalGroup01 和 hParalGroup02
        GroupLayout.SequentialGroup hSeqGroup = groupLayout.createSequentialGroup().addGroup(hParalGroup01).addGroup(hParalGroup02);
        groupLayout.setHorizontalGroup(hSeqGroup);
        */
        jFrame.setContentPane(jPanel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
