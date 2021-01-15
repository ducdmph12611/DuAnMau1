package com.example.ph12611.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.ph12611.Dao.NguoiDungDAO;
import com.example.ph12611.Dao.TheLoaiDAO;

public class DatabaseHepler extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "dbBookManager";
    public static final int VERSION = 1;

    public DatabaseHepler( Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(NguoiDungDAO.SQL_NGUOIDUNG);
      db.execSQL(TheLoaiDAO.SQL_THE_LOAI);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL(NguoiDungDAO.TABLE_NAME);
        db.execSQL("Drop table if exists " + NguoiDungDAO.TABLE_NAME);
        db.execSQL("Drop table if exists " + TheLoaiDAO.TABLE_NAME);

        onCreate(db);
    }
}
