package edu.namphan.Project.Main;

import edu.namphan.Project.Controller.CTL_Chuyenmanhinh;
import edu.namphan.Project.Controller.LoginController;
import edu.namphan.Project.Controller.SinhvienController;
 
import edu.namphan.Project.View.LoginView;
import edu.namphan.Project.View.Main1JFrame;
import edu.namphan.Project.View.SinhvienJPanel;

public class Main {

    public static void main(String[] args) {
       
        new LoginController(new LoginView());
        
         // new CTL_Chuyenmanhinh(new Main1JFrame());
    }
}
