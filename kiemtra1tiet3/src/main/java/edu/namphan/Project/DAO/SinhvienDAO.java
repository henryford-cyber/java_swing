package edu.namphan.Project.DAO;

import edu.namphan.Project.Config.JDBCConnection;
import edu.namphan.Project.Model.Sinhvien;
import edu.namphan.Project.View.SinhvienJPanel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class SinhvienDAO {

    DefaultTableModel tbl = new DefaultTableModel();
    private SinhvienJPanel view;
    private List<Sinhvien> listSinhvien = new ArrayList<>();

    public static void insert(Sinhvien sv) {
        String sql = "insert into sinhvien(name, birtday, gender,phonenumber, email,  address) values (?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = JDBCConnection.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sv.getName());
            pstmt.setString(2, sv.getBirtday());
            pstmt.setString(3, sv.getGender());
            pstmt.setString(4, sv.getPhonenumber());
            pstmt.setString(5, sv.getEmail());
            pstmt.setString(6, sv.getAddress());
            pstmt.execute();
        } catch (Exception e) {
        }

    }

    public void update(Sinhvien sv) throws Exception {
        String sql = "update sinhvien set name=?,birtday=?,gender=?, phonenumber=?,email =?,address=?" + " where id=" + sv.getId();
        Connection conn = null;
        PreparedStatement pstmt = null;

        conn = JDBCConnection.getConnection();
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, sv.getName());
        pstmt.setString(2, sv.getBirtday());
        pstmt.setString(3, sv.getGender());
        pstmt.setString(4, sv.getPhonenumber());
        pstmt.setString(5, sv.getEmail());
        pstmt.setString(6, sv.getAddress());
        pstmt.executeUpdate();
    }

    public Sinhvien FindByName(String Name) throws Exception {
        String sql = "select *from sinhvien where name = ?";
        try (
                Connection conn = JDBCConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, Name);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Sinhvien st = new Sinhvien();
                st.setId(rs.getInt("ID"));
                st.setName(rs.getString("Name"));
                st.setBirtday(rs.getString("Birtday"));
                st.setGender(rs.getString("Gender"));
                st.setPhonenumber(rs.getString("Phonenumber"));
                st.setEmail(rs.getString("Email"));
                st.setAddress(rs.getString("Address"));
                return st;
            }
            return null;

        }
    }

    public boolean Delete(String Name) throws SQLException {
        String sql = "delete from sinhvien where name = ?";
        try (
                Connection conn = JDBCConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, Name);
            return pstmt.executeUpdate() > 0;
        }

    }

    public void loadSinhvien() {
        listSinhvien = SinhvienDAO.getAllSinhvien();
        tbl = (DefaultTableModel) this.view.getTblSinhvien().getModel();
        tbl.setRowCount(0);
        listSinhvien.forEach(p -> {

            tbl.addRow(new Object[]{
                p.getId(),
                p.getName(),
                p.getBirtday(),
                p.getGender(),
                p.getPhonenumber(),
                p.getEmail(),
                p.getAddress()
            });

        });
    }

    public static ArrayList<Sinhvien> getAllSinhvien() {
        ArrayList<Sinhvien> listSV = new ArrayList<>();
        Connection conn = JDBCConnection.getConnection();
        try {
            Statement stmt = conn.createStatement();
            //get data from table
            String sql = "select * from sinhvien";
            ResultSet rs = stmt.executeQuery(sql);
            //show data
            while (rs.next()) {
                Sinhvien sv = new Sinhvien(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)
                );
                listSV.add(sv);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSV;
    }

}
