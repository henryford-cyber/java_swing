/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.namphan.kiemtra1tiet3.main;

import edu.namphan.kiemtra1tiet3.Form.MainForm;
import edu.namphan.kiemtra1tiet3.dao.StudentDAO;
import edu.namphan.kiemtra1tiet3.model.Student;
import edu.namphan.kiemtra1tiet3.utils.DatabaseConnection;

/**
 *
 * @author ADMIN
 */
public class ApplicationRunner {

    public static void main(String[] args) throws Exception {
            new MainForm().setVisible(true);
//        StudentDAO test = new StudentDAO();
//        try {
//            System.out.println("xin chao cac ban");
//            test.insert(new Student(1, "Nguyen van a", "Avannguyen@gmail.com", "056456465", true, "Huế"));
//        } catch (Exception e) {
//        }
    }

}
 
 
