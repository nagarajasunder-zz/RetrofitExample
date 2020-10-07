package com.geekydroid.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/todos")
    Call<List<Todo>> get_todos();

    @GET("/todos/{id}")
    Call<Todo> get_todo_by_id(@Path("id") int id);

    @GET("/todos")
    Call<List<Todo>> get_completed_todo(@Query("userId") int userid, @Query("completed") boolean completed);

    @POST("/todos")
    Call<Todo> post_todo(@Body Todo todo);
}
