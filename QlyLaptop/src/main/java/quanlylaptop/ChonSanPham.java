/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlylaptop;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HoangManh
 */
public class ChonSanPham extends javax.swing.JFrame {
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement stmt;
    private Object UbUtil;
    private Object DbUtils;
    private Object UbUtils;
    String loaisanpham,tensanpham,gia,masanphamnew;

    /**
     * Creates new form ChonSanPham
     */
//    public ChonSanPham(ChonSP chsp,ChonSP tensp,ChonSP gianew) {
//        this.chsp = chsp;
//        this.tensp= tensp;
//        this.gianew=gianew;
//        initComponents();
//        try {
//            conn = MySqlConnect.ConnectDb();
//        } catch (Exception e) {
//
//        }
//        updateSP();
//    }

    ChonSanPham(ThemHoaDon aThis,ChonSP chsp,ChonSP tensp,ChonSP gianew) {
        this.chsp = chsp;
        this.tensp= tensp;
        this.gianew=gianew;
        initComponents();
        try {
            conn = MySqlConnect.ConnectDb();
        } catch (Exception e) {

        }
        updateSP();
        
    }

    


   
    
      public void updateSP() {
        Vector cols = new Vector();
        cols.addElement("Mã Sản Phẩm");
        cols.addElement("Tên Loại Sản Phẩm");
        cols.addElement("Tên Sản Phẩm");
        cols.addElement("Giá");
        

//        
        Vector data = new Vector();

        String sql = "SELECT a.masp,a.tensp,a.gia,b.tenlsp FROM sanpham a , loaisanpham b WHERE a.loaisp=b.malsp";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
;
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString("masp"));
                user.addElement(rs.getString("tenlsp"));
                user.addElement(rs.getString("tensp"));
                NumberFormat fm = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                user.addElement(fm.format(rs.getDouble("gia")));
                data.add(user);

                
            }
        } catch (Exception e) {
//           JOptionPane.showMessageDialog(null, cols);
        }
        jTableChonSanPham.setModel(new DefaultTableModel(data, cols));

    }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableChonSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CHỌN SẢN PHẨM");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DANH SÁCH HÓA ĐƠN"));

        jButton1.setText("ADDNEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableChonSanPham.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableChonSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableChonSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableChonSanPham);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableChonSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableChonSanPhamMouseClicked
//       int index= jTableChonSanPham.getSelectedRow();
////        String mahd=lsHD.get(index).getMahd();
//        int row = jTableChonSanPham.getSelectedRow();
//        if (row != -1) {
//
//            loaisanpham =jTableChonSanPham.getValueAt(row, 1).toString();
//            tensanpham =jTableChonSanPham.getValueAt(row, 2).toString();
//            gia =jTableChonSanPham.getValueAt(row, 3).toString();
//        }
    }//GEN-LAST:event_jTableChonSanPhamMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//       int index= jTableChonSanPham.getSelectedRow();
//        String mahd=lsHD.get(index).getMahd();
        int row = jTableChonSanPham.getSelectedRow();
        if (row != -1) {
            masanphamnew = jTableChonSanPham.getValueAt(row, 0).toString();
            loaisanpham =jTableChonSanPham.getValueAt(row, 1).toString();
            tensanpham =jTableChonSanPham.getValueAt(row, 2).toString();
            
            gia =jTableChonSanPham.getValueAt(row, 3).toString();
            
            

        }
           chsp.chonSanPham(loaisanpham,tensanpham,gia,masanphamnew);

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ChonSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChonSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChonSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChonSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ChonSanPham chonsp = new ChonSanPham(null, chsp, tensp, gianew);
//                chonsp.setSize(1024, 768);
//                chonsp.setLocationRelativeTo(null);
//                chonsp.setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ChonSanPham chonsp = new ChonSanPham(null, chsp, tensp, gianew);
//                chonsp.setSize(1024, 768);
//                chonsp.setLocationRelativeTo(null);
//                chonsp.setVisible(true);
//            }
//        });
    }
    public interface ChonSP {
        
 

        public void chonSanPham(String loaisanpham, String tensanpham, String giamoi, String masanphamnew);
    }
    ChonSP chsp,tensp,gianew,maspnew;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableChonSanPham;
    // End of variables declaration//GEN-END:variables
}
