/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ADMIN
 */
public class Product {
    private int masp;
     private String loaisp;
 private String tensp;
 private double gia;
 
 private String tomtac;
  private String linhkien;
 private String khuyenmai;
 private String thongso;
 private String baiviet;
 private int baohanh;
 private int soluong;
 private String tinhtrang;
public Product(){} 

    public Product(int masp, String loaisp, String tensp, double gia, String tomtac, String linhkien, String khuyenmai, String thongso, String baiviet, int baohanh, int soluong, String tinhtrang) {
        this.masp = masp;
        this.loaisp = loaisp;
        this.tensp = tensp;
        this.gia = gia;
        this.tomtac = tomtac;
        this.linhkien = linhkien;
        this.khuyenmai = khuyenmai;
        this.thongso = thongso;
        this.baiviet = baiviet;
        this.baohanh = baohanh;
        this.soluong = soluong;
        this.tinhtrang = tinhtrang;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTomtac() {
        return tomtac;
    }

    public void setTomtac(String tomtac) {
        this.tomtac = tomtac;
    }

    public String getLinhkien() {
        return linhkien;
    }

    public void setLinhkien(String linhkien) {
        this.linhkien = linhkien;
    }

    public String getKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(String khuyenmai) {
        this.khuyenmai = khuyenmai;
    }

    public String getThongso() {
        return thongso;
    }

    public void setThongso(String thongso) {
        this.thongso = thongso;
    }

    public String getBaiviet() {
        return baiviet;
    }

    public void setBaiviet(String baiviet) {
        this.baiviet = baiviet;
    }

    public int getBaohanh() {
        return baohanh;
    }

    public void setBaohanh(int baohanh) {
        this.baohanh = baohanh;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }
 
 
 
}
