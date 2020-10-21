/**
 * 数据库连接
 * （通过jdbc实现图书馆可以添加、删除、修改图书信息，可以添加、删除、修
 * 改借书者信息）
 * 1.jdbc连接
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
                // 初始化jdbc
                Connection con = DriverManager.getConnection(url,user,pawd);
                String sql = "show databases";
                String sql1 = "insert into test values(2,'桃李a')";
                // 用于将SQL语句发送到数据库
                Statement st = con.createStatement();
                System.out.println(st.execute(sql));
                System.out.println(st.execute(sql1));

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
