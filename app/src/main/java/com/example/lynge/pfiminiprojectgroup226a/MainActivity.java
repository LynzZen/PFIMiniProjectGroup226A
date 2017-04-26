package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText TableNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen6);
        TableNumber = (EditText) findViewById(R.id.TableNumberEditText);


    }
    //If the Add button is clicked:
    public void AddOrder(View view){
        //Puts the text from the textfield for table number into a String
        String TableNUmber = TableNumber.getText().toString();

        //Resets all the Static variables inside of OrderHandleActivity
        OrderHandleActivity.Drink="";
        OrderHandleActivity.Food ="";
        //Checks if the textfield is empty

        if(TableNUmber.length()>0) {
            OrderHandleActivity.TableNumber = TableNUmber;
            Intent intent = new Intent(this, AddDrinkActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this ,"You need to type in table number!",Toast.LENGTH_SHORT).show();
        }
    }
    //If the  button is clicked:
    public void ShowOrders(View view){
        Intent intent = new Intent(this, DataListActivity.class);
        startActivity(intent);

    }

    public void LogOut(View view){
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
    }







}
