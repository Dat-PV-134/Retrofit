package com.datpv134.convertobjecttojson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.datpv134.convertobjecttojson.model.Notification;
import com.datpv134.convertobjecttojson.model.User;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Dat"));
        users.add(new User(2, "dep trai"));

        Notification notification = new Notification(1, false, "Hello World", users);

        Gson gson = new Gson();
        String strJson = gson.toJson(notification);
        Log.e("Json: ", strJson);

        TextView tvJson = findViewById(R.id.tvJson);
        tvJson.setText(strJson);
    }
}