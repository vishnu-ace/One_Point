package com.example.onepoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_map );

        PhotoView colMapPhotoView = (PhotoView)findViewById( R.id.col_map_photoview );
        colMapPhotoView.setImageResource( R.drawable.coll_map );
    }
}
