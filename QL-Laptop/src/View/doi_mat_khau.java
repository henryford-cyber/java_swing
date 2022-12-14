/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import quanlylaptop.*;
import Connection.MySqlConnect;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tai
 */
public class doi_mat_khau extends javax.swing.JFrame {

    private Connection con;
    private ResultSet rs;
    private PreparedStatement stmt;
 
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public doi_mat_khau() {
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

        jLabel2 = new javax.swing.JLabel();
        matkhau_hientai = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        matkhau_moi = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        matkhau_moi_xac_nhan = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Mật khẩu hiện tại:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 110, 120, 20);

        matkhau_hientai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matkhau_hientai.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(matkhau_hientai);
        matkhau_hientai.setBounds(290, 150, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Mật khẩu mới:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 160, 100, 20);

        matkhau_moi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matkhau_moi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        matkhau_moi.setToolTipText("Mật khẩu từ 6 -> 12 ký tự");
        getContentPane().add(matkhau_moi);
        matkhau_moi.setBounds(290, 100, 160, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Xác nhận mật khẩu:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 220, 120, 20);

        matkhau_moi_xac_nhan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        matkhau_moi_xac_nhan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(matkhau_moi_xac_nhan);
        matkhau_moi_xac_nhan.setBounds(290, 210, 160, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Cập nhật");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 280, 100, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Bỏ qua");
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 280, 80, 30);

        jLabel6.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel6.setText("ĐỔI MẬT KHẨU");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 30, 310, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            con = MySqlConnect.ConnectDb();
            stmt = con.prepareStatement("UPDATE `taikhoan` SET `matkhau`=? WHERE `matkhau`=?");
            stmt.setString(1,  matkhau_hientai.getText());
            stmt.setString(2, matkhau_moi.getText());

            int i = stmt.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Bạn Đã Đổi Mật Khẩu Thành Công");
                close();

            } else {
                JOptionPane.showMessageDialog(null, "Thông tin chưa chính xác");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(doi_mat_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doi_mat_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doi_mat_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doi_mat_khau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                doi_mat_khau giaodien = new doi_mat_khau();
                giaodien.setSize(480, 300);
                giaodien.setLocationRelativeTo(null);
                giaodien.setVisible(true);
//                new doi_mat_khau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField matkhau_hientai;
    private javax.swing.JPasswordField matkhau_moi;
    private javax.swing.JPasswordField matkhau_moi_xac_nhan;
    // End of variables declaration//GEN-END:variables
}
