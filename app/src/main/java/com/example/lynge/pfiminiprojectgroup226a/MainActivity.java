package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //If the Add button is clicked:
    public void AddOrder(View view){
        Intent intent = new Intent(this, DrinksAndFoodActivity.class);
        startActivity(intent);
    }
    //If the  button is clicked:
    public void ShowOrders(View view){
        Intent intent = new Intent(this, DataListActivity.class);
        startActivity(intent);

    }







}
