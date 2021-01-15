package com.example.ph12611.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.ph12611.Model.NguoiDung;
import com.example.ph12611.Model.Sach;
import com.example.ph12611.Model.TheLoai;
import com.example.ph12611.R;

import java.util.ArrayList;
import java.util.List;

public class TheLoaiAdapter extends BaseAdapter{
    public Activity context;
    public List<TheLoai> arrTheLoai;
    public LayoutInflater inflater;

    public TheLoaiAdapter(Activity context, List<TheLoai> arrTheLoai)
    {
        super();
        this.context=context;
        this.arrTheLoai=arrTheLoai;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrTheLoai.size();
    }

    @Override
    public Object getItem(int position) {
        return arrTheLoai.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       TheLoaiAdapter.ViewHolder holder;
        if (convertView == null){
            holder=new TheLoaiAdapter.ViewHolder();
            convertView = inflater.inflate(R.layout.theloai,null);
            holder.img=(ImageView)convertView.findViewById(R.id.ivIcon1);
            holder.txtName=(TextView)convertView.findViewById(R.id.tvMaTheLoai);
            holder.txtPhone=(TextView)convertView.findViewById(R.id.tvTenTheLoai);
            holder.imgDelete=(ImageView)convertView.findViewById(R.id.ivDelete1);

            holder.imgDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            convertView.setTag(holder);
        }else {
            holder=(TheLoaiAdapter.ViewHolder)convertView.getTag();
        }
       TheLoai theLoai =arrTheLoai.get(position);
        holder.txtName.setText(theLoai.getMaTL());
        holder.txtPhone.setText(theLoai.getTenTL());
        return convertView;
    }
    public static class ViewHolder{
        public ImageView img;
        public TextView txtName;
        public TextView txtPhone;
        public ImageView imgDelete;
    }
}
