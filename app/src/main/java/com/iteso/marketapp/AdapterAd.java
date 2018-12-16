package com.iteso.marketapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iteso.marketapp.beans.ItemAd;

import java.util.ArrayList;

public class AdapterAd extends RecyclerView.Adapter<AdapterAd.ViewHolder>{

    private ArrayList<ItemAd> ads;
    private Context context;

    AdapterAd(Context context, ArrayList<ItemAd> ads){
        this.ads = ads;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterAd.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = (CardView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.ad_layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAd.ViewHolder viewHolder, int i) {
        final ItemAd itemAd = ads.get(i);

        viewHolder.id = itemAd.getId();
        viewHolder.title.setText(itemAd.getAdName());
        viewHolder.image.setImageBitmap(itemAd.getAdImage());
    }

    @Override
    public int getItemCount() {
        return ads.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        //to add
        int id;
        TextView title;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.ad_title);
            image = itemView.findViewById(R.id.ad_image);
        }
    }
}
