package com.iteso.marketapp.beans;

import android.graphics.Bitmap;

public class ItemCategory {

    private int index;
    private String CategoryName;
    private Bitmap CategoryImage;

    public ItemCategory(int index, String categoryName, Bitmap categoryImage) {
        index = index;
        CategoryName = categoryName;
        CategoryImage = categoryImage;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public Bitmap getCategoryImage() {
        return CategoryImage;
    }

    public void setCategoryImage(Bitmap categoryImage) {
        CategoryImage = categoryImage;
    }
}
