package com.example.bybus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user_password_reset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_password_reset);
    }

    public  void gotoLogin(View v){

        Intent intent1 = new Intent(user_password_reset.this, user_login.class);
        startActivity(intent1);
    }
}
