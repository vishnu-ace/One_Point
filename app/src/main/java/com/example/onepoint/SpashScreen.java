package com.example.onepoint;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SpashScreen extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );

        startActivity( new Intent( this,MainActivity.class ) );
        finish();


    }
}
