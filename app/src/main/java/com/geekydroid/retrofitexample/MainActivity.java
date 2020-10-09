package com.geekydroid.retrofitexample;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RecyclerView recycler_view;
    private Adapter adapter;
    private List<Album> list;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();

        //get_all_albums
//        fetch_data();

        //get_album_by_id_using_path
//        fetch_data();

        //get_albums_by_id
//        fetch_data();

        //puttodo using put method in http
//        puttodos();

        //patchtodo using patch method in http
//        patch_todo();

        //deletetodo using delete method in http
        delete_todo();
    }

    private void delete_todo() {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Void> call = apiInterface.delete_todo(1);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "onResponse: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }

    private void patch_todo() {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Todo todo = new Todo(1, null, null, true);
        Call<Todo> call = apiInterface.patch_todo(1, todo);
        call.enqueue(new Callback<Todo>() {
            @Override
            public void onResponse(Call<Todo> call, Response<Todo> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "onResponse: " + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Todo> call, Throwable t) {

            }
        });

    }

    private void puttodos() {
        Todo todo = new Todo(null, null, null, true);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Todo> call = apiInterface.put_todos(1, todo);
        call.enqueue(new Callback<Todo>() {
            @Override
            public void onResponse(Call<Todo> call, Response<Todo> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "onResponse: " + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<Todo> call, Throwable t) {

            }
        });
    }

    //get_albums_by_id
//    private void fetch_data() {
//        apiInterface = ApiClient.getClient().create(ApiInterface.class);
//        Call<List<Album>> call = apiInterface.get_albums_by_id(1);
//        call.enqueue(new Callback<List<Album>>() {
//            @Override
//            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
//                if (response.isSuccessful()) {
//                    list = response.body();
//                    adapter = new Adapter(list);
//                    recycler_view.setAdapter(adapter);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Album>> call, Throwable t) {
//
//            }
//        });
//    }

    //get_album_by_id_using_path
//    private void fetch_data() {
//        apiInterface = ApiClient.getClient().create(ApiInterface.class);
//        Call<Album> call = apiInterface.get_album_by_id(1);
//        call.enqueue(new Callback<Album>() {
//            @Override
//            public void onResponse(Call<Album> call, Response<Album> response) {
//                if (response.isSuccessful()) {
//                    Log.d(TAG, "onResponse: called");
//                    list.add(response.body());
//                    adapter = new Adapter(list);
//                    recycler_view.setAdapter(adapter);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Album> call, Throwable t) {
//
//            }
//        });
//    }


    //get_all_albums
//    private void fetch_data() {
//        apiInterface = ApiClient.getClient().create(ApiInterface.class);
//        Call<List<Album>> call = apiInterface.get_albums();
//        call.enqueue(new Callback<List<Album>>() {
//            @Override
//            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
//                if (response.isSuccessful()) {
//                    list = response.body();
//                    adapter = new Adapter(list);
//                    recycler_view.setAdapter(adapter);
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Album>> call, Throwable t) {
//
//            }
//        });
//    }

    private void setUI() {
        recycler_view = findViewById(R.id.recycler_view);
        recycler_view.setHasFixedSize(true);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
    }


}