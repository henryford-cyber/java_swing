/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Service;

import Project.DAO.TaiKhoanDao1;
import Project.Model.Taikhoan;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanService1 {

    TaiKhoanDao1 taiKhoanDao1;

    public TaiKhoanService1() {
        taiKhoanDao1 = new TaiKhoanDao1();
    }

    public List<Taikhoan> getAllTaiKhoan() {
        return taiKhoanDao1.getAllTaiKhoan();
    }

}
