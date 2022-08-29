/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.DAO;
import Project.Connection.DatabaseConnection;
import Project.Model.Taikhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class TaikhoanDAOImpl implements TaikhoanDAO {

    @Override
    public Taikhoan login(String tendangnhap, String matkhau) {
        String sql = "SELECT * FROM taikhoan WHERE tendangnhap LIKE ?  AND matkhau LIKE ?";
        Connection conn = null;
        PreparedStatement pstmt = null; 
        
        Taikhoan taikhoan = null;
        try {
         conn = DatabaseConnection.getConnection();
         pstmt = conn.prepareStatement(sql);
            
           pstmt.setString(1, tendangnhap);
           pstmt.setString(2, matkhau);
            ResultSet rs =pstmt.executeQuery();
            if (rs.next()) {
                taikhoan = new Taikhoan();
                taikhoan.setMataikhoan(rs.getInt("mataikhoan"));
                taikhoan.setTendangnhap(rs.getString("tendangnhap"));
                taikhoan.setMatkhau(rs.getString("matkhau"));
                
            }
            pstmt.close();
            conn.close();
            return taikhoan;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
 
 
 
