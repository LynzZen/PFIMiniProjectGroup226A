package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void AddOrder(View view){

        Intent intent = new Intent(this, DrinksActivity.class);
        startActivity(intent);

    }

    public void ShowOrder(View view){
        TextView ShowOrderTextDrink = (TextView) findViewById(R.id.ShowOrderTextView);
        TextView ShowOrderTextFood = (TextView) findViewById(R.id.ShowOrderTextView2);
        String DrinkShow = DrinksActivity.Drinks;
        String FoodShow = FoodActivity.Food;

        if (DrinkShow != "" && FoodShow != "" ){
        ShowOrderTextDrink.setText("Drink: " + DrinkShow);
            ShowOrderTextFood.setText("Food: " + FoodShow);

        }

       else{
            ShowOrderTextDrink.setText("No order to show");
        }

    }
}
