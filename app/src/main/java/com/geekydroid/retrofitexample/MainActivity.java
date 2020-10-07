package com.geekydroid.retrofitexample;

import android.os.Bundle;
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
        Call<List<Todo>> call = apiInterface.get_todos();

        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {
                if (response.isSuccessful()) {
                    List<Todo> todoList = response.body();
                    for (Todo todo : todoList) {
                        String content = todo.getId() + "\n" + todo.getUserid() + "\n" + todo.getTitle() + "\n" + todo.isCompleted() + "\n\n";
                        textView.append(content);
                    }
                }
                else
                {
                    textView.setText(response.code());
                }
            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {
                textView.setText(t.getMessage());

            }
        });


    }
}