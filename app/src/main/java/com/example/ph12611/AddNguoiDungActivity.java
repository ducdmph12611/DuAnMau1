package com.example.ph12611;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ph12611.Dao.NguoiDungDAO;
import com.example.ph12611.Model.NguoiDung;

public class AddNguoiDungActivity extends AppCompatActivity {
    EditText edUser,edPass,edPhone,edFullName;
    NguoiDungDAO nguoiDungDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_nguoi_dung);
        setTitle("Them Nguoi Dung");
        edUser=findViewById(R.id.edUser);
        edPass=findViewById(R.id.edPass);
        edPhone=findViewById(R.id.edPhone);
        edFullName=findViewById(R.id.edFullname);

    }

    public void addUser(View view) {
        nguoiDungDao=new NguoiDungDAO(AddNguoiDungActivity.this);
        NguoiDung nguoidung=new NguoiDung(edUser.getText().toString(),
                edPass.getText().toString(),edPhone.getText().toString(),edFullName.getText().toString());
        if (nguoiDungDao.insertNguoiDung(nguoidung)==1)
        {
            Toast.makeText(AddNguoiDungActivity.this,"Them thanh cong",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(AddNguoiDungActivity.this,"Them that bai",Toast.LENGTH_SHORT).show();
        }
    }

    public void Huy(View view) {
        Intent intent=new Intent(AddNguoiDungActivity.this,ListNguoiDungActivity.class);
        startActivity(intent);
    }
}