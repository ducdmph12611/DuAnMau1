package com.example.ph12611;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void viewNguoiDung(View view) {
        Intent intent = new Intent(this,ListNguoiDungActivity.class);
        startActivity(intent);
    }

    public void viewTheLoai(View view) {
        Intent intent = new Intent(this,TheLoaiActivity.class);
        startActivity(intent);
    }

    public void viewSach(View view) {
        Intent intent = new Intent(this,SachActivity.class);
        startActivity(intent);
    }

    public void viewHoaDon(View view) {
        Intent intent = new Intent(this,HoaDonActivity.class);
        startActivity(intent);
    }

    public void viewTopSach(View view) {
        Intent intent = new Intent(this,TopSachActivity.class);
        startActivity(intent);
    }

    public void viewThongKe(View view) {
        Intent intent = new Intent(this,ThongKeActivity.class);
        startActivity(intent);
    }
}