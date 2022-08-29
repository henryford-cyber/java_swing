/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

 
import View.BillView;
 
import View.HomeView;
import View.LoginView;
import View.MainFrame;
import View.ProductView;
import View.UserFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DisplayControllerUser {

    private UserFrame view;
    private LoginView viewlogin;
    private HomeView homejpanel = new HomeView();
    private ProductView productjpanel = new ProductView(); 
    private BillView billjpanel = new BillView(); 
    public DisplayControllerUser(UserFrame view) {
        this.view = view;
        this.view.setVisible(true); 
        sukien();
       listener();
    } 
//    public DisplayControllerUser(LoginView viewlogin) {
//        this.view = view;
//        this.view.setVisible(true); 
//        listener();
//    } 
    public void sukien() {
        logOut();
    } 
    public void listener() {
        switchPanel(homejpanel);
        bntHomepage();
        bntProduct();
        bntBill(); 
    } 
    public void bntHomepage() {
        this.view.getJlbHomepage().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(homejpanel);
            }
        });
    }

    public void bntProduct() {
        this.view.getJlbProduct().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(productjpanel);
            }
        });
    }

    public void bntBill() {
        this.view.getJlbBill().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(billjpanel);
            }
        });
    }

    public void switchPanel(JPanel panel) {
        List<JPanel> list = new ArrayList() {
            {
                add(homejpanel);
                add(productjpanel);
                add(billjpanel);

            }
        };
        list.forEach(item -> {
            item.setVisible(false);

        });
        this.view.getPanelRender().add(panel);
        panel.setVisible(true);
    }

    public void logOut() {
        this.view.getBtnLogout().addActionListener(l -> {
            if (JOptionPane.showConfirmDialog(null, "Bạn có chắc là muốn Đăng xuất !") == JOptionPane.YES_OPTION) {
                this.view.dispose();
LoginView LG = new LoginView();
        LG.setSize(1000, 600);
        LG.setLocationRelativeTo(null); 
        LG.setTitle("Đăng nhập hệ thống");
        new LoginController(LG);
//                LoginView dangnhap = new LoginView();
//                dangnhap.setTitle("Đăng nhập hệ thông!");
//                dangnhap.setLocationRelativeTo(null);
//                dangnhap.setVisible(true);
            } else {
                return;
            }

        });
    }

}
