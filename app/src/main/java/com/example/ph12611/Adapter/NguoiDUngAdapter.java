package com.example.ph12611.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ph12611.Dao.NguoiDungDAO;
import com.example.ph12611.Model.NguoiDung;
import com.example.ph12611.R;

import java.util.List;

public class NguoiDUngAdapter extends BaseAdapter {
    public Activity context;
    public List<NguoiDung> arrNguoiDung;
    public LayoutInflater inflater;
    public NguoiDUngAdapter(Activity context, List<NguoiDung> arrNguoidungs)
    {
        super();
        this.context=context;
        this.arrNguoiDung=arrNguoidungs;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return arrNguoiDung.size();
    }

    @Override
    public Object getItem(int position) {
        return arrNguoiDung.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            holder=new ViewHolder();
            convertView = inflater.inflate(R.layout.activity_nguoi_dung_screen,null);
            holder.img=(ImageView)convertView.findViewById(R.id.ivIcon);
            holder.txtName=(TextView)convertView.findViewById(R.id.tvName);
            holder.txtPhone=(TextView)convertView.findViewById(R.id.tvPhone);
            holder.imgDelete=(ImageView)convertView.findViewById(R.id.ivDelete);

            holder.imgDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            convertView.setTag(holder);
        }else {
            holder=(ViewHolder)convertView.getTag();
        }
        NguoiDung nguoidung=arrNguoiDung.get(position);
        holder.txtName.setText(nguoidung.getUsername());
        holder.txtPhone.setText(nguoidung.getPhone());
        return convertView;
    }
    public static class ViewHolder{
        public ImageView img;
        public TextView txtName;
        public TextView txtPhone;
        public ImageView imgDelete;
    }
}

