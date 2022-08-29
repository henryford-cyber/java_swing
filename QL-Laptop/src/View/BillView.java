/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Connection.MySqlConnect;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
    


/**
 *
 * @author ADMIN
 */
public class BillView extends javax.swing.JPanel {
 int click = 0;
    String mhdht, maadminhoanthanh, ngaylaphoanhthanh, ghichuhoanthanh, tongtienhoanthanh;
    DefaultTableModel dfModel;
    PreparedStatement pstmt = null;
        ResultSet rs;
        Connection conn = null;

    /**
     * Creates new form BillView
     */
    public BillView() {
        initComponents();
        loadBill();
        loadproductList();
    }

    private void loadBill() {

        tblDanhsachhoadon.getTableHeader().setFont(new Font("RussellSquare", Font.BOLD, 16));
        tblDanhsachhoadon.getTableHeader().setOpaque(false);
        tblDanhsachhoadon.getTableHeader().setBackground(new Color(0, 153, 102));
        tblDanhsachhoadon.getTableHeader().setForeground(new Color(255, 255, 255));
        tblDanhsachhoadon.setRowHeight(23);
        dfModel = (DefaultTableModel) tblDanhsachhoadon.getModel();
        dfModel.setColumnIdentifiers(new Object[]{
            "Mã hóa đơn", "Ma Tài khoản", "ngày lập", "Hoàn thành"});
        try {
            String sql = "select * from hoadon";
            Connection conn = null;
            PreparedStatement pstmt = null;

            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            dfModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(6)

                };
                dfModel.addRow(row);
            }
            dfModel.fireTableDataChanged();
            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }

    private void loadproductList() {

        tblDanhsachsanphamm.getTableHeader().setFont(new Font("RussellSquare", Font.BOLD, 16));
        tblDanhsachsanphamm.getTableHeader().setOpaque(false);
        tblDanhsachsanphamm.getTableHeader().setBackground(new Color(0, 153, 102));
        tblDanhsachsanphamm.getTableHeader().setForeground(new Color(255, 255, 255));
        tblDanhsachsanphamm.setRowHeight(22);
        dfModel = (DefaultTableModel) tblDanhsachsanphamm.getModel();
        dfModel.setColumnIdentifiers(new Object[]{
            "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá "});
        try {
            String sql = "select * from sanpham";
            Connection conn = null;
            PreparedStatement pstmt = null;

            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            dfModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString(1),
                    rs.getString(3),
                    rs.getString(4)
                };
                dfModel.addRow(row);
            }
            dfModel.fireTableDataChanged();
            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }

    private void loadHoadonchuasuly() {

        tblDanhsachhoadon.getTableHeader().setFont(new Font("RussellSquare", Font.BOLD, 16));
        tblDanhsachhoadon.getTableHeader().setOpaque(false);
        tblDanhsachhoadon.getTableHeader().setBackground(new Color(0, 153, 102));
        tblDanhsachhoadon.getTableHeader().setForeground(new Color(255, 255, 255));
        tblDanhsachhoadon.setRowHeight(22);
        dfModel = (DefaultTableModel) tblDanhsachhoadon.getModel();
        dfModel.setColumnIdentifiers(new Object[]{
            "Mã Hóa đơn", "Mã tài khoản", "Ngày lập", "Hoàn thành"});
        try {
            String sql = "SELECT * FROM `hoadon` WHERE `hoanthanh`=0";
            Connection conn = null;
            PreparedStatement pstmt = null;

            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            dfModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(6)
                };
                dfModel.addRow(row);
            }
            dfModel.fireTableDataChanged();
            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }

    private void loadHoadondasuly() {

        tblDanhsachhoadon.getTableHeader().setFont(new Font("RussellSquare", Font.BOLD, 16));
        tblDanhsachhoadon.getTableHeader().setOpaque(false);
        tblDanhsachhoadon.getTableHeader().setBackground(new Color(0, 153, 102));
        tblDanhsachhoadon.getTableHeader().setForeground(new Color(255, 255, 255));
        tblDanhsachhoadon.setRowHeight(22);
        dfModel = (DefaultTableModel) tblDanhsachhoadon.getModel();
        dfModel.setColumnIdentifiers(new Object[]{
            "Mã Hóa đơn", "Mã tài khoản", "Ngày lập", "Hoàn thành"});
        try {
            String sql = "SELECT * FROM `hoadon` WHERE `hoanthanh`=1";
            Connection conn = null;
            PreparedStatement pstmt = null;

            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            dfModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(6)
                };
                dfModel.addRow(row);
            }
            dfModel.fireTableDataChanged();
            rs.close();
            pstmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inhoadon = new javax.swing.JDialog();
        lb_maHD = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bang_inhoadon = new javax.swing.JTable();
        J_tongtien = new javax.swing.JLabel();
        jlbadmin = new javax.swing.JLabel();
        jlbdienthoai = new javax.swing.JLabel();
        jlbdiachi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhsachhoadon = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChitiethoadon = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDanhsachsanphamm = new javax.swing.JTable();
        jSoLuong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jThanhtienqlhd = new javax.swing.JTextField();
        txtMahoadon = new javax.swing.JTextField();
        jMaSanPham = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        txtGiaQLHD = new javax.swing.JTextField();
        hoa_don_chua_su_ly = new javax.swing.JButton();
        hoa_don_da_su_ly = new javax.swing.JButton();
        them_hoa_don = new javax.swing.JButton();
        xoa_hoa_don = new javax.swing.JButton();
        txtTongtien = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMahoadontongtien = new javax.swing.JTextField();
        in_hoa_don = new javax.swing.JButton();
        btnTongtien = new javax.swing.JButton();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        OKOK = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        inhoadon.getContentPane().setLayout(null);

        lb_maHD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lb_maHD.setForeground(new java.awt.Color(255, 0, 51));
        lb_maHD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        inhoadon.getContentPane().add(lb_maHD);
        lb_maHD.setBounds(460, 108, 40, 30);

        bang_inhoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        bang_inhoadon.setColumnSelectionAllowed(true);
        bang_inhoadon.setRowHeight(26);
        bang_inhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bang_inhoadonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(bang_inhoadon);

        inhoadon.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(80, 240, 680, 390);

        J_tongtien.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        J_tongtien.setForeground(new java.awt.Color(255, 0, 51));
        J_tongtien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inhoadon.getContentPane().add(J_tongtien);
        J_tongtien.setBounds(580, 630, 180, 60);

        jlbadmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inhoadon.getContentPane().add(jlbadmin);
        jlbadmin.setBounds(160, 140, 90, 20);

        jlbdienthoai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inhoadon.getContentPane().add(jlbdienthoai);
        jlbdienthoai.setBounds(160, 206, 80, 20);

        jlbdiachi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inhoadon.getContentPane().add(jlbdiachi);
        jlbdiachi.setBounds(160, 170, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\chuan99.png")); // NOI18N
        inhoadon.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -12, 800, 790);

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Các Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        tblDanhsachhoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDanhsachhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachhoadonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblDanhsachhoadonMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhsachhoadon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi Tiết Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        tblChitiethoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblChitiethoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChitiethoadonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChitiethoadon);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("RussellSquare", 1, 17)); // NOI18N
        jLabel7.setText("Mã Sản Phẩm");

        jLabel8.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel8.setText("Số lượng");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        tblDanhsachsanphamm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDanhsachsanphamm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachsanphammMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDanhsachsanphamm);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSoLuong.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel9.setText("Mã Hóa Đơn");

        jLabel10.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel10.setText("Thành Tiền");

        jThanhtienqlhd.setEditable(false);
        jThanhtienqlhd.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N

        txtMahoadon.setEditable(false);
        txtMahoadon.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N

        jMaSanPham.setEditable(false);
        jMaSanPham.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N

        label1.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        label1.setText("Giá sản phẩm");

        txtGiaQLHD.setEditable(false);
        txtGiaQLHD.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        txtGiaQLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaQLHDActionPerformed(evt);
            }
        });

        hoa_don_chua_su_ly.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        hoa_don_chua_su_ly.setText("Hóa Đơn Chưa Sử Lý");
        hoa_don_chua_su_ly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoa_don_chua_su_lyActionPerformed(evt);
            }
        });

        hoa_don_da_su_ly.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        hoa_don_da_su_ly.setText("Hóa Đơn Đã Sử Lý");
        hoa_don_da_su_ly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoa_don_da_su_lyActionPerformed(evt);
            }
        });

        them_hoa_don.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        them_hoa_don.setText("Thêm Hóa Đơn");
        them_hoa_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them_hoa_donActionPerformed(evt);
            }
        });

        xoa_hoa_don.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        xoa_hoa_don.setText("Xóa Hóa Đơn");
        xoa_hoa_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoa_hoa_donActionPerformed(evt);
            }
        });

        txtTongtien.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel12.setText("Mã Hóa Đơn");

        txtMahoadontongtien.setEditable(false);
        txtMahoadontongtien.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N

        in_hoa_don.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        in_hoa_don.setText("In  Hóa Đơn");
        in_hoa_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_hoa_donActionPerformed(evt);
            }
        });

        btnTongtien.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        btnTongtien.setText("TỔNG HÓA ĐƠN");
        btnTongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongtienActionPerformed(evt);
            }
        });

        kButton1.setText("Xóa chi tiết");
        kButton1.setFont(new java.awt.Font("RussellSquare", 1, 14)); // NOI18N
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 204, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Thêm chi tiết");
        kButton2.setFont(new java.awt.Font("RussellSquare", 1, 14)); // NOI18N
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 204, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        kButton3.setText("Cập nhập");
        kButton3.setFont(new java.awt.Font("RussellSquare", 1, 14)); // NOI18N
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkHoverStartColor(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(them_hoa_don, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(in_hoa_don, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xoa_hoa_don, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hoa_don_chua_su_ly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hoa_don_da_su_ly)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtMahoadontongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMaSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGiaQLHD, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jThanhtienqlhd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMahoadontongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(btnTongtien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGiaQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtMahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jThanhtienqlhd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(kButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(xoa_hoa_don, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(in_hoa_don, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoa_don_da_su_ly, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(them_hoa_don, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hoa_don_chua_su_ly, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OKOK.setFont(new java.awt.Font("SerpentineSans", 0, 30)); // NOI18N
        OKOK.setForeground(new java.awt.Color(0, 153, 102));
        OKOK.setText("TRANG QUẢN LÝ HÓA ĐƠN");

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel1.setText("Chi tiết Thông tin hóa đơn");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(522, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OKOK, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OKOK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    private void tblDanhsachhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachhoadonMouseClicked
        int row = tblDanhsachhoadon.getSelectedRow();
        String mahd = tblDanhsachhoadon.getValueAt(row, 0).toString();
        if (row >= 0) {
            txtMahoadon.setText(mahd);
            txtMahoadontongtien.setText(mahd);
 
           tblChitiethoadon.getTableHeader().setFont(new Font("RussellSquare", Font.BOLD, 16));
            tblChitiethoadon.getTableHeader().setOpaque(false);
            tblChitiethoadon.getTableHeader().setBackground(new Color(0, 153, 102));
            tblChitiethoadon.getTableHeader().setForeground(new Color(255, 255, 255));
            tblChitiethoadon.setRowHeight(22);
            dfModel = (DefaultTableModel) tblChitiethoadon.getModel();
            dfModel.setColumnIdentifiers(new Object[]{
                "Mã Hóa đơn", "Mã sản phẩm", "Số lượng ", "Giá"});

            try {
                String sql = "SELECT * FROM `chitiethoadon` WHERE `mahd`=" + mahd + "";
                Connection conn = null;
                PreparedStatement pstmt = null;

                conn = MySqlConnect.ConnectDb();
                pstmt = conn.prepareStatement(sql);

                ResultSet rs = pstmt.executeQuery();
                dfModel.setRowCount(0);
                while (rs.next()) {
                    String[] row2 = new String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                    };
                    dfModel.addRow(row2);
                }
                dfModel.fireTableDataChanged();
                rs.close();
                pstmt.close();
                conn.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());

            }

        }

// int click =0;
//int index = tblDanhsachhoadon.getSelectedRow();
//        click++;
//        int row = tblDanhsachhoadon.getSelectedRow();
//        if (row != -1) {
//            String mahd = tblDanhsachhoadon.getValueAt(row, 0).toString();
//            maadminhoanthanh = tblDanhsachhoadon.getValueAt(row, 1).toString();
//            ngaylaphoanhthanh = tblDanhsachhoadon.getValueAt(row, 2).toString();
////            System.out.println(ngaylaphoanhthanh);
////            ngaylaphoanhthanh.setDate((java.util.Date) (jTableDSHD.getValueAt(row, 2)));
////           
//
//            jMaHoaDonTongTien.setText(mahd);
//            jMaHoaDon.setText(mahd);
//
//            
//
//            String sql = "SELECT * FROM `chitiethoadon` WHERE `mahd`=" + mahd + "";
//            
//
//            
//        }
    }//GEN-LAST:event_tblDanhsachhoadonMouseClicked

    private void tblDanhsachhoadonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachhoadonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDanhsachhoadonMouseEntered

    private void tblChitiethoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChitiethoadonMouseClicked

        int row = tblChitiethoadon.getSelectedRow();
        if (row != -1) {
            txtMahoadon.setText(tblChitiethoadon.getValueAt(row, 0).toString());
            jMaSanPham.setText(tblChitiethoadon.getValueAt(row, 1).toString());
            jSoLuong.setText(tblChitiethoadon.getValueAt(row, 2).toString());

        }

    }//GEN-LAST:event_tblChitiethoadonMouseClicked

    private void tblDanhsachsanphammMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachsanphammMouseClicked

        int row = tblDanhsachsanphamm.getSelectedRow();

        if (row != -1) {

            jMaSanPham.setText(tblDanhsachsanphamm.getValueAt(row, 0).toString());
            txtGiaQLHD.setText(tblDanhsachsanphamm.getValueAt(row, 2).toString());

        }

    }//GEN-LAST:event_tblDanhsachsanphammMouseClicked

    private void hoa_don_chua_su_lyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoa_don_chua_su_lyActionPerformed
        loadHoadonchuasuly();
    }//GEN-LAST:event_hoa_don_chua_su_lyActionPerformed

    private void hoa_don_da_su_lyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoa_don_da_su_lyActionPerformed
        loadHoadondasuly();
    }//GEN-LAST:event_hoa_don_da_su_lyActionPerformed

    private void them_hoa_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_them_hoa_donActionPerformed
        ThemHoaDon thd = new ThemHoaDon();
        thd.setVisible(true);
        thd.setSize(1024, 768);
        thd.setLocationRelativeTo(null);
    }//GEN-LAST:event_them_hoa_donActionPerformed

    private void xoa_hoa_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoa_hoa_donActionPerformed

    }//GEN-LAST:event_xoa_hoa_donActionPerformed
