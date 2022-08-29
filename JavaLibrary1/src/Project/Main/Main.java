package Project.Main;

import Project.View.FormDangnhap;
import Project.View.Main1JFrame;

public class Main {

    public static void main(String[] args) {
        //new Main1JFrame().setVisible(true) ;
        FormDangnhap dangnhap = new FormDangnhap(null, true);
        dangnhap.setTitle("Đăng nhập hệ thông!");
        //dangnhap.setResizable(false);
        dangnhap.setLocationRelativeTo(null);
        dangnhap.setVisible(true);


    }
}
