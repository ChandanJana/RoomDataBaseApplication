package com.example.janac.roomdatabaseapplication;


import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    public static AppDataBase appDataBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appDataBase = Room.databaseBuilder(this, AppDataBase.class, "userDb").allowMainThreadQueries().build();
        fragmentManager = getSupportFragmentManager();
        if (findViewById(R.id.container) != null){
            if (savedInstanceState != null)
                return;
            fragmentManager.beginTransaction().add(R.id.container, new HomeFragment()).commit();
        }

    }
}
