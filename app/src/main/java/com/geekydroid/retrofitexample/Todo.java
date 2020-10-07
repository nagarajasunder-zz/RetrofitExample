package com.geekydroid.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Todo {

    @SerializedName("userId")
    private String userid;

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("completed")
    private boolean completed;

    public Todo(String userid, String id, String title, boolean completed) {
        this.userid = userid;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "userid='" + userid + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
