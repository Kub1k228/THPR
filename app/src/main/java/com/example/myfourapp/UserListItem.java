package com.example.myfourapp;

public class UserListItem {
    private final int imageRes;
    private final String textUserName;

    public UserListItem(int imageRes, String textUserName) {
        this.imageRes = imageRes;
        this.textUserName = textUserName;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getTextUserName() {
        return textUserName;
    }
}