//public void  inhoadon(){
// ResultSet rs;
// Connection conn = null;
//                PreparedStatement pstmt = null;
// lb_maHD.setText(txtMahoadontongtien.getText());
//        String ma = txtMahoadontongtien.getText();
//        Vector cols = new Vector();
////        cols.addElement("Mã Hóa Đơn");
//        cols.addElement("Tên sản Phẩm");
//        cols.addElement("Mã Sản Phẩm");
//        cols.addElement("Giá Sản Phẩm");
//        cols.addElement("Số Lượng");
////        cols.addElement("Bảo Hành");
//        cols.addElement("Thành Tiền");
//        
////        
//        Vector data = new Vector();
//
//        try {
//            String sql1 = "SELECT a.masp,a.tensp,a.gia,b.soluong,b.gia FROM sanpham a , chitiethoadon b WHERE a.masp=b.masp AND b.mahd="+ma+"";
//            
//            String sql = "SELECT *\n"
//                    + "FROM\n"
//                    + "    sanpham\n"
//                    + "    INNER JOIN loaisanpham ON sanpham.loaisp = loaisanpham.malsp\n"
//                    + "    INNER JOIN chitiethoadon ON sanpham.masp = chitiethoadon.masp\n"
//                    + "WHERE chitiethoadon.mahd =" + ma + "";
//
////        String sql = "SELECT * FROM `chitiethoadon` WHERE `mahd`="+ma+" ";
//            pstmt = conn.prepareStatement(sql1);
//            rs = pstmt.executeQuery();
//
//            while (rs.next()) {
//                Vector user = new Vector();
////                user.addElement(rs.getString("mahd"));
//                user.addElement(rs.getString("tensp"));
//                user.addElement(rs.getString("masp"));
//                NumberFormat fm1 = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
//                user.addElement(fm1.format(rs.getDouble("a.gia")));
//                user.addElement(rs.getString("b.soluong"));
//                
////                user.setElementAt(rs.getInt("baohanh"));
////                Integer new =Integer.getInteger("baohanh");
//                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
//                user.addElement(fm.format(rs.getDouble("b.gia")));
//                
////                lb_maHD.setText(rs.getString("mahd"));
//                data.add(user);
//            }
//        } catch (Exception e) {
//           // JOptionPane.showMessageDialog(null, cols);
//        }
//         String sql2 = "SELECT a.hoten,a.diachi,a.dienthoai FROM taikhoan a , hoadon b WHERE a.mataikhoan=b.mataikhoan AND b.mahd="+ma+"";
//         
//         try {
//            pstmt=conn.prepareStatement(sql2);
//            rs=pstmt.executeQuery();
//            while(rs.next()){
//                jlbadmin.setText(rs.getString("a.hoten"));
//                jlbdiachi.setText(rs.getString("a.diachi"));
//                jlbdienthoai.setText(rs.getString("a.dienthoai"));
//                
//            
//            }
//        } catch (Exception e) {
//        }
//        bang_inhoadon.setModel(new DefaultTableModel(data, cols));
//
//        // goi tong tien
//        String mahd = txtMahoadontongtien.getText().toString();
//        try {
//            String sql = "SELECT SUM( `gia`) FROM `chitiethoadon` WHERE `mahd`=" + mahd + "";
//            pstmt = conn.prepareStatement(sql);
//            rs = pstmt.executeQuery();
//            while (rs.next()) {
//                double giatongtamthoi = rs.getDouble("SUM( `gia`)");
//                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
//                String trunggian = fm.format(giatongtamthoi);
//                J_tongtien.setText(trunggian);
//            }   
//
//        } catch (SQLException ex) {
//            
//        }
//
//}
    private void in_hoa_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_hoa_donActionPerformed
         // inhoadon();
        inhoadon.setSize(800, 800);
        
        inhoadon.setLocationRelativeTo(null);
        inhoadon.setVisible(true);
    }//GEN-LAST:event_in_hoa_donActionPerformed

    private void btnTongtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongtienActionPerformed
        PreparedStatement pstmt = null;
        ResultSet rs;
        Connection conn = null;
        String mahd = txtMahoadontongtien.getText().toString();

        try {
            String sql = "SELECT SUM(`gia`) FROM `chitiethoadon` WHERE `mahd`= '" + mahd + "'";

            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                double giatongtamthoi = rs.getDouble("SUM( `gia`)");
                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                String trunggian = fm.format(giatongtamthoi);
                // txtTongtien.setText(trunggian);
                JOptionPane.showMessageDialog(this, trunggian);
            }

        } catch (SQLException ex) {
        }
