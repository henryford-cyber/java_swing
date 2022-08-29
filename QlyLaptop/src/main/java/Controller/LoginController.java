/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.AdminDao;
import Model.Admin;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import quanlylaptop.Tailogin;

/**
 *
 * @author ADMIN
 */
public class LoginController {
   private Tailogin view;  
 public LoginController(Tailogin view) {
        this.view = view;
        this.view.setVisible(true);

      setEvent();
    }
 public void setEvent(){
HandleFunction();
}
public void HandleFunction(){
 this.view.getNut_dang_nhap().addActionListener((ActionEvent e) -> {

           String username = view.getTxt_tendangnhap().getText();
           String password = String.valueOf(view.getTxt_matkhau().getPassword());

            AdminDao TK = new AdminDao();
            List<Admin> list = new ArrayList<>();
            list = TK.getAdmin();
            boolean ok = false;
            for (Admin tk : list) {
                if (tk.getTendangnhap().equals(username) && tk.getMatkhau().equals(password)) {
 JOptionPane.showMessageDialog(null, tk.getTendangnhap()+tk.getMatkhau() );
//                        this.view.dispose();
//                        JOptionPane.showMessageDialog(null, "Bạn đã đăng nhập bằng quyền ADMIN ");
//                        new GiaoDienAdmin().setVisible(true);
                        return;
                    }  else { JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng vui lòng nhập lại ");

                         
                }
            }
        });
    }
}