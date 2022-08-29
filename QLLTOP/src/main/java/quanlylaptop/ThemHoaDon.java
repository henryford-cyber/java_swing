/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlylaptop;

import Connection.MySqlConnect;
import Iteam.itemChiTietHoaDon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HoangManh
 */
public class ThemHoaDon extends javax.swing.JFrame implements ChonSanPham.ChonSP {

    private Connection conn;
    private ResultSet rs;
    private ResultSet rs1;
    private PreparedStatement stmt;
    private PreparedStatement stmt1;
    private Object UbUtil;
    private Object DbUtils;
    private Object UbUtils;
    DefaultTableModel mod;
    private String mahd, tensp, loaisp, masp, maadmin, ghichu;
    private int soluong, hoanthanh;
    double gia;
    ArrayList<Iteam.itemChiTietHoaDon> listCTHD = new ArrayList<>();

    private Connection con1;

    /**
     * Creates new form ThemHoaDon
     */
    public ThemHoaDon() {

        initComponents();
        try {
            conn = MySqlConnect.ConnectDb();
        } catch (Exception e) {

        }
        try {
            loadCombBox();
            loadThemHoaDon();
            fromWindowOpened(null);
        } catch (SQLException ex) {
            Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getInfor() {

        masp = "";

        maadmin = jComboBoxNL.getSelectedItem().toString();
        ghichu = txtghichu.getText();
        mahd = jMahoaDonCount.getText();
        soluong = 0;
        gia = 0;
        Date ngaylap = jDateNL.getDate();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String ngaylap1 = format.format(ngaylap.getTime());

        if (jRadioButton1.isSelected()) {
            hoanthanh = 1;
        } else if (jRadioButton2.isSelected()) {
            hoanthanh = 0;
        } else {
            JOptionPane.showMessageDialog(this, "Mời chọn trạng thái hóa đơn");
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            stmt = conn.prepareStatement("INSERT INTO `hoadon`(`mahd`, `maadmin`, `ngaylap`, `ghichu`, `hoanthanh`) values(?,?,?,?,?)");
            stmt.setString(1, mahd);
            stmt.setString(2, maadmin);
            stmt.setString(3, ngaylap1);
            stmt.setString(4, ghichu);
            stmt.setInt(5, hoanthanh);

            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            stmt1 = con1.prepareStatement("INSERT INTO `chitiethoadon`(`mahd`, `masp`, `soluong`, `gia`) values(?,?,?,?)");
            stmt1.setString(1, mahd);
            stmt1.setString(2, masp);
            stmt1.setInt(3, soluong);
            stmt1.setInt(4, 200);
            int i = stmt.executeUpdate();
            int j = stmt1.executeUpdate();
            if (i > 0 && j > 0) {
                JOptionPane.showMessageDialog(null, "Đăng Ký Thành Công");

                Giaodienhoadon giaodien = new Giaodienhoadon();
                giaodien.setSize(1024, 768);
                giaodien.setLocationRelativeTo(null);
                giaodien.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Đăng Ký Thất Bại");
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void loadCombBox() throws SQLException {
        jComboBoxNL.removeAllItems();
        String sql = "SELECT `maadmin` FROM `admin`";
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();
        while (rs.next()) {
            this.jComboBoxNL.addItem(rs.getString("maadmin"));

        }

    }

    private void loadThemHoaDon() {
        int mahdnew = ThemHoaDon.countHoaDon() + 1;
        jMahoaDonCount.setText("" + mahdnew);
    }

    public static int countHoaDon() {
        int countHD = 0;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        try {
            con = MySqlConnect.ConnectDb();
            String sql = "SELECT COUNT(*) FROM hoadon";

            pstm = con.prepareStatement(sql);
            pstm.executeQuery();

            rs = pstm.getResultSet();

            if (rs.next()) {
                countHD = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        return countHD;
    }

    public void getInfor1() {

        maadmin = jComboBoxNL.getSelectedItem().toString();
        ghichu = txtghichu.getText();
        mahd = jMahoaDonCount.getText();

        Date ngaylap = jDateNL.getDate();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String ngaylap1 = format.format(ngaylap.getTime());

//               ngaylap=jDateNL.getDate().toString();
        if (jRadioButton1.isSelected()) {
            hoanthanh = 1;
        } else if (jRadioButton2.isSelected()) {
            hoanthanh = 0;
        } else {
            JOptionPane.showMessageDialog(this, "Mời chọn trạng thái hóa đơn");
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            stmt = conn.prepareStatement("INSERT INTO `hoadon`(`mahd`, `maadmin`, `ngaylap`, `ghichu`, `hoanthanh`) values(?,?,?,?,?)");
            stmt.setString(1, mahd);
            stmt.setString(2, maadmin);
            stmt.setString(3, ngaylap1);
            stmt.setString(4, ghichu);
            stmt.setInt(5, hoanthanh);

            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
            stmt1 = con1.prepareStatement("INSERT INTO `chitiethoadon`(`mahd`, `masp`, `soluong`, `gia`) values(?,?,?,?)");
            for (itemChiTietHoaDon nhanvien : listCTHD) {
                stmt1.setString(1, nhanvien.getMahd1());

                stmt1.setString(2, nhanvien.getMasp1());
                stmt1.setInt(3, nhanvien.getSoluong1());
                stmt1.setDouble(4, nhanvien.getGia1());
                stmt1.addBatch();

            }

            int[] k = stmt1.executeBatch();
            int i = stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm Thành Công");
            Giaodienhoadon giaodien = new Giaodienhoadon();
            giaodien.setSize(1024, 768);
            giaodien.setLocationRelativeTo(null);
            giaodien.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (stmt1 != null) {
                    stmt1.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Thêm  Thất Bại");
                e.printStackTrace();
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablethemchitiet = new javax.swing.JTable();
        jComboBoxNL = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateNL = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtTenADMIN = new javax.swing.JTextField();
        jTextLSP1 = new javax.swing.JTextField();
        jTextFieldTenSP = new javax.swing.JTextField();
        Giá = new javax.swing.JTextField();
        jTextFieldSoLuong = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtghichu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jMahoaDonCount = new javax.swing.JTextField();
        jTextFieldmasap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        JHuy = new javax.swing.JButton();
        jLUU = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM HÓA ĐƠN.");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("THÊM HÓA ĐƠN"))));

        jTablethemchitiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablethemchitiet);

        jComboBoxNL.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBoxNL.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxNLPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mã ADMIN :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Ngày lập :  ");

        jDateNL.setDateFormatString("dd/MM/yyyy");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Tên ADMIN :");

        txtTenADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenADMINActionPerformed(evt);
            }
        });

        jTextLSP1.setEditable(false);
        jTextLSP1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextLSP1.setToolTipText("Loại sản phẩm");
        jTextLSP1.setMargin(new java.awt.Insets(2, 0, 2, 0));

        jTextFieldTenSP.setEditable(false);
        jTextFieldTenSP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldTenSP.setToolTipText("Tên sản phẩm");
        jTextFieldTenSP.setMargin(new java.awt.Insets(2, 0, 2, 0));

        Giá.setEditable(false);
        Giá.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Giá.setToolTipText("Giá");

        jTextFieldSoLuong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSoLuong.setToolTipText("Số Lượng");

        jButton5.setText("Thêm chi tiết");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Chọn sản phẩm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ghi chú :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Mã hóa đơn: ");

        jMahoaDonCount.setEditable(false);

        jTextFieldmasap.setEditable(false);
        jTextFieldmasap.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldmasap.setToolTipText("Tên sản phẩm");
        jTextFieldmasap.setMargin(new java.awt.Insets(2, 0, 2, 0));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Hoàn Thành:");

        jRadioButton1.setText("Yes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("No");

        JHuy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/iocn_thoat_1.png"))); // NOI18N
        JHuy.setText("Thoát");
        JHuy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JHuy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JHuyActionPerformed(evt);
            }
        });

        jLUU.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLUU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ho_tro/icon_them_hd.png"))); // NOI18N
        jLUU.setText("Thêm mới");
        jLUU.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLUU.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLUU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLUUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jMahoaDonCount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxNL, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)
                                .addGap(26, 26, 26)
                                .addComponent(jRadioButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLUU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2)
                                .addComponent(jTextLSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldmasap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Giá, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(jTextFieldSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMahoaDonCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextLSP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Giá, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldmasap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7)
                        .addComponent(jTextFieldSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLUU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLUUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLUUActionPerformed
        getInfor1();

    }//GEN-LAST:event_jLUUActionPerformed

    private void JHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_JHuyActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ChonSanPham chonsanpham = new ChonSanPham(this, this, this, this);
        chonsanpham.setVisible(true);
        chonsanpham.setSize(1024, 768);
        chonsanpham.setLocationRelativeTo(null);
        jTextLSP1.setText(chonsanpham.loaisanpham);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String soluongtrunggian = "";
        double giatrungian = 0;
        double thanhtientrunggian = 0;
        int soluongnew = 0;
        String bit = "";
        String mahd = jMahoaDonCount.getText().trim();

        String loaisp = jTextLSP1.getText().trim();
        String tensp = jTextFieldTenSP.getText().trim();
        String gia = Giá.getText().trim();
        String soluong = jTextFieldSoLuong.getText().trim();
        String sql = "SELECT `gia` FROM sanpham  WHERE `tensp`='" + tensp + "'";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                soluongnew = Integer.parseInt(soluong);

                giatrungian = rs.getDouble("gia");
                thanhtientrunggian = giatrungian * soluongnew;

                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                String thanhtien = fm.format(thanhtientrunggian);
                mahd = jMahoaDonCount.getText();
                String masp = jTextFieldmasap.getText();
                String st[] = {mahd, loaisp, masp, tensp, gia, soluong, thanhtien};
                mod.addRow(st);

            }
            String mahd1 = jMahoaDonCount.getText();
            String masp1 = jTextFieldmasap.getText();
            int soluong1 = soluongnew;
            double gia1 = thanhtientrunggian;
            Iteam.itemChiTietHoaDon ct = new itemChiTietHoaDon();
            ct.setMahd1(mahd1);
            ct.setMasp1(masp1);
            ct.setSoluong1(soluong1);
            ct.setGia1(gia1);
            listCTHD.add(ct);
           


        } catch (Exception e) {
            Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, e);

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtTenADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenADMINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenADMINActionPerformed

    private void jComboBoxNLPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxNLPopupMenuWillBecomeInvisible

        String sql = "SELECT `tenadmin` FROM `admin` WHERE `maadmin`= ?";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, this.jComboBoxNL.getSelectedItem().toString());

            rs = stmt.executeQuery();

            while (rs.next()) {
                this.txtTenADMIN.setText(rs.getString("tenadmin"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ThemHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxNLPopupMenuWillBecomeInvisible
    private void fromWindowOpened(java.awt.event.WindowEvent event) {
        mod = new DefaultTableModel();
        jTablethemchitiet.setModel(mod);
        mod.addColumn("Mã Hóa Đơn");
        mod.addColumn("Tên Loại Sản Phẩm");
        mod.addColumn("Mã Sản Phẩm");
        mod.addColumn("Tên Sản Phẩm");
        mod.addColumn("Giá");
        mod.addColumn("Số Lương");
        mod.addColumn("Thành Tiền");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemHoaDon().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Giá;
    private javax.swing.JButton JHuy;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBoxNL;
    private com.toedter.calendar.JDateChooser jDateNL;
    private javax.swing.JButton jLUU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jMahoaDonCount;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablethemchitiet;
    private javax.swing.JTextField jTextFieldSoLuong;
    private javax.swing.JTextField jTextFieldTenSP;
    private javax.swing.JTextField jTextFieldmasap;
    public javax.swing.JTextField jTextLSP1;
    private javax.swing.JTextField txtTenADMIN;
    private javax.swing.JTextField txtghichu;
    // End of variables declaration//GEN-END:variables

//    @Override
//    public void chonSanPham(String loaisanpham, String tensanpham, String giamoi) {
//        jTextLSP1.setText(loaisanpham);
//        jTextFieldTenSP.setText(tensanpham);
//        Giá.setText(giamoi);
//    }
    @Override
    public void chonSanPham(String loaisanpham, String tensanpham, String giamoi, String masanphamnew) {
        jTextLSP1.setText(loaisanpham);
        jTextFieldmasap.setText(masanphamnew);
        jTextFieldTenSP.setText(tensanpham);
        Giá.setText(giamoi);
    }

}
