package com.example.ph12611;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.ph12611.Adapter.NguoiDUngAdapter;
import com.example.ph12611.Adapter.TheLoaiAdapter;

import com.example.ph12611.Dao.NguoiDungDAO;
import com.example.ph12611.Dao.TheLoaiDAO;
import com.example.ph12611.Model.NguoiDung;
import com.example.ph12611.Model.TheLoai;

import java.util.ArrayList;
import java.util.List;

public class ListTheLoaiActivity extends AppCompatActivity {
    public static List<TheLoai> dsTheloai = new ArrayList<>();
    ListView lvTheLoai;
    TheLoaiAdapter adapter = null;
    TheLoaiDAO theLoaiDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_the_loai);
        setTitle("Thể Loại");
        lvTheLoai=findViewById(R.id.lvTheloai);
        theLoaiDAO=new TheLoaiDAO(ListTheLoaiActivity.this);
        dsTheloai=theLoaiDAO.getAllTheLoai();
        adapter=new TheLoaiAdapter(ListTheLoaiActivity.this,dsTheloai);
        lvTheLoai.setAdapter(adapter);
    }

    public void addTheloai(View view) {
        Intent intent = new Intent(this,TheLoaiActivity.class);
        startActivity(intent);
    }
}