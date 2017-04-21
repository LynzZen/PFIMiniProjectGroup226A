package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DrinksActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

    }

    public void Cola (View view){
        MainActivity.orderTable1.SetDrink("Cola");
        OpenFood();
    }

    public void ColaZero (View view){
        MainActivity.orderTable1.SetDrink("Cola Zero");
        OpenFood();
    }

    public void Fanta (View view){
        MainActivity.orderTable1.SetDrink("Fanta");
        OpenFood();
    }

    public void Lemon (View view){
        MainActivity.orderTable1.SetDrink("Lemon");
        OpenFood();
    }

    public void Sprite (View view){
        MainActivity.orderTable1.SetDrink("Sprite");
        OpenFood();
    }




    void OpenFood(){
        Intent intent = new Intent(this, FoodActivity.class);
        startActivity(intent);
    }
}
