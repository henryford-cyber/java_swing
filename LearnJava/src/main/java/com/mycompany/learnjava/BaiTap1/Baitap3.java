/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.learnjava;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Baitap3 extends javax.swing.JFrame {

    /**
     * Creates new form Baitap3
     */
    public Baitap3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdau = new javax.swing.JTextField();
        txtcuoi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtketqua = new javax.swing.JTextField();
        btncong = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        btnnhan = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        btnchia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phan Phước Phương Nam");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("CACULATOR");

        jLabel2.setText("SỐ  THỨ NHẤT :");

        jLabel3.setText("SỐ THỨ HAI : ");

        txtdau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdauFocusLost(evt);
            }
        });
        txtdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdauActionPerformed(evt);
            }
        });

        txtcuoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcuoiFocusLost(evt);
            }
        });
        txtcuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuoiActionPerformed(evt);
            }
        });

        jLabel4.setText("KẾT QUẢ");

        btncong.setText("+");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });

        btntru.setText("-");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });

        btnnhan.setText("*");
        btnnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanActionPerformed(evt);
            }
        });

        btnthoat.setText("Xóa");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        btnchia.setText("/");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(btncong)
                                .addGap(18, 18, 18)
                                .addComponent(btntru, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdau, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txtcuoi)
                                    .addComponent(txtketqua)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnnhan)
                                .addGap(18, 18, 18)
                                .addComponent(btnchia)
                                .addGap(18, 18, 18)
                                .addComponent(btnthoat)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtketqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncong)
                    .addComponent(btntru)
                    .addComponent(btnnhan)
                    .addComponent(btnthoat)
                    .addComponent(btnchia))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdauActionPerformed

    private void txtcuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcuoiActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        txtdau.setText("");
        txtcuoi.setText("");
        txtketqua.setText("");
    }//GEN-LAST:event_btnthoatActionPerformed

    private void btnnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanActionPerformed
        // TODO add your handling code here:
        Double a =Double.parseDouble(txtdau.getText());
        Double b =Double.parseDouble(txtcuoi.getText());
        txtketqua.setText(Double .toString(a*b));
    }//GEN-LAST:event_btnnhanActionPerformed

    private void txtdauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdauFocusLost
        // TODO add your handling code here:
        String num1 = txtdau.getText();
        Component rootPane = null;
        if(num1.length()>0){
            
        }else 
            JOptionPane.showMessageDialog(rootPane,"Chưa nhập dữ liệu");
    }//GEN-LAST:event_txtdauFocusLost

    private void txtcuoiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcuoiFocusLost
        // TODO add your handling code here:
        String num1 = txtcuoi.getText();
        Component rootPane = null;
        if(num1.length()>0){
            
        }else 
            JOptionPane.showMessageDialog(rootPane,"Chưa nhập dữ liệu");
    }//GEN-LAST:event_txtcuoiFocusLost

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
        // TODO add your handling code here:
        Double a =Double.parseDouble(txtdau.getText());
        Double b =Double.parseDouble(txtcuoi.getText());
        txtketqua.setText(Double .toString(a+b));
    }//GEN-LAST:event_btncongActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        // TODO add your handling code here:
        Double a =Double.parseDouble(txtdau.getText());
        Double b =Double.parseDouble(txtcuoi.getText());
        txtketqua.setText(Double .toString(a-b));
    }//GEN-LAST:event_btntruActionPerformed

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
        // TODO add your handling code here:
        Double a =Double.parseDouble(txtdau.getText());
        Double b =Double.parseDouble(txtcuoi.getText());
        txtketqua.setText(Double .toString(a/b));
    }//GEN-LAST:event_btnchiaActionPerformed

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
            java.util.logging.Logger.getLogger(Baitap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baitap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baitap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baitap3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baitap3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btncong;
    private javax.swing.JButton btnnhan;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btntru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtcuoi;
    private javax.swing.JTextField txtdau;
    private javax.swing.JTextField txtketqua;
    // End of variables declaration//GEN-END:variables
}
