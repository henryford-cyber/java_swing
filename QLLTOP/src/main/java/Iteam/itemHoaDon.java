/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteam;

/**
 *
 * @author HoangManh
 */
public class itemHoaDon {
    String mahd,maadmin,ngaylap,ghichu;
    int hoanthanh;

    public itemHoaDon() {
    }

    public itemHoaDon(String mahd, String maadmin, String ngaylap, String ghichu, int hoanthanh) {
        this.mahd = mahd;
        this.maadmin = maadmin;
        this.ngaylap = ngaylap;
        this.ghichu = ghichu;
        this.hoanthanh = hoanthanh;
    }

    public String getMahd() {
        return mahd;
    }

    public String getMaadmin() {
        return maadmin;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public String getGhichu() {
        return ghichu;
    }

    public int getHoanthanh() {
        return hoanthanh;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public void setMaadmin(String maadmin) {
        this.maadmin = maadmin;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public void setHoanthanh(int hoanthanh) {
        this.hoanthanh = hoanthanh;
    }
    
    
}
