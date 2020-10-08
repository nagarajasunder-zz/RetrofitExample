package com.geekydroid.retrofitexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

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