/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AccountDao;
import Model.Account;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
import View.LoginView;
import View.MainFrame;
import View.UserFrame;

/**
 *
 * @author ADMIN
 */
public final class LoginController {

    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
        this.view.setVisible(true);

        setEvent();
    }

    public void setEvent() {
        handleLogin();
 

    }
public void handleLogin() {
         this.view.getNut_dang_nhap().addActionListener((ActionEvent e) -> {

            String username = view.getTxt_tendangnhap().getText();
            String password = view.getTxt_matkhau().getText();
             AccountDao TK = new AccountDao();
            List<Account> list = new ArrayList<>();
            list = TK.getAccount(); 
            for (Account tk : list) {
                if (tk.getTendangnhap().equals(username) && tk.getMatkhau().equals(password)) { 
                    if (tk.getVaitro().equals("admin")) {
// Admin View
                        
                        this.view.dispose(); 
                        new DisplayController(new MainFrame());
                        return;  
                     } else { 
                        JOptionPane.showMessageDialog(null, "Bạn đã đăng nhập thành công");
                        this.view.dispose(); 
                         new DisplayControllerUser(new UserFrame()); 
                        return;
                    } 
                } else {
                    view.getJblMess().setText("Tên đăng nhập hoặc mật khẩu không đúng vui lòng nhập lại");
                }
            }
        });
    }
     

 
  
}
