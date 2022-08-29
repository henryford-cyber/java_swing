import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class testconect {
       private static String userName = "sa";
       private static String password = "1234567";
       private static String url = "jdbc:sqlserver://DESKTOP-FO8QLMB\\SQLEXPRESS:1433;databaseName = quanlykhachsan";

 public static void main(String args[]) throws ClassNotFoundException {
        
        Connection DemoConect = null;
       try { 
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           DemoConect = DriverManager.getConnection(url, userName, password);
           
           DatabaseMetaData dm =(DatabaseMetaData) DemoConect.getMetaData();
        Statement stmt=DemoConect.createStatement();
        String caulenhSQL = "select * from tbl_khachhang";
        ResultSet rs = stmt .executeQuery(caulenhSQL);
        while(rs.next()){
              System.out.println(rs.getString(1)+" " + rs.getString(2)+" " + rs.getString(3)+" " +rs.getString(4)+" " +rs.getString(5)+" " + rs.getString(6));
        }
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
