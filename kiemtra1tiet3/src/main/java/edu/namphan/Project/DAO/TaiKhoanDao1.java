/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.namphan.Project.DAO;

import edu.namphan.Project.Config.JDBCConnection;
import com.mysql.cj.xdevapi.PreparableStatement;
import edu.namphan.Project.Model.Taikhoan;
import edu.namphan.kiemtra1tiet3.utils.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanDao1 {

    public void insert(Taikhoan tk) throws Exception {
        String sql = "insert into taikhoan(tendangnhap, matkhau,vaitro) values (?,?,?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = JDBCConnection.getConnection();
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, tk.getTendangnhap());
        pstmt.setString(2, tk.getMatkhau());
        pstmt.setString(3, tk.getVaitro());
        pstmt.execute();
    }

    public void update(Taikhoan tk) throws Exception {
        String sql = "update taikhoan set tendangnhap=?, matkhau=? ,vaitro=?" + " where mataikhoan=" + tk.getMataikhoan();
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = JDBCConnection.getConnection();
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, tk.getTendangnhap());
        pstmt.setString(2, tk.getMatkhau());
        pstmt.setString(3, tk.getVaitro());
        pstmt.executeUpdate();
    }

    public Taikhoan FindByName(String name) throws Exception {
        String sql = "select *from taikhoan where tendangnhap = ?";
        try (
                Connection conn = JDBCConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Taikhoan TK = new Taikhoan();
                TK.setMataikhoan(rs.getInt("mataikhoan"));
                TK.setTendangnhap(rs.getString("tendangnhap"));
                TK.setMatkhau(rs.getString("matkhau"));
                TK.setVaitro(rs.getString("vaitro"));
                return TK;
            }
            return null;
        }
    }

    public boolean Delete(String name) throws SQLException {
        String sql = "delete from taikhoan where tendangnhap = ?";
        try (
                Connection conn = JDBCConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, name);
            return pstmt.executeUpdate() > 0;
        }

    }

    public List<Taikhoan> getAllTaiKhoan() {
        Connection conn;
        conn = JDBCConnection.getConnection();
        List<Taikhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM taikhoan";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Taikhoan tk = new Taikhoan();
                tk.setMataikhoan(rs.getInt(1));
                tk.setTendangnhap(rs.getString(2));
                tk.setMatkhau(rs.getString(3));
                tk.setVaitro(rs.getString(4));

                list.add(tk);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi ở getalltaikhoan");
            e.printStackTrace();
        }
        return list;
    }
}
