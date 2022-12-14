/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlylaptop;

import Connection.MySqlConnect;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import static quanlylaptop.thongtin.Loaisanpham_.malsp;
//import static quanlylaptop.thongtin.Loaisanpham_.tenlsp;

//import static Iteam.QuanLyLoaiSanPham.con;
//import static Iteam.QuanLyLoaiSanPham.ps;
import Iteam.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tai
 */
public class QuanLyLoaiSanPham extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;
    private PreparedStatement ps;
    public static String sql = "SELECT * FROM `loaisanpham`";
    public static String malsp;

    /**
     * Creates new form QuanLyLoaiSanPham
     */
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public QuanLyLoaiSanPham() {
        initComponents();
        try {
           con=MySqlConnect.ConnectDb();
        } catch (Exception e) {
        }
        loaisanpham();
    }

   

    

    public void loaisanpham() {
        Vector cols = new Vector();
        cols.addElement("Mã loại sản phẩm");
        cols.addElement("Tên loại sản phẩm");

        Vector data = new Vector();

        String sql = "SELECT * FROM `loaisanpham`";
        try {
            ps = con.prepareStatement("SELECT `malsp`, `tenlsp` FROM `loaisanpham`");
            rs = ps.executeQuery();
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString("malsp"));
                user.addElement(rs.getString("tenlsp"));
                data.add(user);
            }
        } catch (Exception e) {
        }
        bang_dsloaisanpham.setModel(new DefaultTableModel(data, cols));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_themlsp = new javax.swing.JButton();
        btn_xoalsp = new javax.swing.JButton();
        btn_sualsp = new javax.swing.JButton();
        ToolBar_menu = new javax.swing.JToolBar();
        sanpham = new javax.swing.JButton();
        loaisanpham = new javax.swing.JButton();
        Hoadon = new javax.swing.JButton();
        thongke = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        doi_matkhau = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang_dsloaisanpham = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt1_malsp = new javax.swing.JTextField();
        txt1_tenlsp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_themlsp.setBackground(new java.awt.Color(62, 158, 148));
        btn_themlsp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_themlsp.setForeground(new java.awt.Color(255, 255, 255));
        btn_themlsp.setText("Thêm mới ");
        btn_themlsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themlspActionPerformed(evt);
            }
        });
        getContentPane().add(btn_themlsp);
        btn_themlsp.setBounds(210, 240, 130, 40);

        btn_xoalsp.setBackground(new java.awt.Color(33, 115, 70));
        btn_xoalsp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_xoalsp.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoalsp.setText("Xóa");
        btn_xoalsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoalspActionPerformed(evt);
            }
        });
        getContentPane().add(btn_xoalsp);
        btn_xoalsp.setBounds(510, 240, 130, 40);

        btn_sualsp.setBackground(new java.awt.Color(31, 131, 221));
        btn_sualsp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_sualsp.setForeground(new java.awt.Color(255, 255, 255));
        btn_sualsp.setText("Cập nhật");
        btn_sualsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sualspActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sualsp);
        btn_sualsp.setBounds(360, 240, 130, 40);

        ToolBar_menu.setBorder(null);
        ToolBar_menu.setFloatable(false);
        ToolBar_menu.setRollover(true);
        ToolBar_menu.setMaximumSize(new java.awt.Dimension(2000, 59));
        ToolBar_menu.setMinimumSize(new java.awt.Dimension(2000, 59));
        ToolBar_menu.setPreferredSize(new java.awt.Dimension(2000, 25));

        sanpham.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        sanpham.setForeground(new java.awt.Color(255, 255, 255));
        sanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/quanlysanpham-1.png"))); // NOI18N
        sanpham.setText("Sản Phẩm");
        sanpham.setFocusable(false);
        sanpham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sanpham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sanphamMouseClicked(evt);
            }
        });
        ToolBar_menu.add(sanpham);

        loaisanpham.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        loaisanpham.setForeground(new java.awt.Color(255, 255, 255));
        loaisanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/loai-san-pham_1.png"))); // NOI18N
        loaisanpham.setText("Loại Sản Phẩm");
        loaisanpham.setFocusable(false);
        loaisanpham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loaisanpham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        loaisanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loaisanphamMouseClicked(evt);
            }
        });
        ToolBar_menu.add(loaisanpham);

        Hoadon.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Hoadon.setForeground(new java.awt.Color(255, 255, 255));
        Hoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/Hoa_Don_1.png"))); // NOI18N
        Hoadon.setText("Hóa Đơn");
        Hoadon.setFocusable(false);
        Hoadon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hoadon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoadonActionPerformed(evt);
            }
        });
        ToolBar_menu.add(Hoadon);

        thongke.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        thongke.setForeground(new java.awt.Color(255, 255, 255));
        thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/thong_ke_1.png"))); // NOI18N
        thongke.setText("Thống Kê");
        thongke.setFocusable(false);
        thongke.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        thongke.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongkeActionPerformed(evt);
            }
        });
        ToolBar_menu.add(thongke);

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/quan_ly_1.png"))); // NOI18N
        jButton12.setText("Admin");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar_menu.add(jButton12);

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/tro_giup_1.png"))); // NOI18N
        jButton13.setText("Trợ Giúp");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        ToolBar_menu.add(jButton13);

        doi_matkhau.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        doi_matkhau.setForeground(new java.awt.Color(255, 255, 255));
        doi_matkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/icon_doi_mat_khau.png"))); // NOI18N
        doi_matkhau.setText("Đổi Mật Khẩu");
        doi_matkhau.setFocusable(false);
        doi_matkhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        doi_matkhau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        doi_matkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doi_matkhauActionPerformed(evt);
            }
        });
        ToolBar_menu.add(doi_matkhau);

        jButton15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/dangsuat.png"))); // NOI18N
        jButton15.setText("Đăng Xuất");
        jButton15.setFocusable(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        ToolBar_menu.add(jButton15);

        jButton16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/iocn_thoat_1.png"))); // NOI18N
        jButton16.setText("Thoát");
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar_menu.add(jButton16);

        getContentPane().add(ToolBar_menu);
        ToolBar_menu.setBounds(0, 0, 2000, 60);

        bang_dsloaisanpham.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bang_dsloaisanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã loại sản phẩm", "Tên loại sản phẩm", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        bang_dsloaisanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bang_dsloaisanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bang_dsloaisanpham);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 310, 800, 150);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ho_tro/aaaaaaaaaaaaaaaa.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 130, 790, 160);

        txt1_malsp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt1_malsp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_malsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1_malspActionPerformed(evt);
            }
        });
        getContentPane().add(txt1_malsp);
        txt1_malsp.setBounds(350, 140, 350, 50);

        txt1_tenlsp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt1_tenlsp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1_tenlsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1_tenlspActionPerformed(evt);
            }
        });
        getContentPane().add(txt1_tenlsp);
        txt1_tenlsp.setBounds(350, 190, 340, 40);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phong_chuan.gif"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 84, 807, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ho_tro/anhdep_hinhnen.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 80, 810, 410);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh Sách Các Loại Sản Phẩm");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 78, 390, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hinh-nen-admin-1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 2000, 1500);

        jMenu1.setText("Trang Chủ");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Sản Phẩm");
        jMenu2.setToolTipText("");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Loại Sản Phẩm");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Hóa Đơn");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu4);

        jMenu7.setText("Thống Kê");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu7);

        jMenu5.setText("Admin");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Trợ Giúp");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_themlspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themlspActionPerformed
        // TODO add your handling code here:
        if(this.txt1_malsp.getText().length()==0)
             JOptionPane.showMessageDialog(null, "Ma loai san pham khong duoc de trong", "Thong bao", 1);
         else if(this.txt1_malsp.getText().length()>6)
             JOptionPane.showMessageDialog(null, "Ma loai san pham vuot qua 6 ky ty","Thong bao",1);
         else if(this.txt1_tenlsp.getText().length()==0)
             JOptionPane.showMessageDialog(null, "Ten loai san pham khong duoc de trong","Thong bao",1);
         else if(this.txt1_tenlsp.getText().length()>700)
             JOptionPane.showMessageDialog(null, "Ten loai san pham vuot qua 70 ky tu","Thong bao",1);
         else {
     
            BtnLoaiSanPham.themLSP(this.txt1_malsp.getText().trim(), this.txt1_tenlsp.getText());
            loaisanpham();
            lamsach();
         }
        
    }//GEN-LAST:event_btn_themlspActionPerformed

    private void btn_sualspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sualspActionPerformed
        // TODO add your handling code here:
         if(this.txt1_malsp.getText().length()==0)
             JOptionPane.showMessageDialog(null, "Ma loai san pham khong duoc de trong", "Thong bao", 1);
         else if(this.txt1_malsp.getText().length()>6)
             JOptionPane.showMessageDialog(null, "Ma loai san pham vuot qua 6 ky ty","Thong bao",1);
         else if(this.txt1_tenlsp.getText().length()==0)
             JOptionPane.showMessageDialog(null, "Ten loai san pham khong duoc de trong","Thong bao",1);
         else if(this.txt1_tenlsp.getText().length()>700)
             JOptionPane.showMessageDialog(null, "Ten loai san pham vuot qua 70 ky tu","Thong bao",1);
         else {
             BtnLoaiSanPham.suaLSP(malsp, this.txt1_malsp.getText().trim() , this.txt1_tenlsp.getText());
             loaisanpham();
             lamsach();
         }
    }//GEN-LAST:event_btn_sualspActionPerformed

    private void btn_xoalspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoalspActionPerformed
        // TODO add your handling code here:
        if (this.txt1_tenlsp.getText().length() == 0) 
            JOptionPane.showMessageDialog(null, "Bạn cần chọn loại sản phẩm cần xóa", "Thông báo", 1);
        else if (JOptionPane.showConfirmDialog(null, "ban co chac muon xoa loai san pham nay","thong bao",2)==0) {
            BtnLoaiSanPham.xoaLSP(malsp);
            loaisanpham();
            lamsach();
        }
    }//GEN-LAST:event_btn_xoalspActionPerformed
    
    private void bang_dsloaisanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bang_dsloaisanphamMouseClicked
        
        try {
            int row = this.bang_dsloaisanpham.getSelectedRow();
            String idrow = this.bang_dsloaisanpham.getModel().getValueAt(row, 0).toString();
            String sql1 = "SELECT * FROM `loaisanpham` WHERE malsp='" + idrow + "'";
            ResultSet rs = UpdateTable.ShowTextField(sql1);
            if (rs.next()) {
                malsp = rs.getString("malsp");
                this.txt1_malsp.setText(rs.getString("malsp"));
                this.txt1_tenlsp.setText(rs.getString("tenlsp"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "THong bao loi", 1);
        }
//       
    }//GEN-LAST:event_bang_dsloaisanphamMouseClicked

    private void txt1_malspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1_malspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_malspActionPerformed

    private void txt1_tenlspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1_tenlspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1_tenlspActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        close();
        GiaoDienAdmin giaodien = new GiaoDienAdmin();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
         close();

                GiaodienquanlyAdmin giaodien = new GiaodienquanlyAdmin();
                giaodien.setSize(1123, 768);
                giaodien.setLocationRelativeTo(null);
                giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
       close();
        Thongke_chuan thok = new Thongke_chuan();
                thok.setSize(1009, 634);
                thok.setLocationRelativeTo(null);
                thok.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
         close();
        JFrame_sanpham giaodien;
        try {
            giaodien = new JFrame_sanpham();
            giaodien.setSize(1024, 768);
     giaodien.setLocationRelativeTo(null);
     giaodien.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanphamMouseClicked
        close();
        JFrame_sanpham giaodien;
        try {
            giaodien = new JFrame_sanpham();
            giaodien.setSize(1024, 768);
            giaodien.setLocationRelativeTo(null);
            giaodien.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_sanphamMouseClicked

    private void loaisanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loaisanphamMouseClicked
        close();
        QuanLyLoaiSanPham giaodien = new QuanLyLoaiSanPham();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_loaisanphamMouseClicked

    private void HoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoadonActionPerformed
        close();
        Giaodienhoadon giaodien = new Giaodienhoadon();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_HoadonActionPerformed

    private void thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongkeActionPerformed
        close();
        Thongke_chuan thok = new Thongke_chuan();
        thok.setSize(1009, 634);
        thok.setLocationRelativeTo(null);
        thok.setVisible(true);
    }//GEN-LAST:event_thongkeActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        ho_tro giaodien = new ho_tro();
        giaodien.setSize(845, 835);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jButton13MouseClicked

    private void doi_matkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doi_matkhauActionPerformed
        
    }//GEN-LAST:event_doi_matkhauActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        close();
        Tailogin giaodien = new Tailogin();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLyLoaiSanPham giaodien = new QuanLyLoaiSanPham();

                giaodien.setSize(1024, 768);
                giaodien.setLocationRelativeTo(null);
                giaodien.setVisible(true);
//                new QuanLyLoaiSanPham().setVisible(true);
            }
        });
    }

    public void lamsach() {
        txt1_malsp.setText(null);
        txt1_tenlsp.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hoadon;
    private javax.swing.JToolBar ToolBar_menu;
    private javax.swing.JTable bang_dsloaisanpham;
    private javax.swing.JButton btn_sualsp;
    private javax.swing.JButton btn_themlsp;
    private javax.swing.JButton btn_xoalsp;
    private javax.swing.JButton doi_matkhau;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loaisanpham;
    private javax.swing.JButton sanpham;
    private javax.swing.JButton thongke;
    private javax.swing.JTextField txt1_malsp;
    private javax.swing.JTextField txt1_tenlsp;
    // End of variables declaration//GEN-END:variables
}
