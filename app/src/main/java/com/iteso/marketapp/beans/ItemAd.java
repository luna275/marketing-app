package com.iteso.marketapp.beans;

import android.graphics.Bitmap;

import java.util.Locale;

public class ItemAd {

    private int id;
    private boolean isFavorite;
    private String AdName;
    private Bitmap AdImage;
    private int categoryId;
    //private Location loc;
    //private Rating rate;
    //private ...

    public ItemAd(int id, String AdName, Bitmap AdImage){
        this.id = id;
        this.AdName = AdName;
        this.AdImage = AdImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getAdName() {
        return AdName;
    }

    public void setAdName(String adName) {
        AdName = adName;
    }

    public Bitmap getAdImage() {
        return AdImage;
    }

    public void setAdImage(Bitmap adImage) {
        AdImage = adImage;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
