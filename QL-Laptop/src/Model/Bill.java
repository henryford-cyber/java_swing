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
public class Bill {

    private int mahd;
    private int maadmin;
    private Date ngaylap;
    private String ghichu;
    private double tongtien;
    private String hoanthanh;
    private int co;
    private String tinhtrang;

    public Bill() {
    }

    public Bill(int mahd, int maadmin, Date ngaylap, String ghichu, double tongtien, String hoanthanh, int co, String tinhtrang) {
        this.mahd = mahd;
        this.maadmin = maadmin;
        this.ngaylap = ngaylap;
        this.ghichu = ghichu;
        this.tongtien = tongtien;
        this.hoanthanh = hoanthanh;
        this.co = co;
        this.tinhtrang = tinhtrang;
    }

    public int getMahd() {
        return mahd;
    }

    public void setMahd(int mahd) {
        this.mahd = mahd;
    }

    public int getMaadmin() {
        return maadmin;
    }

    public void setMaadmin(int maadmin) {
        this.maadmin = maadmin;
    }

    public Date getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public String getHoanthanh() {
        return hoanthanh;
    }

    public void setHoanthanh(String hoanthanh) {
        this.hoanthanh = hoanthanh;
    }

    public int getCo() {
        return co;
    }

    public void setCo(int co) {
        this.co = co;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }


}
