/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KIEMTRA1TIET;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class StudentDAO {

    public boolean insert(Student stud) throws Exception {
        String sql = "insert into dbo.Sinhvien3(masv, hoten, email, sodt, gioitinh, diachi) values (?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = ConnectDatabase.getConnection();
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, stud.getMaSV());
        pstmt.setString(2, stud.getHoTen());
        pstmt.setString(3, stud.getEmail());
        pstmt.setString(4, stud.getSoDT());
        pstmt.setString(5, stud.getGioiTinh());
        pstmt.setString(6, stud.getDiaChi());
        return pstmt.executeUpdate() > 0;
    }

    public Student FindByid(int Masv) throws Exception {
        String sql = "select * from Student where=?";
        try (
                Connection conn = ConnectDatabase.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setInt(1, Masv);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Student stud = new Student();
                stud.setMaSV(rs.getInt("Ma SV"));
                stud.setHoTen(rs.getString("Ho ten"));
                stud.setEmail(rs.getString("Email"));
                stud.setSoDT(rs.getString("So DT"));
                stud.setGioiTinh(rs.getString("Gioi Tinh"));
                stud.setDiaChi(rs.getString("Dia chi"));
                return stud;
            }
            return null;

        }
    }

    public static ArrayList<Student> getListStudent() throws Exception {
        ArrayList<Student> list = new ArrayList<>();
        Connection conn = ConnectDatabase.getConnection();
        try {
            Statement stmt = conn.createStatement();
            //get data from table
            String sql = "select * from Student";
            ResultSet rs = stmt.executeQuery(sql);
            //show data
            while (rs.next()) {
                Student std = new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                list.add(std);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
        }
        return list;
    }

}
