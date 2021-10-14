package com.example.myweixin.entity;

public class Weixin {
     int photo;
     String name;
     String message;
     String time;

    public Weixin() {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Weixin(int photo, String name, String message, String time) {
        this.photo = photo;
        this.name = name;
        this.message = message;
        this.time = time;
    }
}
