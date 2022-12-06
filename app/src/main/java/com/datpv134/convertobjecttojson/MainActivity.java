package com.datpv134.convertobjecttojson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvJson = findViewById(R.id.tvJson);

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Hello"));
        users.add(new User(2, "World"));

        Notification notification = new Notification(1, true, users, "done");

        Gson gson = new Gson();
        String json = gson.toJson(notification);
        Log.e("json: ", json);

        tvJson.setText(json);
    }
}