/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteam;

import java.sql.*;
import javax.swing.*;
import quanlylaptop.*;

public class BtnLoaiSanPham {

    public static Connection con ;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;

    public static void themLSP(String malsp, String tenlsp) {
        String sql = "INSERT INTO `quanlysach`.`loaisanpham` (`malsp`, `tenlsp`) VALUES (?, ?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            ps = con.prepareStatement(sql);
            ps.setString(1, malsp);
            ps.setString(2, tenlsp);
            ps.execute();

            JOptionPane.showMessageDialog(null, "Đã thêm loại sản phẩm" + tenlsp + " ", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã loại sản phẩm" + malsp + "đã tồn tại!! Không thể thêm", "Thông báo", 1);
            
        }

    }

    public static void suaLSP(String malsp1, String malsp, String tenlsp) {
        String sql = "UPDATE `quanlysach`.`loaisanpham` SET `malsp` = '" + malsp + "', `tenlsp` = '" + tenlsp + "' WHERE `loaisanpham`.`malsp` = '" + malsp1 + "'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            ps = con.prepareStatement(sql);
            ps.execute();

            JOptionPane.showMessageDialog(null, "Đã sửa loại sản phẩm" + malsp1 + " ", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã loại sản phẩm" + malsp1 + "đã tồn tại!! Không thể thêm", "Thông báo", 1);
        }
    }

    public static void xoaLSP(String malsp) {
        String sql = "DELETE FROM `quanlysach`.`loaisanpham` WHERE `loaisanpham`.`malsp` = '" + malsp + "'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            ps = con.prepareStatement(sql);
            ps.execute();
             JOptionPane.showMessageDialog(null, "Loại sản phẩm" + malsp + "đã được xóa ", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loại sản phẩm" + malsp + "có thể được sử dụng ở thực thể khác!Không thể xóa ", "Thông báo", 1);
        }
    }
}