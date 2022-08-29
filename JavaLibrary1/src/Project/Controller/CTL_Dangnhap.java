/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Controller;

import Project.Model.Taikhoan;
import Project.Service.TaikhoanService;
import Project.Service.TaikhoanServiceImpl;
import Project.View.Main1JFrame;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class CTL_Dangnhap {

    private Dialog dialog;
    private JButton btnLogin;
    private JTextField txtUser;
    private JPasswordField txtPass;
    private JLabel jlbMsg;

    private TaikhoanService taikhoanService = null;

    public CTL_Dangnhap(Dialog dialog, JButton btnLogin, JTextField txtUser, JPasswordField txtPass, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnLogin = btnLogin;
        this.txtUser = txtUser;
        this.txtPass = txtPass;
        this.jlbMsg = jlbMsg;
        taikhoanService = new TaikhoanServiceImpl();
    }

    public void setEvent() {
        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    if (txtUser.getText().length() == 0
                            || txtPass.getPassword().length == 0) {
                        jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc!");
                    } else {
                        Taikhoan taikhoan = taikhoanService.login(txtUser.getText(), txtPass.getText());
                        if (taikhoan == null) {
                            jlbMsg.setText("Tên đăng nhập hoặc mật khẩu không đúng!");
                        } else {

                            Main1JFrame frame = new Main1JFrame();
                            frame.setTitle("Quản Lý Sinh viên");
                            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            frame.setVisible(true);
                            dialog.dispose();
                        }
                    }
                } catch (Exception ex) {
                    jlbMsg.setText(ex.toString());
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogin.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLogin.setBackground(new Color(100, 221, 23));
            }
        });

    }
}
