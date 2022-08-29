/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 
public class DatabaseConnection {
    
public static String userName = "root";
    public static String password = "";
    public static String dbURL = "jdbc:mysql://localhost:3306/quanly_sinhvien";

    public static Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("connect failure!");
        }
        return conn;
    }

public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
