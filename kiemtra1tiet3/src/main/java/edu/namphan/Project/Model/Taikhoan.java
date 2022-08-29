package edu.namphan.Project.Model;

public class Taikhoan {

    private int mataikhoan;
    private String tendangnhap;
    private String matkhau;
    private String vaitro;

    public Taikhoan() {
    }

    public Taikhoan(int mataikhoan, String tendangnhap, String matkhau, String vaitro) {
        this.mataikhoan = mataikhoan;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
    }

    public int getMataikhoan() {
        return mataikhoan;
    }

    public void setMataikhoan(int mataikhoan) {
        this.mataikhoan = mataikhoan;
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

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

}
