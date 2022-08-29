/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Service;

import Project.DAO.TaikhoanDAO;
import Project.DAO.TaikhoanDAOImpl;
import Project.Model.Taikhoan;

/**
 *
 * @author ADMIN
 */
 
public class TaikhoanServiceImpl implements TaikhoanService {

    private TaikhoanDAO taikhoanDAO = null;

    public TaikhoanServiceImpl() {
        taikhoanDAO = new TaikhoanDAOImpl();
    }

    @Override
    public Taikhoan login(String tendangnhap, String matkhau) {
        return taikhoanDAO.login(tendangnhap, matkhau);
    }

}
