package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddDrinkActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen4);


        SpinnerDrinkType();
        SpinnerDrinkSize();
    }

    public void skip(View view){
        Intent intent = new Intent(this, AddFoodActivity.class);
        startActivity(intent);
    }
   //Adds items to the type spinner from values/string
    public void SpinnerDrinkType(){
        Spinner spinnerDrinkType = (Spinner) findViewById(R.id.DrinkTypeSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.drink_type_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDrinkType.setAdapter(adapter);
    }
    //Adds items to the size spinner from values/string
    public void SpinnerDrinkSize(){
        Spinner spinnerDrinkType = (Spinner) findViewById(R.id.DrinkSizeSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.drink_size_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDrinkType.setAdapter(adapter);
    }




}
