package com.example.adaptiveview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

public class Newsfeed extends AppCompatActivity {
ImageView img1,img2,img3,img4;
RecyclerView rView;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);
        img1 = findViewById(R.drawable.news1);
        img2 = findViewById(R.drawable.news2);
        img3 = findViewById(R.drawable.news3);
        img4 = findViewById(R.drawable.news4);
        rView = findViewById(R.id.rView);
        A


    }
}