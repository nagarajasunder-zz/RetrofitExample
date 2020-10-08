package com.geekydroid.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Album {

    @SerializedName("albumId")
    private int album_id;
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;
    @SerializedName("thumbnailUrl")
    private String thumbnailurl;

    public Album(int album_id, Integer id, String title, String url, String thumbnailurl) {
        this.album_id = album_id;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailurl = thumbnailurl;
    }

    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    @Override
    public String toString() {
        return "Album{" +
                "album_id=" + album_id +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", thumbnailurl='" + thumbnailurl + '\'' +
                '}';
    }
}
