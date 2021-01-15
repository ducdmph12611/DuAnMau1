package com.example.ph12611.Model;

public class TheLoai {
    private String MaTL;
    private String TenTL;
    private String Mota;
    private String Vitri;

    public TheLoai(String maTL, String tenTL, String mota, String vitri) {
        MaTL = maTL;
        TenTL = tenTL;
        Mota = mota;
        Vitri = vitri;
    }

    public TheLoai() {
    }

    public String getMaTL() {
        return MaTL;
    }

    public void setMaTL(String maTL) {
        MaTL = maTL;
    }

    public String getTenTL() {
        return TenTL;
    }

    public void setTenTL(String tenTL) {
        TenTL = tenTL;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getVitri() {
        return Vitri;
    }

    public void setVitri(String vitri) {
        Vitri = vitri;
    }

    @Override
    public String toString() {
        return getMaTL()+" | "+getTenTL();
    }
}
