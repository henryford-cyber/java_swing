/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteam;

import java.sql.*;
import javax.swing.*;
import quanlylaptop.MySqlConnect;
//import net.proteanit.sql.*;
        
public class UpdateTable {
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;
    public static Connection con = MySqlConnect.ConnectDb();
    
    public static void LoadData(String sql , JTable tb){
        try {
            ps= con.prepareStatement(sql);
            rs=ps.executeQuery();
            //tb.setModel((DbUtils.resultSetToTableModel(rs)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Thong bao loi", 1);
        }
        
    }
    public static ResultSet ShowTextField(String sql){
        try {
            ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
//            JOptionPane.showMessageDialog(null, e, "Thong bao loi", 1);
        }
    }
}
