/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.MySqlConnect;
import Model.Bill;
import Model.Product;
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
public class BillDao {

    Connection conn;
    ResultSet rs;

    public List<Bill> getBill() {
        conn = MySqlConnect.ConnectDb();
        List<Bill> listBill = new ArrayList<>();
        String sql = "SELECT * FROM hoadon";
        try {
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setMahd(rs.getInt(1));
                bill.setMaadmin(rs.getInt(2));
                bill.setNgaylap(rs.getDate(3));
                bill.setGhichu(rs.getString(4));
                bill.setTongtien(rs.getDouble(5));
                bill.setHoanthanh(rs.getString(6));
                bill.setCo(rs.getInt(7));
                bill.setTinhtrang(rs.getString(8));

                listBill.add(bill);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi ở getAdmin");
            e.printStackTrace();
        }
        return listBill;
    }
}
