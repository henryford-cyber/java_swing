/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlylaptop;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.accessibility.AccessibleContext;
import javax.swing.*;

/**
 *
 * @author Tai
 */
public class Tailogin extends javax.swing.JFrame {

     Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    // làm sạch thông tin ở khung sau khi insert, sản phẩm, tài khoản,....
    public void Lam_sach(){
        hoten.setText(null);
        ten_dang_nhap.setText(null);
        matkhau_dangky_o_dialog.setText(null);
        xacnhanmatkhau.setText(null);
        ngaythang.setDate(null);
    }

    public Connection getConn() {
        return conn;
    }

    public PreparedStatement getPst() {
        return pst;
    }

    public ResultSet getRs() {
        return rs;
    }

    public JTextField getCmt() {
        return cmt;
    }

    public JButton getDang_ky() {
        return dang_ky;
    }

    public JDialog getDangky() {
        return dangky;
    }

    public JTextField getDia_chi_hep() {
        return dia_chi_hep;
    }

    public JTextField getDien_thoai() {
        return dien_thoai;
    }

    public JButton getDk_su_dung() {
        return dk_su_dung;
    }

    public JComboBox getGioitinh() {
        return gioitinh;
    }

  

    public JTextField getHoten() {
        return hoten;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

     

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public JLabel getLoi_mat_khau() {
        return loi_mat_khau;
    }

    public JTextField getMaadmin_txt() {
        return maadmin_txt;
    }

    public JPasswordField getMatkhau_dangky_o_dialog() {
        return matkhau_dangky_o_dialog;
    }

    public JDateChooser getNgaythang() {
        return ngaythang;
    }

    public JLabel getNhap_matkhau() {
        return nhap_matkhau;
    }

    public JButton getNut_dang_ky() {
        return nut_dang_ky;
    }

    public JButton getNut_dang_nhap() {
        return nut_dang_nhap;
    }

    public JTextField getTen_dang_nhap() {
        return ten_dang_nhap;
    }

    public JPasswordField getTxt_matkhau() {
        return txt_matkhau;
    }

    public JTextField getTxt_tendangnhap() {
        return txt_tendangnhap;
    }

    public JLabel getXac_nhan_matkhau() {
        return xac_nhan_matkhau;
    }

    public JPasswordField getXacnhanmatkhau() {
        return xacnhanmatkhau;
    }

    public static int getDEFAULT_CURSOR() {
        return DEFAULT_CURSOR;
    }

    public static int getCROSSHAIR_CURSOR() {
        return CROSSHAIR_CURSOR;
    }

    public static int getTEXT_CURSOR() {
        return TEXT_CURSOR;
    }

    public static int getWAIT_CURSOR() {
        return WAIT_CURSOR;
    }

    public static int getSW_RESIZE_CURSOR() {
        return SW_RESIZE_CURSOR;
    }

    public static int getSE_RESIZE_CURSOR() {
        return SE_RESIZE_CURSOR;
    }

    public static int getNW_RESIZE_CURSOR() {
        return NW_RESIZE_CURSOR;
    }

    public static int getNE_RESIZE_CURSOR() {
        return NE_RESIZE_CURSOR;
    }

    public static int getN_RESIZE_CURSOR() {
        return N_RESIZE_CURSOR;
    }

    public static int getS_RESIZE_CURSOR() {
        return S_RESIZE_CURSOR;
    }

    public static int getW_RESIZE_CURSOR() {
        return W_RESIZE_CURSOR;
    }

    public static int getE_RESIZE_CURSOR() {
        return E_RESIZE_CURSOR;
    }

    public static int getHAND_CURSOR() {
        return HAND_CURSOR;
    }

    public static int getMOVE_CURSOR() {
        return MOVE_CURSOR;
    }

    public static int getNORMAL() {
        return NORMAL;
    }

    public static int getICONIFIED() {
        return ICONIFIED;
    }

    public static int getMAXIMIZED_HORIZ() {
        return MAXIMIZED_HORIZ;
    }

    public static int getMAXIMIZED_VERT() {
        return MAXIMIZED_VERT;
    }

    public static int getMAXIMIZED_BOTH() {
        return MAXIMIZED_BOTH;
    }

    public static float getTOP_ALIGNMENT() {
        return TOP_ALIGNMENT;
    }

    public static float getCENTER_ALIGNMENT() {
        return CENTER_ALIGNMENT;
    }

    public static float getBOTTOM_ALIGNMENT() {
        return BOTTOM_ALIGNMENT;
    }

    public static float getLEFT_ALIGNMENT() {
        return LEFT_ALIGNMENT;
    }

    public static float getRIGHT_ALIGNMENT() {
        return RIGHT_ALIGNMENT;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public static int getDO_NOTHING_ON_CLOSE() {
        return DO_NOTHING_ON_CLOSE;
    }

    public static int getHIDE_ON_CLOSE() {
        return HIDE_ON_CLOSE;
    }

    public static int getDISPOSE_ON_CLOSE() {
        return DISPOSE_ON_CLOSE;
    }

    public static int getEXIT_ON_CLOSE() {
        return EXIT_ON_CLOSE;
    }

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }

    public static int getPROPERTIES() {
        return PROPERTIES;
    }

    public static int getSOMEBITS() {
        return SOMEBITS;
    }

    public static int getFRAMEBITS() {
        return FRAMEBITS;
    }

    public static int getALLBITS() {
        return ALLBITS;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getABORT() {
        return ABORT;
    }
    
    /**
     * Creates new form Tailogin
     */
    public Tailogin() {
        initComponents();
    }
 public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dangky = new javax.swing.JDialog();
        maadmin_txt = new javax.swing.JTextField();
        gioitinh = new javax.swing.JComboBox();
        cmt = new javax.swing.JTextField();
        ngaythang = new com.toedter.calendar.JDateChooser();
        nhap_matkhau = new javax.swing.JLabel();
        xac_nhan_matkhau = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hoten = new javax.swing.JTextField();
        ten_dang_nhap = new javax.swing.JTextField();
        dk_su_dung = new javax.swing.JButton();
        dang_ky = new javax.swing.JButton();
        matkhau_dangky_o_dialog = new javax.swing.JPasswordField();
        xacnhanmatkhau = new javax.swing.JPasswordField();
        loi_mat_khau = new javax.swing.JLabel();
        dien_thoai = new javax.swing.JTextField();
        dia_chi_hep = new javax.swing.JTextField();
        txt_tendangnhap = new javax.swing.JTextField();
        txt_matkhau = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        nut_dang_ky = new javax.swing.JButton();
        nut_dang_nhap = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        dangky.setTitle("From Đăng Ký Tài Khoản");
        dangky.setResizable(false);
        dangky.getContentPane().setLayout(null);
        dangky.getContentPane().add(maadmin_txt);
        maadmin_txt.setBounds(530, 150, 120, 30);

        gioitinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gioitinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nu", "Gay", "Less" }));
        dangky.getContentPane().add(gioitinh);
        gioitinh.setBounds(110, 420, 110, 30);
        dangky.getContentPane().add(cmt);
        cmt.setBounds(540, 300, 190, 30);

        ngaythang.setDateFormatString("yyyy-MM-dd");
        ngaythang.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dangky.getContentPane().add(ngaythang);
        ngaythang.setBounds(240, 360, 240, 40);

        nhap_matkhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nhap_matkhau.setForeground(new java.awt.Color(255, 0, 51));
        dangky.getContentPane().add(nhap_matkhau);
        nhap_matkhau.setBounds(220, 284, 180, 20);
        dangky.getContentPane().add(xac_nhan_matkhau);
        xac_nhan_matkhau.setBounds(200, 344, 210, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dialog/chuan_nhat_9x.png"))); // NOI18N
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        dangky.getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 510, 520);

        hoten.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hoten.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dangky.getContentPane().add(hoten);
        hoten.setBounds(152, 123, 330, 42);

        ten_dang_nhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ten_dang_nhap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dangky.getContentPane().add(ten_dang_nhap);
        ten_dang_nhap.setBounds(150, 182, 340, 42);

        dk_su_dung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dialog/dieu-kieu-su-dung.png"))); // NOI18N
        dangky.getContentPane().add(dk_su_dung);
        dk_su_dung.setBounds(20, 481, 150, 30);

        dang_ky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dialog/anh-dk.png"))); // NOI18N
        dang_ky.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dang_ky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dang_kyActionPerformed(evt);
            }
        });
        dangky.getContentPane().add(dang_ky);
        dang_ky.setBounds(380, 460, 112, 56);

        matkhau_dangky_o_dialog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        matkhau_dangky_o_dialog.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dangky.getContentPane().add(matkhau_dangky_o_dialog);
        matkhau_dangky_o_dialog.setBounds(110, 240, 370, 50);

        xacnhanmatkhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        xacnhanmatkhau.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dangky.getContentPane().add(xacnhanmatkhau);
        xacnhanmatkhau.setBounds(190, 300, 280, 50);
        dangky.getContentPane().add(loi_mat_khau);
        loi_mat_khau.setBounds(310, 80, 180, 40);
        dangky.getContentPane().add(dien_thoai);
        dien_thoai.setBounds(530, 100, 170, 40);
        dangky.getContentPane().add(dia_chi_hep);
        dia_chi_hep.setBounds(540, 200, 200, 70);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        txt_tendangnhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_tendangnhap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tendangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tendangnhapActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tendangnhap);
        txt_tendangnhap.setBounds(310, 200, 174, 34);

        txt_matkhau.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_matkhau.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_matkhau);
        txt_matkhau.setBounds(310, 240, 174, 34);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 360, 280, 40);

        nut_dang_ky.setText("ĐĂNG KÍ");
        nut_dang_ky.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nut_dang_ky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nut_dang_kyActionPerformed(evt);
            }
        });
        getContentPane().add(nut_dang_ky);
        nut_dang_ky.setBounds(310, 370, 186, 38);

        nut_dang_nhap.setText("ĐĂNG NHẬP");
        nut_dang_nhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nut_dang_nhapActionPerformed(evt);
            }
        });
        getContentPane().add(nut_dang_nhap);
        nut_dang_nhap.setBounds(250, 310, 331, 40);

        jLabel1.setText("TÊN ĐĂNG NHẬP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 210, 100, 20);

        jLabel5.setText("MẬT KHẨU");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 250, 80, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tendangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tendangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tendangnhapActionPerformed

    private void nut_dang_nhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nut_dang_nhapActionPerformed
GiaoDienAdmin giaodien = new GiaoDienAdmin();
               giaodien.setSize(1024, 768);
                giaodien.setLocationRelativeTo(null);
                giaodien.setVisible(true);
//String sql = "select * from admin where tendangnhap=? and matkhau=?";
//        try {
//            pst = conn.prepareStatement(sql);
//            pst.setString(1, txt_tendangnhap.getText());
//            pst.setString(2, txt_matkhau.getText());
//            rs = pst.executeQuery();
//            if (rs.next()) {
//                JOptionPane.showMessageDialog(null, "Bạn Đăng Nhập Thành Công");
//                close();
//
//                GiaoDienAdmin giaodien = new GiaoDienAdmin();
//                giaodien.setSize(1024, 768);
//                giaodien.setLocationRelativeTo(null);
//                giaodien.setVisible(true);
//                conn.close();
//            } else {
//                JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc Mật khẩu không đúng");
//            }
//            conn.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_nut_dang_nhapActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        conn = MySqlConnect.ConnectDb();
    }//GEN-LAST:event_formWindowActivated

    private void nut_dang_kyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nut_dang_kyActionPerformed
       dangky.setSize(512, 552);
       dangky.setLocationRelativeTo(null);
        dangky.setVisible(true);
    }//GEN-LAST:event_nut_dang_kyActionPerformed

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4AncestorAdded

    private void dang_kyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dang_kyActionPerformed
        String matkhau = new String(matkhau_dangky_o_dialog.getPassword());
        if (matkhau.equals("")) {
            nhap_matkhau.setText("Bạn chưa nhập mật khẩu!");
            matkhau_dangky_o_dialog.requestFocus();
            return;
        }

        String matkhau2 = new String(xacnhanmatkhau.getPassword());
        if (matkhau2.equals("")) {
            xac_nhan_matkhau.setText("Bạn chưa nhập lại mật khẩu!");
            xacnhanmatkhau.requestFocus();
            return;
        }
        if (!matkhau.equals(matkhau2)) {
            xac_nhan_matkhau.setText("nhập lại mật khẩu khong dung!");
            xacnhanmatkhau.requestFocus();
            return;
        } else {
            String sqlquery = "SELECT `tendangnhap` FROM `admin` WHERE `tendangnhap`=?";

            try {
                pst = conn.prepareStatement(sqlquery);
                //
                pst.setString(1, ten_dang_nhap.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "tên đăng nhập bị trùng");
                } else {
                    String sql = "INSERT INTO `admin`(`tenadmin`, `ngaysinh`, `cmnd`, `tendangnhap`, `matkhau`, `dienthoai`, `diachi`, `gioitinh`) VALUES (?,?,?,?,?,?,?,?)";

                    pst = conn.prepareStatement("INSERT INTO `admin`(`tenadmin`, `ngaysinh`, `cmnd`, `tendangnhap`, `matkhau`, `dienthoai`, `diachi`, `gioitinh`) VALUES (?,?,?,?,?,?,?,?)");
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://Localhost/quanlysach", "root", "");
                    pst.setString(1, hoten.getText());
                    pst.setString(2, ((JTextField) ngaythang.getDateEditor().getUiComponent()).getText());
                    pst.setString(3, cmt.getText());
                    pst.setString(4, ten_dang_nhap.getText());
                    pst.setString(5, String.valueOf(matkhau_dangky_o_dialog.getPassword()));

                    pst.setString(6, dien_thoai.getText());
                    pst.setString(7, dia_chi_hep.getText());
                    pst.setString(8, gioitinh.getSelectedItem().toString());

                    int i = pst.executeUpdate();
                    if (i > 0) {
                        JOptionPane.showMessageDialog(null, "Đăng Ký Thành Công");
                        Lam_sach();
                        GiaodienquanlyAdmin up = new GiaodienquanlyAdmin();
                        up.Updata_Table();
                    } else {
                        JOptionPane.showMessageDialog(null, "Đăng Ký Thất Bại");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_dang_kyActionPerformed

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
            java.util.logging.Logger.getLogger(Tailogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tailogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tailogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tailogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tailogin giaodien = new Tailogin();
                giaodien.setSize(1024, 768);
                giaodien.setLocationRelativeTo(null);
                giaodien.setVisible(true);  
//                new Tailogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cmt;
    private javax.swing.JButton dang_ky;
    private javax.swing.JDialog dangky;
    private javax.swing.JTextField dia_chi_hep;
    private javax.swing.JTextField dien_thoai;
    private javax.swing.JButton dk_su_dung;
    private javax.swing.JComboBox gioitinh;
    private javax.swing.JTextField hoten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel loi_mat_khau;
    private javax.swing.JTextField maadmin_txt;
    private javax.swing.JPasswordField matkhau_dangky_o_dialog;
    private com.toedter.calendar.JDateChooser ngaythang;
    private javax.swing.JLabel nhap_matkhau;
    private javax.swing.JButton nut_dang_ky;
    private javax.swing.JButton nut_dang_nhap;
    private javax.swing.JTextField ten_dang_nhap;
    private javax.swing.JPasswordField txt_matkhau;
    private javax.swing.JTextField txt_tendangnhap;
    private javax.swing.JLabel xac_nhan_matkhau;
    private javax.swing.JPasswordField xacnhanmatkhau;
    // End of variables declaration//GEN-END:variables
}
