/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Account {

    private String mataikhoan;
    private String hoten;
    private String ngaysinh;
    private String cmnd;
    private String tendangnhap;
    private String matkhau;
    private int dienthoai;
    private String diachi;
    private String gioitinh;
    private String tinhtrang;
    private String vaitro;

    public Account() {
    }

    public Account(String mataikhoan, String hoten, String ngaysinh, String cmnd, String tendangnhap, String matkhau, int dienthoai, String diachi, String gioitinh, String tinhtrang, String vaitro) {
        this.mataikhoan = mataikhoan;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.cmnd = cmnd;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.dienthoai = dienthoai;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.tinhtrang = tinhtrang;
        this.vaitro = vaitro;
    }

    public String getMataikhoan() {
        return mataikhoan;
    }

    public void setMataikhoan(String mataikhoan) {
        this.mataikhoan = mataikhoan;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(int dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

     

}
