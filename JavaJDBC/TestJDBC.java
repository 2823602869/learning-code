package JavaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * ���ݿ�����
 */
public class TestJDBC {
    public static void main(String[] args) {
        Connection con;
        //jdbc����
        String driver="com.mysql.cj.jdbc.Driver";
        //�����ҵ����ݿ���taoli
        String url="jdbc:mysql://localhost:3306/taoli?usessl=false&character=utf-8&serverTimezone=UTC";
        String user="root";
        String password="20010326";
        try {
            //ע��JDBC��������
            Class.forName(driver);
            //��������
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("���ݿ����ӳɹ�");
            }
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("���ݿ�����û�а�װ");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("���ݿ�����ʧ��");
        }
    }
}