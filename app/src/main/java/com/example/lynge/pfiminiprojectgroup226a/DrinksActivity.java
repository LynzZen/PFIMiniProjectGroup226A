package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DrinksActivity extends AppCompatActivity {
    public static String Drinks = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

    }

    public void Cola (View view){
        Drinks = "Cola";
        OpenFood();
    }

    public void ColaZero (View view){
        Drinks = "Cola Zero";
        OpenFood();
    }

    public void Fanta (View view){
        Drinks = "Fanta";
        OpenFood();
    }

    public void Lemon (View view){
        Drinks = "Lemon";
        OpenFood();
    }

    public void Sprite (View view){
       Drinks = "Sprite";
        OpenFood();
    }

    public String GetDrinks(){
        return Drinks;
    }


    void OpenFood(){
        Intent intent = new Intent(this, FoodActivity.class);
        startActivity(intent);
    }
}
