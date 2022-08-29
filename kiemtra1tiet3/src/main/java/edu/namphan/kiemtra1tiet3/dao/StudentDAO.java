/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.namphan.kiemtra1tiet3.dao;

import edu.namphan.kiemtra1tiet3.model.Student;
import edu.namphan.kiemtra1tiet3.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class StudentDAO {

    public void insert(Student std) throws Exception {
        String sql = "insert into Student(name, email, phone, address, gender) values (?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = DatabaseConnection.getConnection();
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, std.getName());
        pstmt.setString(2, std.getEmail());
        pstmt.setString(3, std.getPhone());
        pstmt.setString(4, std.getAddress());
        pstmt.setBoolean(5, std.isGender());
        pstmt.execute();
    }
public void update(Student std) throws Exception {
        String sql ="update Student set name=?,email =?, phone=?,gender=?,address=?"+" where id="+ std.getId();
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = DatabaseConnection.getConnection();
        pstmt = conn.prepareStatement(sql);  
        pstmt.setString(1, std.getName());
        pstmt.setString(2, std.getEmail());
        pstmt.setString(3, std.getPhone());
        pstmt.setString(5, std.getAddress());
        pstmt.setBoolean(4, std.isGender());
        pstmt.executeUpdate(); 
    }
public Student FindByName(String Name) throws Exception {
        String sql = "select *from Student where name = ?";
        try (
                Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1,Name);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Student st = new Student();
               st.setId(rs.getInt("ID"));
                st.setName(rs.getString("Name"));
                st.setEmail(rs.getString("Email"));
                st.setPhone(rs.getString("Phone")); 
                st.setGender(rs.getBoolean("Gender"));
                st.setAddress(rs.getString("Address"));
                return st;
            }
            return null;

        }
    }
public boolean Delete(String Name) throws SQLException{
String sql="delete from Student where name = ?";
try(
Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
) {
pstmt.setString(1,Name);
return pstmt.executeUpdate()>0;
}


}

    public static ArrayList<Student> getListStudent() throws Exception {
        ArrayList<Student> list = new ArrayList<>();
        Connection conn = DatabaseConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            //get data from table
            String sql = "select * from Student";
            ResultSet rs = stmt.executeQuery(sql);
            //show data
            while (rs.next()) {
                Student std = new Student(
                        rs.getInt("id"),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(6),
                        rs.getString(5)

                );
                list.add(std);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
