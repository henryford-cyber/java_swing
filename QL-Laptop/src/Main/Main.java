package Main;

import Controller.DisplayController;
import Controller.LoginController;
import Controller.ProductController;
import View.LoginView;
import View.MainFrame;
import View.ProductView;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        LoginView LG = new LoginView();
        LG.setSize(1000, 600);
        LG.setLocationRelativeTo(null); 
        LG.setTitle("Đăng nhập hệ thống");
        new LoginController(LG);
//-----------------
//          MainFrame main =new MainFrame();
//          main.setLocationRelativeTo(null); 
//          new DisplayController(main);
 
 
    }
}
