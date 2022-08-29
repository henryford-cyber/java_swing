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
public class itemChiTietHoaDon {
    String mahd1,masp1;
    int soluong1;
    double gia1;

    public itemChiTietHoaDon() {
    }

    public itemChiTietHoaDon(String mahd1, String masp1, int soluong1, double gia1) {
        this.mahd1 = mahd1;
        this.masp1 = masp1;
        this.soluong1 = soluong1;
        this.gia1 = gia1;
    }

    public String getMahd1() {
        return mahd1;
    }

    public String getMasp1() {
        return masp1;
    }

    public int getSoluong1() {
        return soluong1;
    }

    public double getGia1() {
        return gia1;
    }

    public void setMahd1(String mahd1) {
        this.mahd1 = mahd1;
    }

    public void setMasp1(String masp1) {
        this.masp1 = masp1;
    }

    public void setSoluong1(int soluong1) {
        this.soluong1 = soluong1;
    }

    public void setGia1(double gia1) {
        this.gia1 = gia1;
    }

   
    
    
    
}
