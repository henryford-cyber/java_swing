/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlylaptop;

import View.LoginView;
import Connection.MySqlConnect;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Tai
 */
public class Thongke_chuan extends javax.swing.JFrame {

    /**
     * Creates new form thongke
     */
    public Thongke_chuan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        ToolBar_menu.setBorder(null);
        ToolBar_menu.setFloatable(false);
        ToolBar_menu.setRollover(true);
        ToolBar_menu.setMaximumSize(new java.awt.Dimension(2000, 59));
        ToolBar_menu.setMinimumSize(new java.awt.Dimension(2000, 59));
        ToolBar_menu.setPreferredSize(new java.awt.Dimension(2000, 25));

        sanpham.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/quan_ly_1.png"))); // NOI18N
        jButton12.setText("Admin");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar_menu.add(jButton12);

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/nho/iocn_thoat_1.png"))); // NOI18N
        jButton16.setText("Thoát");
        jButton16.setFocusable(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ToolBar_menu.add(jButton16);

        getContentPane().add(ToolBar_menu);
        ToolBar_menu.setBounds(0, 0, 2000, 60);

        jButton2.setBackground(new java.awt.Color(66, 139, 202));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thống kê theo mã sản phẩm và số lượng");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 170, 300, 30);

        jButton3.setBackground(new java.awt.Color(92, 184, 92));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Thống kê theo giá và mã sản phẩm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(350, 203, 300, 30);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setText("Thống kê loại sản phẩm và số lượng");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(350, 240, 300, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ho_tro/chuan88.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 60, 1000, 521);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu/anh_nen_admin.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -420, 1800, 1800);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 220, 41, 16);

        jMenu1.setText("Trang Chủ");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Sản Phẩm");
        jMenu2.setToolTipText("");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                jMenu2MenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });
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
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu7.setText("Thống Kê");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu7);

        jMenu5.setText("Admin");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Trợ Giúp");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        close();

        GiaoDienAdmin giaodien = new GiaoDienAdmin();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2MenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MenuCanceled

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        close();
        JFrame_sanpham giaodien;
        try {
            giaodien = new JFrame_sanpham();
             giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Thongke_chuan.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        close();
        Giaodienhoadon giaodien = new Giaodienhoadon();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        close();

        GiaodienquanlyAdmin giaodien = new GiaodienquanlyAdmin();
        giaodien.setSize(1024, 768);
        giaodien.setLocationRelativeTo(null);
        giaodien.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String query="SELECT `masp`, `soluong` FROM `chitiethoadon`";
            JDBCCategoryDataset dataset=new JDBCCategoryDataset(MySqlConnect.ConnectDb(), query);
            JFreeChart chart = ChartFactory.createBarChart("Thống kê chi tiết","Mã Sản Phẩm", "Số lượng", dataset, PlotOrientation.VERTICAL, true, true, true);
            BarRenderer renderer=null;
            CategoryPlot plot=null;
            renderer=new BarRenderer();
            
            ChartFrame frame=new ChartFrame("Bảng thống kê",chart);
            frame.setSize(600, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            String query="SELECT `masp`,`gia` FROM `chitiethoadon`";
            JDBCCategoryDataset dataset=new JDBCCategoryDataset(MySqlConnect.ConnectDb(), query);
            JFreeChart chart = ChartFactory.createBarChart("Thống kê chi tiết","Mã Sản Phẩm", "Giá bán", dataset, PlotOrientation.VERTICAL, true, true, true);
            BarRenderer renderer=null;
            CategoryPlot plot=null;
            renderer=new BarRenderer();
            
            ChartFrame frame=new ChartFrame("Bảng thống kê",chart);
            frame.setSize(600, 650);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:

try {
            String query="SELECT `tenlsp`,`soluong` FROM `sanpham` INNER JOIN loaisanpham ON sanpham.loaisp = loaisanpham.malsp";
            JDBCCategoryDataset dataset=new JDBCCategoryDataset(MySqlConnect.ConnectDb(), query);
            JFreeChart chart = ChartFactory.createBarChart("Thống kê chi tiết","Loại sản phẩm", "Số lượng", dataset, PlotOrientation.VERTICAL, true, true, true);
            BarRenderer renderer=null;
            CategoryPlot plot=null;
            renderer=new BarRenderer();
            
            ChartFrame frame=new ChartFrame("Bảng thống kê",chart);
            frame.setSize(700, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
        } catch (Exception e) {
        }




    }//GEN-LAST:event_jButton8ActionPerformed

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
        LoginView giaodien = new LoginView();
        giaodien.setSize(1024, 610);
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
            java.util.logging.Logger.getLogger(Thongke_chuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Thongke_chuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Thongke_chuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Thongke_chuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Thongke_chuan thok = new Thongke_chuan();
                thok.setSize(1009, 634);
                thok.setLocationRelativeTo(null);
                thok.setVisible(true);
//                new thongke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hoadon;
    private javax.swing.JToolBar ToolBar_menu;
    private javax.swing.JButton doi_matkhau;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JButton loaisanpham;
    private javax.swing.JButton sanpham;
    private javax.swing.JButton thongke;
    // End of variables declaration//GEN-END:variables
}