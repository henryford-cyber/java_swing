/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteam;

import static Iteam.BtnLoaiSanPham.con;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import quanlylaptop.*;

public class BtnSanPham {

    public static Connection con;
    public static PreparedStatement ps = null;
    public static ResultSet rs = null;

    public static void themSP(int masp, int loaisp, String tensp, double gia, String linhkien, String khuyenmai, String thongso, String baiviet, String baohanh, int soluong) {
        String sql = "INSERT INTO `sanpham` (`masp`,`loaisp`, `tensp`, `gia`, `linhkien`, `khuyenmai`, `thongso`, `baiviet`, `baohanh`, `soluong`) VALUES (?,?, ?, ?, ?, ?, ?,?,?,?)";
 
        try {
            ps = con.prepareStatement(sql);
             ps.setInt(1, masp);
            ps.setInt(2, loaisp);
            ps.setString(3, tensp);
            ps.setDouble(4, gia);
            ps.setString(5, linhkien);
            ps.setString(6, khuyenmai);
            ps.setString(7, thongso);
            ps.setString(8, baiviet);
            ps.setString(9, baohanh);
            ps.setInt(10, soluong);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm  sản phẩm" + tensp + " ", "Thông báo", 1);
        } catch (SQLException ex) {
            Logger.getLogger(BtnSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void suaSP(String masp1, int masp, int loaisp , String tensp, Double gia, String linhkien, String khuyenmai, String thongso, String baiviet, String baohanh, int soluong) {
        String sql = "UPDATE `sanpham` SET `masp` = '" + masp + "', `loaisp` = '" + loaisp + "', `tensp` = '" + tensp + "', `gia` = '" + gia + "', `linhkien` = '" + linhkien + "', `khuyenmai` = '" + khuyenmai + "', `thongso` = '" + thongso + "', `baiviet` = '" + baiviet + "', `baohanh` = '" + baohanh + "', `soluong` = '" + soluong + "' WHERE `sanpham`.`masp` = '" + masp1 + "'";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            ps = con.prepareStatement(sql);
            ps.execute();
              JOptionPane.showMessageDialog(null, "Đã sửa sản phẩm" + masp1 + " ", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm" + masp1 + "đã tồn tại!! Không thể thêm", "Thông báo", 1);
        }
    }
    public static void xoaSP(String masp){
    String sql = "DELETE FROM `quanlysach`.`sanpham` WHERE `sanpham`.`masp` = '"+masp+"'";
        try {
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            ps = con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bạn có chắc xóa sản phẩm" + masp + "này ","Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sản phẩm" + masp + "có thể được sử dụng ở thực thể khác!Không thể xóa ", "Thông báo", 1);
        }
    }
}