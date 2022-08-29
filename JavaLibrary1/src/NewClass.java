
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class NewClass {

 public static void main(String args[]) throws ClassNotFoundException {
        
        Connection DemoConect = null;
       try {
           String userName = "sa";
           String password = "1234567";
           String url = "jdbc:sqlserver://DESKTOP-FO8QLMB\\SQLEXPRESS:1433;databaseName = quanlykhachsan";
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           DemoConect = DriverManager.getConnection(url, userName, password);
           
           DatabaseMetaData dm =(DatabaseMetaData) DemoConect.getMetaData();
        if(DemoConect != null){
           System.out.println("Đã kết nối cơ sở dữ liệu");
           System.out.println("Driver name: " +dm.getDriverName() );
           System.out.println("Driver version : "+dm.getDriverVersion());
           System.out.println("Product name : "+ dm.getDatabaseProductName());
           System.out.println("Product version : "+dm.getDatabaseProductVersion());

        }
       } catch(SQLException ex) {
           System.out.println(" Kết nối không thành công"+ ex);
           ex.printStackTrace();
       } finally {
            if (DemoConect != null) {
                try {
                    DemoConect.close();
                    System.out.println("Đóng kết nối");
                } catch (Exception e ) {
                   
                }
            }
       }
    }
    
}
