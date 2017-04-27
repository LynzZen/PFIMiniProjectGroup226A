package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AddDrinkActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    static String DrinkSize,DrinkType,DrinkComment;
    EditText drinkComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen4);
        drinkComment = (EditText) findViewById(R.id.CommentDrinks);
        //Call the two methods for type spinner
        SpinnerDrinkType();
        SpinnerDrinkSize();
    }

    public void skip(View view) {
        DrinkComment = drinkComment.getText().toString();
        if(drinkComment.length()>0){
            OrderHandleActivity.Drink += (DrinkType+" "+DrinkSize+"\n// "+DrinkComment+"\n\n");
        }
        else{
            OrderHandleActivity.Drink += (DrinkType+" "+DrinkSize+"\n\n");
        }
        Intent intent = new Intent(this, AddFoodActivity.class);
        startActivity(intent);
    }

    //Adds items to the type spinner from values/string
    public void SpinnerDrinkType() {
        Spinner spinnerDrinkType = (Spinner) findViewById(R.id.DrinkTypeSpinner);
        spinnerDrinkType.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.drink_type_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDrinkType.setAdapter(adapter);

    }

    //Adds items to the size spinner from values/string
    public void SpinnerDrinkSize() {
        Spinner spinnerDrinkSize = (Spinner) findViewById(R.id.DrinkSizeSpinner);
        spinnerDrinkSize.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.drink_size_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDrinkSize.setAdapter(adapter);



    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String Tjek = parent.getItemAtPosition(position).toString();
        Spinner spinner = (Spinner) parent;

        if(spinner.getId() == R.id.DrinkTypeSpinner)
        {
            if(!Tjek.equals("Type")) {
                DrinkType = parent.getItemAtPosition(position).toString();
            }
            else{
                DrinkType="--";
                DrinkSize="";
            }

        }
        else if(spinner.getId() == R.id.DrinkSizeSpinner)
        {
            if(!Tjek.equals("Size")) {
                DrinkSize = parent.getItemAtPosition(position).toString();
            }
            else{
                DrinkType="--";
                DrinkSize="";
            }

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}









