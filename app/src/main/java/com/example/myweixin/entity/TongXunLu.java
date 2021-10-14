package com.example.myweixin.entity;

public class TongXunLu {

    private int photo;
    private String name;

    public TongXunLu() {
    }

    public TongXunLu(int photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
