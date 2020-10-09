package com.geekydroid.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("photos")
    Call<List<Album>> get_albums();

    //Using path
    @GET("photos/{id}")
    Call<Album> get_album_by_id(@Path("id") int id);

    //Querying API
    @GET("photos")
    Call<List<Album>> get_albums_by_id(@Query("albumId") int id);

    @PUT("todos/{id}")
    Call<Todo> put_todos(@Path("id") int id, @Body Todo todo);

    @PATCH("todos/{id}")
    Call<Todo> patch_todo(@Path("id") int id, @Body Todo todo);

    @DELETE("todos/{id}")
    Call<Void> delete_todo(@Path("id") int id);
}
