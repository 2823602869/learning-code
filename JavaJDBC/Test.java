/**
 * ���ݿ�����
 * ��ͨ��jdbcʵ��ͼ��ݿ�����ӡ�ɾ�����޸�ͼ����Ϣ��������ӡ�ɾ������
 * �Ľ�������Ϣ��
 * 1.jdbc����
 */

package JavaJDBC;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/taoli?usessl=falase&character=UTF-8&serverTimezone=UTC&characterEncoding=UTF8&serverTimezone=UTC";
            String user = "root";
            String pawd = "20010326";
                // ��ʼ��jdbc
                Connection con = DriverManager.getConnection(url,user,pawd);
                String sql = "show databases";
                String sql1 = "insert into test values(2,'����a')";
                // ���ڽ�SQL��䷢�͵����ݿ�
                Statement st = con.createStatement();
                System.out.println(st.execute(sql));
                System.out.println(st.execute(sql1));

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
