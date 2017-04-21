package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DrinksAndFoodActivity extends AppCompatActivity {
    EditText Drink, Food, Table;
    TextView TextPerson;
    int i = 1;
    String drink,food,table;
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
        TextPerson = (TextView) findViewById(R.id.TextPerson);
        TextPerson.setText("Person "+i);

    }

    public void addOrder(View view){

        if(drink != null && food !=null && table !=null) {
            drink += "\n"+(Drink.getText().toString());
            food += "\n"+(Food.getText().toString());
            table = Table.getText().toString();
        }
        else{
            drink = (Drink.getText().toString());
            food = (Food.getText().toString());
            table = Table.getText().toString();
        }
        Drink.setText("");
        Food.setText("");
        i++;
        TextPerson.setText("Person "+i);

    }

    public void finishOrder(View view){
        mDataBaseHandler = new DataBaseHandler(context);
        mSQLiteDatabase = mDataBaseHandler.getReadableDatabase();
        mDataBaseHandler.addInformations(table,drink,food,mSQLiteDatabase);
        Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_LONG).show();
        mDataBaseHandler.close();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
