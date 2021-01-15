package com.example.ph12611.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.ph12611.Database.DatabaseHepler;
import com.example.ph12611.Model.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungDAO {
    public DatabaseHepler dbHepler;
    public SQLiteDatabase db;
    public static final String SQL_NGUOIDUNG = "CREATE TABLE NguoiDung (" +
        " Username text primary key, "+
        " Pass text, "+
        " Phone text, "+
        " HoTen text"+
        ");";
    public static final String TABLE_NAME = "NguoiDung";
    public NguoiDungDAO(Context context){
           dbHepler = new DatabaseHepler(context);
           db = dbHepler.getWritableDatabase();
    }
  public int insertNguoiDung(NguoiDung nguoiDung){
      ContentValues values = new ContentValues();
      values.put("Username",nguoiDung.getUsername());
      values.put("Pass",nguoiDung.getPass());
      values.put("Phone",nguoiDung.getPhone());
      values.put("HoTen",nguoiDung.getHoTen());
     try {
         if (db.insert(TABLE_NAME,null,values) < 0) {
             return -1;
         }
     }catch (Exception ex) {
         Log.e("NguoiDungDAO",ex.getMessage());
     }
          return 1;
  }
    public List<NguoiDung> getAllNguoiDung(){
        List<NguoiDung> dsNguoiDung = new ArrayList<>();
        Cursor c = db.query(TABLE_NAME,null,null,null,null,null,null);
        c.moveToFirst();
        while (c.isAfterLast()==false){
            NguoiDung ee = new NguoiDung();
            ee.setUsername(c.getString(0));
            ee.setPass(c.getString(1));
            ee.setPhone(c.getString(2));
            ee.setHoTen(c.getString(3));
            dsNguoiDung.add(ee);
            Log.d("//=====",ee.toString());
            c.moveToNext();
        }
        c.close();
        return dsNguoiDung;
    }
    public int updateNguoiDung(NguoiDung nd){
        ContentValues values = new ContentValues();
        values.put("username",nd.getUsername());
        values.put("password",nd.getPass());
        values.put("phone",nd.getPhone());
        values.put("hoten",nd.getHoTen());
        int result = db.update(TABLE_NAME,values,"username=?", new
                String[]{nd.getUsername()});
        if (result == 0){
            return -1;
        }
        return 1;
    }
    public int changePasswordNguoiDung(NguoiDung nd){
        ContentValues values = new ContentValues();
        values.put("username",nd.getUsername());
        values.put("password",nd.getPass());
        int result = db.update(TABLE_NAME,values,"username=?", new
                String[]{nd.getUsername()});
        if (result == 0){
            return -1;
        }
        return 1;
    }
    public int updateInfoNguoiDung(String username,String phone, String name){
        ContentValues values = new ContentValues();
        values.put("phone",phone);
        values.put("hoten",name);
        int result = db.update(TABLE_NAME,values,"username=?", new
                String[]{username});
        if (result == 0){
            return -1;
        }
        return 1;
    }
    //delete
    public int deleteNguoiDungByID(String username){
        int result = db.delete(TABLE_NAME,"username=?",new String[]{username});
        if (result == 0)
            return -1;
        return 1;
    }
    public int checkLogin(String username, String password){
        int result = db.delete(TABLE_NAME,"username=? AND password=?",new String[]{username,password});
        if (result == 0)
            return -1;
        return 1;
    }
}
