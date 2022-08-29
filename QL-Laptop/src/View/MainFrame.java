/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.k33ptoo.components.KButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    public JPanel getJpnHomepage() {
        return jpnHomepage;
    }

    public JLabel getJlbHomepage() {
        return jlbHomepage;
    }

    public JPanel getPanelRender() {
        return panelRender;
    }

    public KButton getBtnLogout() {
        return btnLogout;
    }

    public JLabel getJlbProduct() {
        return jlbProduct;
    }

    public JPanel getJpnProduct() {
        return jpnProduct;
    }

    public JLabel getJlbCategory() {
        return jlbCategory;
    }

    public JPanel getJpnCategory() {
        return jpnCategory;
    }

    public JLabel getJlbBill() {
        return jlbBill;
    }

    public JPanel getJpnBill() {
        return jpnBill;
    }

    public JLabel getJlbAccount() {
        return jlbAccount;
    }

    public JPanel getJpnAccount() {
        return jpnAccount;
    }


private ProductView productjpanel = new ProductView();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        panelRender = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jpnHomepage = new javax.swing.JPanel();
        jlbHomepage = new javax.swing.JLabel();
        jpnProduct = new javax.swing.JPanel();
        jlbProduct = new javax.swing.JLabel();
        jpnCategory = new javax.swing.JPanel();
        jlbCategory = new javax.swing.JLabel();
        btnLogout = new com.k33ptoo.components.KButton();
        jpnAccount = new javax.swing.JPanel();
        jlbAccount = new javax.swing.JLabel();
        jpnBill = new javax.swing.JPanel();
        jlbBill = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setPreferredSize(new java.awt.Dimension(1366, 760));

        jpnMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpnMenu.setForeground(new java.awt.Color(102, 51, 255));

        panelRender.setBackground(new java.awt.Color(255, 255, 255));
        panelRender.setForeground(new java.awt.Color(255, 255, 255));
        panelRender.setLayout(new java.awt.BorderLayout());

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkBorderRadius(50);
        kGradientPanel1.setkEndColor(new java.awt.Color(244, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        jpnHomepage.setBackground(new java.awt.Color(255, 255, 255));

        jlbHomepage.setBackground(new java.awt.Color(0, 0, 0));
        jlbHomepage.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbHomepage.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\windows8_52px.png")); // NOI18N

        javax.swing.GroupLayout jpnHomepageLayout = new javax.swing.GroupLayout(jpnHomepage);
        jpnHomepage.setLayout(jpnHomepageLayout);
        jpnHomepageLayout.setHorizontalGroup(
            jpnHomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHomepageLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jlbHomepage, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnHomepageLayout.setVerticalGroup(
            jpnHomepageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomepageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHomepage, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnProduct.setBackground(new java.awt.Color(255, 255, 255));

        jlbProduct.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbProduct.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\product_48px.png")); // NOI18N

        javax.swing.GroupLayout jpnProductLayout = new javax.swing.GroupLayout(jpnProduct);
        jpnProduct.setLayout(jpnProductLayout);
        jpnProductLayout.setHorizontalGroup(
            jpnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbProduct)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpnProductLayout.setVerticalGroup(
            jpnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbProduct)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnCategory.setBackground(new java.awt.Color(255, 255, 255));

        jlbCategory.setBackground(new java.awt.Color(102, 102, 102));
        jlbCategory.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbCategory.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\diversity_48px.png")); // NOI18N

        javax.swing.GroupLayout jpnCategoryLayout = new javax.swing.GroupLayout(jpnCategory);
        jpnCategory.setLayout(jpnCategoryLayout);
        jpnCategoryLayout.setHorizontalGroup(
            jpnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCategory)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpnCategoryLayout.setVerticalGroup(
            jpnCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCategory)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setBorder(null);
        btnLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\logout_rounded_left_52px.png")); // NOI18N
        btnLogout.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        btnLogout.setkEndColor(new java.awt.Color(255, 255, 255));
        btnLogout.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnLogout.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnLogout.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnLogout.setkPressedColor(new java.awt.Color(255, 255, 255));
        btnLogout.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnLogout.setkStartColor(new java.awt.Color(255, 255, 255));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jpnAccount.setBackground(new java.awt.Color(255, 255, 255));

        jlbAccount.setBackground(new java.awt.Color(102, 102, 102));
        jlbAccount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbAccount.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\edit_user_48px.png")); // NOI18N

        javax.swing.GroupLayout jpnAccountLayout = new javax.swing.GroupLayout(jpnAccount);
        jpnAccount.setLayout(jpnAccountLayout);
        jpnAccountLayout.setHorizontalGroup(
            jpnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpnAccountLayout.setVerticalGroup(
            jpnAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbAccount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnBill.setBackground(new java.awt.Color(255, 255, 255));

        jlbBill.setBackground(new java.awt.Color(102, 102, 102));
        jlbBill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbBill.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\paid_bill_48px.png")); // NOI18N

        javax.swing.GroupLayout jpnBillLayout = new javax.swing.GroupLayout(jpnBill);
        jpnBill.setLayout(jpnBillLayout);
        jpnBillLayout.setHorizontalGroup(
            jpnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBill, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpnBillLayout.setVerticalGroup(
            jpnBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBillLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jlbBill)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        kGradientPanel2.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkBorderRadius(150);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(204, 255, 255));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\QL-Laptop\\src\\icon\\laptop_90px.png")); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpnHomepage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jpnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jpnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jpnBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnHomepage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jpnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRender, javax.swing.GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 1388, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
//        if (JOptionPane.showConfirmDialog(this, "Bạn có chắc là muốn Đăng xuất !") == JOptionPane.YES_OPTION) {
//            this.dispose();
//            LoginView dangnhap = new LoginView();
//            dangnhap.setTitle("Đăng nhập hệ thông!");
//            dangnhap.setLocationRelativeTo(null);
//            dangnhap.setVisible(true);
//        } else {
//            return;
//        }
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnLogout;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jlbAccount;
    private javax.swing.JLabel jlbBill;
    private javax.swing.JLabel jlbCategory;
    private javax.swing.JLabel jlbHomepage;
    private javax.swing.JLabel jlbProduct;
    private javax.swing.JPanel jpnAccount;
    private javax.swing.JPanel jpnBill;
    private javax.swing.JPanel jpnCategory;
    private javax.swing.JPanel jpnHomepage;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnProduct;
    private javax.swing.JPanel jpnRoot;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel panelRender;
    // End of variables declaration//GEN-END:variables
}