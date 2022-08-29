 
package Project.DAO;
 
 
import Project.Model.Taikhoan; 
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
    
    public void insert(Taikhoan taikhoan) throws Exception {
        String sql = "insert into taikhoan(tendangnhap, matkhau) values (?,?)";
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        conn = JDBCConnection.getConnection();
        pstmt = conn.prepareStatement(sql);        
        pstmt.setString(1, taikhoan.getTendangnhap());
        pstmt.setString(2, taikhoan.getMatkhau());        
        pstmt.execute();
    }
    
    public void update(Taikhoan taikhoan) throws Exception {
        String sql = "update taikhoan set tendangnhap=?, matkhau=? " + " where mataikhoan=" + taikhoan.getMataikhoan();
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        conn = JDBCConnection.getConnection();
        pstmt = conn.prepareStatement(sql);        
        pstmt.setString(1, taikhoan.getTendangnhap());
        pstmt.setString(2, taikhoan.getMatkhau());
        
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
        List<Taikhoan> listTK = new ArrayList<>();
        String sql = "SELECT * FROM taikhoan";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Taikhoan tk = new Taikhoan();
                tk.setMataikhoan(rs.getInt(1));
                tk.setTendangnhap(rs.getString(2));
                tk.setMatkhau(rs.getString(3));
                listTK.add(tk);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi ở getalltaikhoan");
        }
        return listTK;
    }

    
}
