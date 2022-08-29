/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;

/**
 *
 * @author Tai
 */
public class MySqlConnect {
public static String userName = "root";
    public static String password = "";
    public static String dbURL = "jdbc:mysql://localhost:3306/quanlylaptop1";
    public static Connection ConnectDb(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception e) {
            System.out.println("Lỗi ở kết nối DATABASE");
        }
        return conn;
    }
    public static void main(String[] args) {
        ConnectDb();
    }
}