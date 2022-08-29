/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KIEMTRA1TIET;

/**
 *
 * @author ADMIN
 */
public class Student {
private String gioiTinh, hoTen, email, soDT, diaChi;
private int maSV;
public Student () {
}
public Student (int maSV, String hoTen, String email, String SoDT, String diaChi, String gioiTinh) {
     
    this.hoTen =hoTen;
    this.email = email;
    this.soDT =SoDT;
    this.diaChi = diaChi;
    this.gioiTinh = gioiTinh;
    
}

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

}
