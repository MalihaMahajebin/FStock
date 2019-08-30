package com.example.fstock;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
   Intent i;
    SharedPreferences preferences;
    EditText name,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name=findViewById(R.id.name);
        pass=findViewById(R.id.pass);
    }

    public void login(View view) {
        String n=name.getText().toString();
        String p=pass.getText().toString();
        if(TextUtils.isEmpty(n)|| TextUtils.isEmpty(p)){
            Toast.makeText(Login.this,"Name or password is incorrect",Toast.LENGTH_SHORT).show();
        }else {
            preferences = Login.this.getSharedPreferences("My Pref", MODE_PRIVATE);
            preferences.edit().putBoolean("IS_LOGGED_IN", true).apply();
            i = new Intent(Login.this, Feature.class);
            startActivity(i);
            finish();
        }

    }
}
