package edu.namphan.Project.View;

import edu.namphan.Project.Model.DanhMuc;
import edu.namphan.Project.Controller.CTL_Chuyenmanhinh;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class Main1JFrame extends javax.swing.JFrame {

    /**
     * Creates new form Main1JFrame
     */
    public Main1JFrame() {
        initComponents();
        setTitle("QUẢN LÝ SINH VIÊN");
        List<DanhMuc> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMuc("Trangchu", jpnTrangchu, jlbTrangchu));
        listDanhMuc.add(new DanhMuc("Sinhvien", jpnSinhvien, jlbSinhvien));
        //listDanhMuc.add(new DanhMuc("Diem", jpnDiem, jlbDiem));
        listDanhMuc.add(new DanhMuc("Taikhoan", jpnTaikhoan, jlbTaikhoan));
        //CTL_Chuyenmanhinh controller = new CTL_Chuyenmanhinh(panelRender);
//        controller.setDashboard(jpnTrangchu, jlbTrangchu);
//        controller.setView(jpnTrangchu, jlbTrangchu);
//        controller.setEvent(listDanhMuc);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jpnTrangchu = new javax.swing.JPanel();
        jlbTrangchu = new javax.swing.JLabel();
        jpnSinhvien = new javax.swing.JPanel();
        jlbSinhvien = new javax.swing.JLabel();
        jpnTaikhoan = new javax.swing.JPanel();
        jlbTaikhoan = new javax.swing.JLabel();
        btnDangxuat = new javax.swing.JButton();
        panelRender = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setPreferredSize(new java.awt.Dimension(1366, 760));

        jpnMenu.setBackground(new java.awt.Color(102, 102, 102));
        jpnMenu.setForeground(new java.awt.Color(102, 51, 255));

        jPanel26.setBackground(new java.awt.Color(0, 0, 255));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\JavaLibrary1\\src\\Images\\logo_ungdung.png")); // NOI18N
        jLabel17.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnTrangchu.setBackground(new java.awt.Color(255, 255, 255));

        jlbTrangchu.setBackground(new java.awt.Color(0, 0, 0));
        jlbTrangchu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbTrangchu.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\kiemtra1tiet3\\src\\main\\java\\edu\\namphan\\Project\\Images\\home (1) 52px.png")); // NOI18N
        jlbTrangchu.setText("   Màn Hình Chính");

        javax.swing.GroupLayout jpnTrangchuLayout = new javax.swing.GroupLayout(jpnTrangchu);
        jpnTrangchu.setLayout(jpnTrangchuLayout);
        jpnTrangchuLayout.setHorizontalGroup(
            jpnTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangchuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbTrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTrangchuLayout.setVerticalGroup(
            jpnTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnSinhvien.setBackground(new java.awt.Color(255, 255, 255));

        jlbSinhvien.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbSinhvien.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\kiemtra1tiet3\\src\\main\\java\\edu\\namphan\\Project\\Images\\student 52px.png")); // NOI18N
        jlbSinhvien.setText("Quản Lý Sinh Viên");

        javax.swing.GroupLayout jpnSinhvienLayout = new javax.swing.GroupLayout(jpnSinhvien);
        jpnSinhvien.setLayout(jpnSinhvienLayout);
        jpnSinhvienLayout.setHorizontalGroup(
            jpnSinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSinhvienLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbSinhvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnSinhvienLayout.setVerticalGroup(
            jpnSinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSinhvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbSinhvien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnTaikhoan.setBackground(new java.awt.Color(255, 255, 255));

        jlbTaikhoan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbTaikhoan.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\kiemtra1tiet3\\src\\main\\java\\edu\\namphan\\Project\\Images\\budget 52px.png")); // NOI18N
        jlbTaikhoan.setText("Quản Lý Tài Khoản");

        javax.swing.GroupLayout jpnTaikhoanLayout = new javax.swing.GroupLayout(jpnTaikhoan);
        jpnTaikhoan.setLayout(jpnTaikhoanLayout);
        jpnTaikhoanLayout.setHorizontalGroup(
            jpnTaikhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaikhoanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTaikhoanLayout.setVerticalGroup(
            jpnTaikhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTaikhoanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTaikhoan)
                .addContainerGap())
        );

        btnDangxuat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDangxuat.setIcon(new javax.swing.ImageIcon("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\kiemtra1tiet3\\src\\main\\java\\edu\\namphan\\Project\\Images\\log-out (1) 50px.png")); // NOI18N
        btnDangxuat.setText("Đăng Xuất");
        btnDangxuat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnTaikhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnSinhvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTrangchu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jpnTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jpnSinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jpnTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(btnDangxuat)
                .addContainerGap())
        );

        panelRender.setBackground(new java.awt.Color(255, 255, 255));
        panelRender.setForeground(new java.awt.Color(255, 255, 255));
        panelRender.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRender, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 1541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có chắc là muốn Đăng xuất !") == JOptionPane.YES_OPTION) {
            this.dispose();
            LoginView dangnhap = new LoginView();
            dangnhap.setTitle("Đăng nhập hệ thông!");
            dangnhap.setLocationRelativeTo(null);
            dangnhap.setVisible(true);
        } else {
            return;
        }
    }//GEN-LAST:event_btnDangxuatActionPerformed

    public JLabel getJlbSinhvien() {
        return jlbSinhvien;
    }

    public JLabel getJlbTaikhoan() {
        return jlbTaikhoan;
    }

    public JButton getBtnDangxuat() {
        return btnDangxuat;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public JPanel getjPanel26() {
        return jPanel26;
    }

    public JLabel getJlbTrangchu() {
        return jlbTrangchu;
    }

    public JPanel getJpnMenu() {
        return jpnMenu;
    }

    public JPanel getJpnRoot() {
        return jpnRoot;
    }

    public JPanel getJpnSinhvien() {
        return jpnSinhvien;
    }

    public JPanel getJpnTaikhoan() {
        return jpnTaikhoan;
    }

    public JPanel getJpnTrangchu() {
        return jpnTrangchu;
    }

    public JPanel getPanelRender() {
        return panelRender;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JLabel jlbSinhvien;
    private javax.swing.JLabel jlbTaikhoan;
    private javax.swing.JLabel jlbTrangchu;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnSinhvien;
    private javax.swing.JPanel jpnTaikhoan;
    private javax.swing.JPanel jpnTrangchu;
    private javax.swing.JPanel panelRender;
    // End of variables declaration//GEN-END:variables
}
