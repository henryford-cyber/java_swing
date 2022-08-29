 
package edu.namphan.kiemtra1tiet3.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class DatabaseConnection {
    
public static String userName = "root";
    public static String password = "";
    public static String dbURL = "jdbc:mysql://localhost:3306/ql_sinhvien";

    public static Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

}
