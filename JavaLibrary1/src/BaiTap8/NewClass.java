/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap8;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class NewClass {
public NewClass(){
try{
  Connection conn = null;
           String userName = "sa";
           String password = "1234567";
           String url = "jdbc:sqlserver://DESKTOP-FO8QLMB\\SQLEXPRESS:1433;databaseName = Quanly_SV";
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           conn = DriverManager.getConnection(url, userName, password);
if(conn!=null){
           System.out.println("Kết Nối Thành Công ");}
}catch(Exception e){
e.printStackTrace();
}
 
}
public static void main(String[] args){
new NewClass();
}
   

}
