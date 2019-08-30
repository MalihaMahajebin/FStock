package com.example.fstock;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences=this.getSharedPreferences("My Pref",MODE_PRIVATE);
        boolean loggedin=preferences.getBoolean("IS_LOGGED_IN",false);
        if(loggedin==false){
            i=new Intent(MainActivity.this,Login.class);
            startActivity(i);
            finish();
        }else{
            i=new Intent(MainActivity.this,Feature.class);
            startActivity(i);
            finish();
        }
    }
}
