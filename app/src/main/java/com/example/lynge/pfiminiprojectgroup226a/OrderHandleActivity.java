package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Lynge on 26/04/2017.
 */

public class OrderHandleActivity extends AppCompatActivity {
    static String Drink,Food,TableNumber = "";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_handle);

    }

    public void FinishOrder(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void NextPerson(View view){
        Intent intent = new Intent(this, AddDrinkActivity.class);
        startActivity(intent);

    }
}
