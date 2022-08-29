/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.AccountView;
import View.BillView;
import View.CategoryView;
import View.MainFrame;
import View.HomeView;
import View.LoginView;
import View.ProductView;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class DisplayController {

    private MainFrame view;
    private LoginView viewlogin;
    private HomeView homejpanel = new HomeView();
    private ProductView productjpanel = new ProductView();
    private CategoryView categoryjpanel = new CategoryView();
    private BillView billjpanel = new BillView();
    private AccountView accountjpanel = new AccountView();

    public DisplayController(MainFrame view) {
        this.view = view;
        this.view.setVisible(true);

        listener();
    }

    public DisplayController(LoginView viewLogin) {
        this.view = view;
        this.view.setVisible(true);

        listener();
    }

    public void listener() {
        switchPanel(homejpanel);
        bntHomepage();
        bntProduct();
        bntCategory();
        bntBill();
        bntAccount();
        logOut();

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

    public void bntCategory() {
        this.view.getJlbCategory().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(categoryjpanel);
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

    public void bntAccount() {
        this.view.getJlbAccount().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                switchPanel(accountjpanel);
            }
        });
    }

    public void switchPanel(JPanel panel) {
        List<JPanel> list = new ArrayList() {
            {
                add(homejpanel);
                add(productjpanel);
                add(categoryjpanel);
                add(billjpanel);
                add(accountjpanel);

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
