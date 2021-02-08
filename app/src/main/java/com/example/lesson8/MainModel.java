package com.example.lesson8;

public class MainModel {

    private String title;
    private String subTitle;
    private int avatarView;

    public MainModel(String title, String subTitle, int avatarView) {
        this.title = title;
        this.subTitle = subTitle;
        this.avatarView = avatarView;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public int getAvatarView() {
        return avatarView;
    }
}
