/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import quanlylaptop.MySqlConnect;

/**
 *
 * @author ADMIN
 */
public class AdminDao {

    public List<Admin> getAdmin() {
        Connection conn;
        conn = MySqlConnect.ConnectDb();
        List<Admin> list = new ArrayList<>();
        String sql = "SELECT * FROM admin";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Admin tk = new Admin();
                tk.setMaadmin(rs.getInt(1));
                tk.setTenadmin(rs.getString(2));
                tk.setNgaysinh(rs.getDate(3));
                tk.setCmnd(rs.getString(4));
                tk.setTendangnhap(rs.getString(5));
                tk.setMatkhau(rs.getString(6));
                tk.setDienthoai(rs.getInt(7));
                tk.setDiachi(rs.getString(8));
                tk.setGioitinh(rs.getString(9));

                list.add(tk);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi ở getAdmin");
            e.printStackTrace();
        }
        return list;
    }

}
