package com.example.ph12611;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ph12611.Adapter.NguoiDUngAdapter;
import com.example.ph12611.Dao.NguoiDungDAO;
import com.example.ph12611.Model.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class ListNguoiDungActivity extends AppCompatActivity {
    public static List<NguoiDung> dsNguoiDungs = new ArrayList<>();
    ListView lvNguoiDung;
    NguoiDUngAdapter adapter = null;
    NguoiDungDAO nguoiDungDAO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_nguoi_dung);
        setTitle("NGƯỜI DÙNG");
        lvNguoiDung=findViewById(R.id.lvNguoiDung);
        nguoiDungDAO=new NguoiDungDAO(ListNguoiDungActivity.this);
        dsNguoiDungs=nguoiDungDAO.getAllNguoiDung();
        adapter=new NguoiDUngAdapter(ListNguoiDungActivity.this,dsNguoiDungs);
        lvNguoiDung.setAdapter(adapter);
    }

    public void addNguoiDung(View view) {
        Intent intent = new Intent(this,AddNguoiDungActivity.class);
        startActivity(intent);
    }


    public void changePass(View view) {
        Intent intent = new Intent(this,ChangePass.class);
        startActivity(intent);
    }
}

