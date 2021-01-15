package com.example.ph12611.Model;

public class NguoiDung {
    private String Username;
    private String Pass;
    private String Phone;
    private String HoTen;

    public NguoiDung(String username, String pass, String phone, String hoTen) {
        Username = username;
        Pass = pass;
        Phone = phone;
        HoTen = hoTen;
    }

    public NguoiDung() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "Username='" + Username + '\'' +
                ", Pass='" + Pass + '\'' +
                ", Phone='" + Phone + '\'' +
                ", HoTen='" + HoTen + '\'' +
                '}';
    }
}
