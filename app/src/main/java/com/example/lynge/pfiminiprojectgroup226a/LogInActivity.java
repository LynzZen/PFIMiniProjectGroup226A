package com.example.lynge.pfiminiprojectgroup226a;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);


    }

    public void LogIn(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


