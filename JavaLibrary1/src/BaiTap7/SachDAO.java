package BaiTap7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SachDAO {
          public static  String userName = "root";
          public static String password = "";
          public static String dbURL = "jdbc:mysql://localhost:3306/ql_sinhvien";
    public static ArrayList<Sach> getListSach() throws Exception {
        ArrayList<Sach> list = new ArrayList<>();
        Connection conn = KetnoiSach.getConnection(userName,password,dbURL);
        try {
            Statement stmt = conn.createStatement();
            //get data from table
            String sql = "select * from tbl_Sach";
            ResultSet rs = stmt.executeQuery(sql);
            //show data
            while (rs.next()) {
                Sach bk = new Sach(rs.getInt(1),
                        rs.getString(2),
                        rs.getFloat(3)
                );
                list.add(bk);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
        }
        return list;
    }

    public boolean insert(Sach bk) throws Exception {
        String sql = "insert into Sach(MASACH,TENSACH,GIASACH) values(?,?,?)";
        Connection conn = KetnoiSach.getConnection(userName,password,dbURL);
        PreparedStatement prst = conn.prepareStatement(sql);
        {
            prst.setInt(1, bk.getMaSach());
            prst.setString(2, bk.getTenSach());
            prst.setFloat(3, bk.getGiaSach());
            return prst.executeUpdate() > 0;
        
        }
    }

    public Sach findTenSach(String tenSach) throws Exception {
        String sql = "select from tbl_Sach where TENSACH=?";
        Connection conn = KetnoiSach.getConnection(userName,password,dbURL);
        PreparedStatement prst = conn.prepareStatement(sql);
        prst.setString(1, tenSach);
        ResultSet rs = prst.executeQuery();
        if (rs.next()) {
            Sach bk = new Sach();
            bk.setMaSach(rs.getInt("ok"));
            bk.setTenSach(rs.getString("ok"));
            bk.setGiaSach(rs.getFloat("ok"));
            return bk;

        }
        return null;

    }

    public boolean update(Sach bk) throws Exception {
        String SQL = "update tbl_Sach set GIASACH=? where TENSACH=?";
        Connection conn = KetnoiSach.getConnection(userName,password,dbURL);
        PreparedStatement prst = conn.prepareStatement(SQL);
        {
            prst.setString(2, bk.getTenSach());
            prst.setFloat(1, bk.getGiaSach());

        }
        return prst.executeUpdate() > 0;

    }

//    public void Delete(int maSach) throws Exception {
//
//        Connection conn = KetnoiSach.getConnection();
//        String sql = "delete from tbl_Sach where MASACH = ?";   
//        PreparedStatement prst = conn.prepareStatement(sql);
//        prst.setString(1, tenSach);
//        ResultSet rs = prst.executeQuery();
//        try {
//                PreparedStatement prst = conn.preparedStatement(sql);
//                preparedStatement.setInt(1, maSach);
//                int rs = preparedStatement.executeUpdate();
//                System.out.println(rs);
//        } catch (SQLException e) {
//        }
//    }
}
