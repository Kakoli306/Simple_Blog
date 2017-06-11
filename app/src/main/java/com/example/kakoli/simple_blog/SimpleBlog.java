package com.example.kakoli.simple_blog;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by kakoli on 6/11/17.
 */

public class SimpleBlog extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);



    }
}
