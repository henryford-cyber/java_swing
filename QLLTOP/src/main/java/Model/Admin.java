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
public class Admin {

    private int maadmin;
    private String tenadmin;
    private Date ngaysinh;
    private String cmnd;
    private String tendangnhap;
    private String matkhau;
    private int dienthoai;
    private String diachi;
    private String gioitinh;

    public Admin() {
    }

    public Admin(int maadmin, String tenadmin, Date ngaysinh, String cmnd, String tendangnhap, String matkhau, int dienthoai, String diachi, String gioitinh) {
        this.maadmin = maadmin;
        this.tenadmin = tenadmin;
        this.ngaysinh = ngaysinh;
        this.cmnd = cmnd;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.dienthoai = dienthoai;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public int getMaadmin() {
        return maadmin;
    }

    public void setMaadmin(int maadmin) {
        this.maadmin = maadmin;
    }

    public String getTenadmin() {
        return tenadmin;
    }

    public void setTenadmin(String tenadmin) {
        this.tenadmin = tenadmin;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
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

}
