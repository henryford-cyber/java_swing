 
package BaiTap7;
import java.sql.*;   
import java.sql.Connection; 
import java.sql.DriverManager;
 

public class KetnoiSach {
         

 public static Connection getConnection() throws Exception {
        
           Connection conn = null;
           String userName = "sa";
           String password = "1234567";
           String url = "jdbc:sqlserver://DESKTOP-FO8QLMB\\SQLEXPRESS:1433;databaseName = quanlySach";
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection(url, userName, password);
if(conn!=null){
           System.out.println("Kết Nối Thành Công ");}

            return conn;
            
               
     
    }

    static Connection getConnection(String userName, String password, String dbURL) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
