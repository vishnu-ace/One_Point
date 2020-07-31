package com.example.onepoint;

import android.app.Application;

import com.firebase.client.Firebase;

public class OnePoint extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
