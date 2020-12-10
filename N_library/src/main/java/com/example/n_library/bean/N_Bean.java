package com.example.n_library.bean;

public class N_Bean {

    //用户ID
    private String userId;
    //头像
    private int mUserPhoto;
    //文字
    private String chatText;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserPhoto() {
        return mUserPhoto;
    }

    public void setUserPhoto(int mUserPhoto) {
        this.mUserPhoto = mUserPhoto;
    }

    public String getChatText() {
        return chatText;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText;
    }

}
