package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DataBaseHandler mDBHandler;
    public static Order orderTable1 = new Order();
    public Order orderTable2 = new Order();
    public Order orderTable3 = new Order();
    public Order orderTable4 = new Order();
    public Order orderTable5 = new Order();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDBHandler = new DataBaseHandler(this, null, null,1);

    }

    public void AddOrder(View view){

        Intent intent = new Intent(this, DrinksActivity.class);
        startActivity(intent);

    }

    public void ShowOrder(View view){
        TextView ShowOrderTextDrink = (TextView) findViewById(R.id.ShowOrderTextView);
        TextView TextString = (TextView) findViewById(R.id.ShowOrderTextView2);

        String DrinkShow = orderTable1.GetDrink();
        String FoodShow = orderTable1.GetFood();




    String ShowOrder = "Drink: "+ DrinkShow + "\nFood: " + FoodShow;
        if (DrinkShow != "" && FoodShow != "" ){
        ShowOrderTextDrink.setText(ShowOrder);

        }

       else{
            ShowOrderTextDrink.setText("No order to show");
        }
    }
    public void ClearOrder(View view){
        orderTable1.SetFood("");
        orderTable1.SetDrink("");
        ShowOrder(null);
    }
}
