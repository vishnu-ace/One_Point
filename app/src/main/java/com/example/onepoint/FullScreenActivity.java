package com.example.onepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;

public class FullScreenActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        PhotoView imageView = (PhotoView) findViewById(R.id.Image_View);
        getSupportActionBar().hide();
        getSupportActionBar().setTitle("Full Image");

        int img_id = getIntent().getExtras().getInt("image_id");
        imageView.setImageResource(  img_id);

    }
}