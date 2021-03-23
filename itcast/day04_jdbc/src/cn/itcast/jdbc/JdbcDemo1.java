package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC快速入门
 * @author ASUS
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        //2.注册驱动(mysql5之后的驱动jar包可以省略注册驱动的步骤)
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据困的连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
        //4.定义sql语句
//        String sql = "update account set balance = 500 where id = 1";
        String sql = "update account set balance = 2000";
        //5.获取执行sql的对象，Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
