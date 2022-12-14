/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Connection.MySqlConnect;
import DAO.CategoryDao;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class CategoryView extends javax.swing.JPanel {

    DefaultTableModel dfModel;
    public static String malsp;
    private CategoryDao categorydao = new CategoryDao();

    public CategoryView() {
        initComponents();
        loadCategory();
    }

    private void loadCategory() {
        tblDanhsachLoaisp.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblDanhsachLoaisp.getTableHeader().setOpaque(false);
        tblDanhsachLoaisp.getTableHeader().setBackground(new Color(0, 153, 102));
        tblDanhsachLoaisp.getTableHeader().setForeground(new Color(255, 255, 255));
        tblDanhsachLoaisp.setRowHeight(25);
        dfModel = (DefaultTableModel) tblDanhsachLoaisp.getModel();
        dfModel.setColumnIdentifiers(new Object[]{"Mã Loại Sản Phẩm ", "Tên Loại Sản Phẩm ", "Tình trạng"});
        try {
            String sql = "select * from loaisanpham";
            Connection conn = null;
            PreparedStatement pstmt = null;

            conn = MySqlConnect.ConnectDb();
            pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            dfModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]{rs.getString(1), rs.getString(2), rs.getString(3)};
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

        qllsp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnThemmoi = new com.k33ptoo.components.KButton();
        btnCapnhap = new com.k33ptoo.components.KButton();
        btnXoa = new com.k33ptoo.components.KButton();
        txtMalsp = new javax.swing.JTextField();
        txtTenloaisp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbTinhtrang = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhsachLoaisp = new javax.swing.JTable();

        qllsp.setFont(new java.awt.Font("SerpentineSans", 0, 30)); // NOI18N
        qllsp.setForeground(new java.awt.Color(0, 153, 102));
        qllsp.setText("TRANG QUẢN LÝ LOẠI SẢN PHẨM");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel1.setText("Chi tiết Thông tin loại sản phẩm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Mã loại sản phẩm :");

        jLabel3.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Tên loại sản phẩm: ");

        btnThemmoi.setText("Thêm mới");
        btnThemmoi.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnThemmoi.setkHoverStartColor(new java.awt.Color(0, 153, 51));
        btnThemmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemmoiActionPerformed(evt);
            }
        });

        btnCapnhap.setText("Cập nhập");
        btnCapnhap.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnCapnhap.setkHoverStartColor(new java.awt.Color(0, 153, 51));
        btnCapnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhapActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnXoa.setkHoverStartColor(new java.awt.Color(0, 153, 51));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 153, 102));
        jLabel4.setFont(new java.awt.Font("RussellSquare", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("Tình trạng loại sản phẩm :");

        cbbTinhtrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "an", "hien", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThemmoi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnCapnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbTinhtrang, 0, 257, Short.MAX_VALUE)
                                    .addComponent(txtMalsp, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(txtTenloaisp))
                                .addGap(25, 25, 25)))))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMalsp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbTinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemmoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tblDanhsachLoaisp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Loại Sản Phẩm", "Tên Loại Sản Phẩm ", "Tình Trạng"
            }
        ));
        tblDanhsachLoaisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachLoaispMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhsachLoaisp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qllsp)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qllsp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhsachLoaispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachLoaispMouseClicked
        int row = tblDanhsachLoaisp.getSelectedRow();

        if (row >= 0) {
            txtMalsp.setText(tblDanhsachLoaisp.getValueAt(row, 0).toString());
            txtTenloaisp.setText(tblDanhsachLoaisp.getValueAt(row, 1).toString());
            cbbTinhtrang.setSelectedItem(tblDanhsachLoaisp.getValueAt(row, 2).toString());

        }
    }//GEN-LAST:event_tblDanhsachLoaispMouseClicked

    private void btnThemmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemmoiActionPerformed

        if (this.txtMalsp.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Ma loai san pham khong duoc de trong", "Thong bao", 1);
        else if (this.txtMalsp.getText().length() > 6)
            JOptionPane.showMessageDialog(null, "Ma loai san pham vuot qua 6 ky ty", "Thong bao", 1);
        else if (this.txtTenloaisp.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Ten loai san pham khong duoc de trong", "Thong bao", 1);
        else if (this.txtTenloaisp.getText().length() > 700)
            JOptionPane.showMessageDialog(null, "Ten loai san pham vuot qua 70 ky tu", "Thong bao", 1);
        else {

            CategoryDao.themLSP(this.txtMalsp.getText().trim(), this.txtTenloaisp.getText(), this.cbbTinhtrang.getSelectedItem().toString());
            loadCategory();
        }
    }//GEN-LAST:event_btnThemmoiActionPerformed

    private void btnCapnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhapActionPerformed
        if (this.txtMalsp.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Ma loai san pham khong duoc de trong", "Thong bao", 1);
        else if (this.txtMalsp.getText().length() > 6)
            JOptionPane.showMessageDialog(null, "Ma loai san pham vuot qua 6 ky ty", "Thong bao", 1);
        else if (this.txtTenloaisp.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Ten loai san pham khong duoc de trong", "Thong bao", 1);
        else if (this.txtTenloaisp.getText().length() > 700)
            JOptionPane.showMessageDialog(null, "Ten loai san pham vuot qua 70 ky tu", "Thong bao", 1);
        else {
            categorydao.suaLSP(this.txtMalsp.getText().trim(), this.txtTenloaisp.getText(),this.cbbTinhtrang.getSelectedItem().toString());
            loadCategory();
        }
    }//GEN-LAST:event_btnCapnhapActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (this.txtTenloaisp.getText().length() == 0)
            JOptionPane.showMessageDialog(null, "Bạn cần chọn loại sản phẩm cần xóa", "Thông báo", 1);
        else if (JOptionPane.showConfirmDialog(null, "ban co chac muon xoa loai san pham nay", "thong bao", 2) == 0) {
            categorydao.xoaLSP(this.txtMalsp.getText().trim());
            loadCategory();
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCapnhap;
    private com.k33ptoo.components.KButton btnThemmoi;
    private com.k33ptoo.components.KButton btnXoa;
    private javax.swing.JComboBox<String> cbbTinhtrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel qllsp;
    private javax.swing.JTable tblDanhsachLoaisp;
    private javax.swing.JTextField txtMalsp;
    private javax.swing.JTextField txtTenloaisp;
    // End of variables declaration//GEN-END:variables
}
