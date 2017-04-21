package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DrinksAndFoodActivity extends AppCompatActivity {
    EditText Drink, Food, Table;
    Context context = this;
    DataBaseHandler mDataBaseHandler;
    SQLiteDatabase mSQLiteDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinksandfood);
        Drink = (EditText) findViewById(R.id.DrinkTextEdit);
        Food = (EditText) findViewById(R.id.FoodTextEdit);
        Table = (EditText) findViewById(R.id.TableNumberTextEdit);


    }

    public void addOrder(View view){
        String drink = Drink.getText().toString();
        String food = Food.getText().toString();
        String table = Table.getText().toString();
        mDataBaseHandler = new DataBaseHandler(context);
        mSQLiteDatabase = mDataBaseHandler.getReadableDatabase();
        mDataBaseHandler.addInformations(table,drink,food,mSQLiteDatabase);
        Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_LONG).show();
        mDataBaseHandler.close();
    }


}
