package com.geekydroid.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Todo {

    @SerializedName("userId")
    private int userid;

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("completed")
    private boolean completed;

    public Todo(int userid, int id, String title, boolean completed) {
        this.userid = userid;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Todo(int userid, String title, boolean completed) {
        this.userid = userid;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "\nTodo{" +
                "userid='" + userid + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }


}
