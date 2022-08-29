package edu.namphan.Project.Controller;

import edu.namphan.Project.DAO.TaiKhoanDao1;
import edu.namphan.Project.Model.Taikhoan;
import edu.namphan.Project.View.LoginView;
import edu.namphan.Project.View.Main1JFrame;
import edu.namphan.Project.View.Userok;
import edu.namphan.Project.View.userFrame;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class LoginController {

    private LoginView view;
    // CTL_Chuyenmanhinh ctl =new CTL_Chuyenmanhinh(new Main1JFrame());

    public LoginController(LoginView view) {
        this.view = view;
        this.view.setVisible(true);

        setUpListener();
    }

    public void setUpListener() {
        handleLogin();

    }

    public void handleLogin() {
        this.view.getBtnLogin().addActionListener((ActionEvent e) -> {

            String username = view.getTxtUsername().getText();
            String password = String.valueOf(view.getTxtPassword().getPassword());
            TaiKhoanDao1 TK = new TaiKhoanDao1();
            List<Taikhoan> list = new ArrayList<>();
            list = TK.getAllTaiKhoan();
             
            for (Taikhoan tk : list) {
                if (tk.getTendangnhap().equals(username) && tk.getMatkhau().equals(password)) {

                    if (tk.getVaitro().equals("admin")) {
// Admin View
                        JOptionPane.showMessageDialog(null, "Bạn đã đăng nhập bằng quyền ADMIN ");
                        this.view.dispose(); 
                        new CTL_Chuyenmanhinh(new Main1JFrame());
                        return;
                    } else {
                        JOptionPane.showMessageDialog(null, "Bạn đã đăng nhập thành công");
                        this.view.dispose(); 
                        new CTL_Chuyenmanhinh(new userFrame());
// User View
                        return;
                    } 
                } else {
                    view.getJlbMess().setText("Tên đăng nhập hoặc mật khẩu không đúng vui lòng nhập lại");
                }
            }
        });
    }

}
