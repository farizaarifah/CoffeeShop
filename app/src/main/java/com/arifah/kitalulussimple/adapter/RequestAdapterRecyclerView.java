package com.arifah.kitalulussimple.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arifah.kitalulussimple.R;
import com.arifah.kitalulussimple.model.Menu;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class RequestAdapterRecyclerView extends RecyclerView.Adapter<RequestAdapterRecyclerView.MenuViewHolder>{

    private ArrayList<Menu> dataList;

    public RequestAdapterRecyclerView(ArrayList<Menu> dataList) {
        this.dataList = dataList;
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_nama_menu, tv_harga_menu;
        public ImageView gambar_menu;

        public MenuViewHolder(View itemView) {
            super(itemView);
            tv_nama_menu = (TextView) itemView.findViewById(R.id.tv_namamenu_item);
            tv_harga_menu = (TextView) itemView.findViewById(R.id.tv_harga_item);
            gambar_menu = (ImageView) itemView.findViewById(R.id.gambar_menu);
        }
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_request_menu, parent, false);

        return new MenuViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder viewHolder, int position) {
        MenuViewHolder holder = (MenuViewHolder) viewHolder;

        holder.tv_nama_menu.setText(dataList.get(position).getNama_menu());
        holder.tv_harga_menu.setText(dataList.get(position).getHarga_menu());

        Picasso.get()
                .load(""+dataList.get(position).getFoto_menu())
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.gambar_menu);
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
}
