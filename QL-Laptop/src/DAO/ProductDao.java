/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.MySqlConnect;
import static Iteam.UpdateTable.con;
import Model.Account;
import Model.Product;
import View.LoginView;
import View.ProductView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class ProductDao {

    ProductView view;
    Connection conn;
    ResultSet rs;
    PreparedStatement pstmt;

    public List<Product> getProduct() {
        conn = MySqlConnect.ConnectDb();
        List<Product> listProduct = new ArrayList<>();
        String sql = "SELECT * FROM sanpham";
        try {

            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setMasp(rs.getInt(1));
                product.setLoaisp(rs.getString(2));
                product.setTensp(rs.getString(3));
                product.setGia(rs.getDouble(4));
                product.setTomtac(rs.getString(5));
                product.setLinhkien(rs.getString(6));
                product.setKhuyenmai(rs.getString(7));
                product.setThongso(rs.getString(8));
                product.setBaiviet(rs.getString(9));
                product.setBaohanh(rs.getInt(10));
                product.setSoluong(rs.getInt(11));
                product.setTinhtrang(rs.getString(12));

                listProduct.add(product);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi ở getAccount");
            e.printStackTrace();
        }
        return listProduct;
    }

    public void themSP(Product product) {
        String sql = "INSERT INTO `sanpham` (`masp`,`loaisp`, `tensp`, `gia`,`tomtat`, `linhkien`, `khuyenmai`, `thongso`, "
 + "`baiviet`, `baohanh`, `soluong`,`tinhtrang`) VALUES (?,?, ?, ?, ?, ?, ?,?,?,?,?,?)";

        try {
            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, product.getMasp());
            pstmt.setString(2, product.getLoaisp());
            pstmt.setString(3, product.getTensp());
            pstmt.setDouble(4, product.getGia());
            pstmt.setString(5, product.getTomtac());
            pstmt.setString(6, product.getLinhkien());
            pstmt.setString(7, product.getKhuyenmai());
            pstmt.setString(8, product.getThongso());
            pstmt.setString(9, product.getBaiviet());
            pstmt.setInt(10, product.getBaohanh());
            pstmt.setInt(11, product.getSoluong());
            pstmt.setString(12, product.getTinhtrang());

            int rs = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
