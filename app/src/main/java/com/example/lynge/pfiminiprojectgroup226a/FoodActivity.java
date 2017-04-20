package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodActivity extends AppCompatActivity {
    public static String Food = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }

    public void Pasta(View view){
        Food = "Pasta";
        ReturnHome();
        }

    public void Burger(View view){
        Food = "Burger";
        ReturnHome();
    }

    public void ReturnHome (){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
