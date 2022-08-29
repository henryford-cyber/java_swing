/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap7;

/**
 *
 * @author ADMIN
 */
public class Sach {
     int maSach;
     String tenSach;
     float giaSach;

public Sach(){
}

public Sach(int maSach, String tenSach,float giaSach){
    this.maSach=maSach;
    this.tenSach=tenSach;
    this.giaSach=giaSach;


}
public int getMaSach(){
    return maSach; 
}
public void setMaSach(int maSach){
this.maSach=maSach;
}
public String getTenSach(){
    return tenSach; 
}
public void setTenSach(String TenSach){
this.tenSach=tenSach;
}
public float getGiaSach(){
    return giaSach; 
}
public void setGiaSach(float giaSach){
this.giaSach=giaSach;
}

    
}
