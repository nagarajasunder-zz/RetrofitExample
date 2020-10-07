package com.geekydroid.retrofitexample;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView textView;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

    }

    public void get_all_todos(View v) {
        Call<List<Todo>> call = apiInterface.get_todos();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                if (response.isSuccessful()) {
                    List<Todo> list = response.body();
                    Log.d(TAG, "onResponse: " + list.toString());
                }
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {

            }
        });
    }

    public void get_todo_by_id(View v) {
        Call<Todo> call = apiInterface.get_todo_by_id(1);
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

    public void get_completed_todo(View v) {
        Call<List<Todo>> call = apiInterface.get_completed_todo(1, true);
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, "onResponse: " + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {

            }
        });
    }

    public void post_todo(View v) {
        Todo todo = new Todo(3,"learning retrofit", false);
        Call<Todo> todoCall = apiInterface.post_todo(todo);
        todoCall.enqueue(new Callback<Todo>() {
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
}