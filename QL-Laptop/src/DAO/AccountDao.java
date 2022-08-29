/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.MySqlConnect;

import Model.Account;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import View.LoginView;
import java.util.Date;

public class AccountDao {

    public static char[] sb = {'$', '#', '@'};
    public static char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    Connection conn;
    ResultSet rs;
    LoginView view;

    public List<Account> getAccount() {
        conn = MySqlConnect.ConnectDb();
        List<Account> list = new ArrayList<>();
        String sql = "SELECT * FROM taikhoan";
        try {
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Account tk = new Account();
                tk.setMataikhoan(rs.getString(1));
                tk.setHoten(rs.getString(2));
                tk.setNgaysinh(rs.getString(3));
                tk.setCmnd(rs.getString(4));
                tk.setTendangnhap(rs.getString(5));
                tk.setMatkhau(rs.getString(6));
                tk.setDienthoai(rs.getInt(7));
                tk.setDiachi(rs.getString(8));
                tk.setGioitinh(rs.getString(9));
                tk.setTinhtrang(rs.getString(10));
                tk.setVaitro(rs.getString(11));

                list.add(tk);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi ở getAdmin");
            e.printStackTrace();
        }
        return list;
    }

    public static Boolean checkNum(String s) {

        boolean b = false;
        char a[] = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (a[i] == num[j]) {
                    b = true;
                }
            }
        }
        return b;
    }

    public void insert(Account account) {
        String sqlquery = "SELECT `tendangnhap` FROM `taikhoan` WHERE `tendangnhap`=?";
        String sql = "INSERT INTO `taikhoan`(`mataikhoan`,`hoten`, `ngaysinh`, `cmnd`, `tendangnhap`, `matkhau`, `dienthoai`, `diachi`, `gioitinh`, `tinhtrang`, `vaitro`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstmt;

        try {
            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, account.getMataikhoan());
            pstmt.setString(2, account.getHoten());
            pstmt.setString(3, account.getNgaysinh());
            pstmt.setString(4, account.getCmnd());
            pstmt.setString(5, account.getTendangnhap());
            pstmt.setString(6, account.getMatkhau());
            pstmt.setInt(7, account.getDienthoai());
            pstmt.setString(8, account.getDiachi());
            pstmt.setString(9, account.getGioitinh());
            pstmt.setString(10, account.getTinhtrang());
            pstmt.setString(11, account.getVaitro());
            pstmt.execute();
        } catch (SQLException e) {
        }
    }

    public void update(Account account) {
        String sql = "update taikhoan set mataikhoan=?,hoten=?,ngaysinh=?, cmnd=?,tendanhnhap =?,matkhau=?,dienthoai=?,diachi=?,gioitinh =?,tinhtrang=?,vaitro=?" + " where mataikhoan=" + account.getMataikhoan();
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, account.getMataikhoan());
            pstmt.setString(2, account.getHoten());
            pstmt.setString(3, account.getNgaysinh());
            pstmt.setString(4, account.getCmnd());
            pstmt.setString(5, account.getTendangnhap());
            pstmt.setString(6, account.getMatkhau());
            pstmt.setInt(7, account.getDienthoai());
            pstmt.setString(8, account.getDiachi());
            pstmt.setString(9, account.getGioitinh());
            pstmt.setString(10, account.getTinhtrang());
            pstmt.setString(11, account.getVaitro());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Account FindByID(String mataikhoan) {
        String sql = "select *from taikhoan where mataikhoan= ?";
        try {
            conn = MySqlConnect.ConnectDb();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mataikhoan);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Account accc = new Account();
                accc.setMataikhoan(rs.getString(1));
                accc.setHoten(rs.getString(2));
                accc.setNgaysinh(rs.getString(3));
                accc.setCmnd(rs.getString(4));
                accc.setTendangnhap(rs.getString(5));
                accc.setMatkhau(rs.getString(6));
                accc.setDienthoai(rs.getInt(7));
                accc.setDiachi(rs.getString(8));
                accc.setGioitinh(rs.getString(9));
                accc.setTinhtrang(rs.getString(10));
                accc.setVaitro(rs.getString(11));
                return accc;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public boolean Delete(String mataikhoan) throws SQLException {
        String sql = "delete from taikhoan where mataikhoan = ?";
        try (
                Connection  conn = MySqlConnect.ConnectDb();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1,mataikhoan);
            return pstmt.executeUpdate() > 0;
        }

    }

}
