package com.iteso.marketapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iteso.marketapp.beans.ItemCategory;

import java.util.ArrayList;

public class AdapterCategory extends RecyclerView.Adapter<AdapterCategory.ViewHolder>{

    private ArrayList<ItemCategory> categories;
    private Context context;

    AdapterCategory(Context context, ArrayList<ItemCategory> categories){
        this.categories = categories;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterCategory.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = (CardView) LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.category_layout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCategory.ViewHolder viewHolder, int i) {
        final ItemCategory itemCategory = categories.get(i);

        viewHolder.id = itemCategory.getIndex();
        viewHolder.title.setText(itemCategory.getCategoryName());
        viewHolder.image.setImageBitmap(itemCategory.getCategoryImage());
        viewHolder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ActivityAdd.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        //to add
        int id;
        TextView title;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.category_title);
            image = itemView.findViewById(R.id.category_image);
        }
    }
}