// String mahd = jMaHoaDonTongTien.getText().toString();
//
//        String sql = "SELECT SUM( `gia`) FROM `chitiethoadon` WHERE `mahd`=" + mahd + "";
//        try {
//            stmt = conn.prepareStatement(sql);
//            rs = stmt.executeQuery();
//            while (rs.next()) {
//                double giatongtamthoi = rs.getDouble("SUM( `gia`)");
//
//                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
//                String trunggian = fm.format(giatongtamthoi);
//                jTongTien.setText(trunggian);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Giaodienhoadon.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_btnTongtienActionPerformed

    private void txtGiaQLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaQLHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaQLHDActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void bang_inhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bang_inhoadonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bang_inhoadonMouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
       
        if (click != 0) {

            int hdhoanthanh = 0;
            String mhd = txtMahoadon.getText().trim();

            String sql1 = "SELECT `hoanthanh` FROM `hoadon` WHERE `mahd`='" + mhd + "'";
            try {
                pstmt = conn.prepareStatement(sql1);
                rs = pstmt.executeQuery();
                while (rs.next()) {
                    hdhoanthanh = rs.getInt("hoanthanh");

                }

            } catch (SQLException ex) {
                Logger.getLogger(BillView.class.getName()).log(Level.SEVERE, null, ex);

            }
            if (hdhoanthanh == 0) {
                String dlt1 = txtMahoadon.getText();
                String dlt2 = jMaSanPham.getText();
                String sql = "DELETE FROM `chitiethoadon` WHERE `masp`= " + dlt2 + " ";
                try {
                    pstmt = conn.prepareStatement(sql);
                    pstmt.execute();
                    JOptionPane.showMessageDialog(null, "XÓa chi tiết hóa đơn thành công");  
                } catch (SQLException ex) {
                    Logger.getLogger(BillView.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (hdhoanthanh == 1) {
                JOptionPane.showMessageDialog(null, "Hóa đơn đã giải quyết không đươc xóa.");
            }

        } else if (click == 0) {
            JOptionPane.showMessageDialog(null, "Hãy click chọn chi tiết hóa đơn cần xóa !!!");

        }
    }//GEN-LAST:event_kButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel J_tongtien;
    private javax.swing.JLabel OKOK;
    private javax.swing.JTable bang_inhoadon;
    private javax.swing.JButton btnTongtien;
    private javax.swing.JButton hoa_don_chua_su_ly;
    private javax.swing.JButton hoa_don_da_su_ly;
    private javax.swing.JButton in_hoa_don;
    private javax.swing.JDialog inhoadon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMaSanPham;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jSoLuong;
    private javax.swing.JTextField jThanhtienqlhd;
    private javax.swing.JLabel jlbadmin;
    private javax.swing.JLabel jlbdiachi;
    private javax.swing.JLabel jlbdienthoai;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private java.awt.Label label1;
    private javax.swing.JLabel lb_maHD;
    private javax.swing.JTable tblChitiethoadon;
    private javax.swing.JTable tblDanhsachhoadon;
    private javax.swing.JTable tblDanhsachsanphamm;
    private javax.swing.JButton them_hoa_don;
    private javax.swing.JTextField txtGiaQLHD;
    private javax.swing.JTextField txtMahoadon;
    private javax.swing.JTextField txtMahoadontongtien;
    private javax.swing.JTextField txtTongtien;
    private javax.swing.JButton xoa_hoa_don;
    // End of variables declaration//GEN-END:variables
}
