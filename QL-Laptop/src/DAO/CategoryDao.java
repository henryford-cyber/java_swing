/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connection.MySqlConnect;
import Model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class CategoryDao {

    public static Connection conn = null;
    public static PreparedStatement pstmt = null;

    public static List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = MySqlConnect.ConnectDb();
            //query
            String sql = "select * from loaisanpham";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Category category = new Category(
                        resultSet.getInt("malsp"),
                        resultSet.getString("tenlsp"),
                        resultSet.getString("tinhtrang")
                );
                categories.add(category);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return categories;
    }

    public static void themLSP(String malsp, String tenlsp, String tinhtrang) {
        String sql = "INSERT INTO `loaisanpham` (`malsp`, `tenlsp`,`tinhtrang`) VALUES (?,?,?)";

        try {
            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, malsp);
            pstmt.setString(2, tenlsp);
            pstmt.setString(3, tinhtrang);

            pstmt.execute();
            JOptionPane.showMessageDialog(null, "???? th??m lo???i s???n ph???m" + tenlsp + " ", "Th??ng b??o", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "M?? lo???i s???n ph???m " + malsp + " ???? t???n t???i!! Kh??ng th??? th??m", "Th??ng b??o", 1);
        }

    }

    public static void suaLSP(String malsp, String tenlsp, String tinhtrang) {
        String sql = "UPDATE  loaisanpham SET malsp = '" + malsp + "', tenlsp = '" + tenlsp + "',tinhtrang = '" + tinhtrang + "' WHERE loaisanpham.malsp = '" + malsp + "'";
        try {
            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "???? s???a lo???i s???n ph???m " + malsp + " ", " Th??ng b??o", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " l???i ");
        }
    }

    public static void xoaLSP(String malsp) {
        String sql = "DELETE FROM `loaisanpham` WHERE `malsp` = '" + malsp + "'";
        try {
            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Lo???i s???n ph???m " + malsp + " ???? ???????c x??a ", "Th??ng b??o", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo???i s???n ph???m " + malsp + " c?? th??? ???????c s??? d???ng ??? th???c th??? kh??c!Kh??ng th??? x??a ", "Th??ng b??o", 1);
        }
    }
}
