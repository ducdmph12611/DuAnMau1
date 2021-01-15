package com.example.ph12611;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ph12611.Dao.NguoiDungDAO;
import com.example.ph12611.Dao.TheLoaiDAO;
import com.example.ph12611.Model.NguoiDung;
import com.example.ph12611.Model.TheLoai;

public class TheLoaiActivity extends AppCompatActivity {
    EditText edMaTL,edTenTL,edMT,edVT;
   TheLoaiDAO theLoaiDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_loai);
        setTitle("Them Thể loại");
        edMaTL=findViewById(R.id.edMaTL);
        edTenTL=findViewById(R.id.edTenTl);
        edMT=findViewById(R.id.edMT);
        edVT=findViewById(R.id.edVT);

    }

    public void addTL(View view) {
        theLoaiDAO=new TheLoaiDAO(TheLoaiActivity.this);
        TheLoai theLoai=new TheLoai(edMaTL.getText().toString(),
                edTenTL.getText().toString(),edMT.getText().toString(),edVT.getText().toString());
        if (theLoaiDAO.inserTheLoai (theLoai)==1)
        {
            Toast.makeText(TheLoaiActivity.this,"Them thanh cong",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(TheLoaiActivity.this,"Them that bai",Toast.LENGTH_SHORT).show();
        }
    }

    public void Huy(View view) {
        Intent intent=new Intent(TheLoaiActivity.this,ListTheLoaiActivity.class);
        startActivity(intent);
    }
}