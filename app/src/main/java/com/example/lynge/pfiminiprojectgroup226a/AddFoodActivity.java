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

public class AddFoodActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    static String FoodMain,FoodSide,FoodComment;
    EditText commentFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen5);
        SpinnerFoodType();
        SpinnerFoodSize();
        commentFood = (EditText) findViewById(R.id.CommentFood);
    }
    public void skip(View view){
        OrderHandleActivity.Food += "";
        Intent intent = new Intent(this, OrderHandleActivity.class);
        startActivity(intent);
    }
    public void add(View view){
        FoodComment = commentFood.getText().toString();
        if(commentFood.length()>0) {
            OrderHandleActivity.Food += FoodMain + "\n " + FoodSide+"\n// "+ FoodComment+"\n\n";
        }
        else{
            OrderHandleActivity.Food += FoodMain + "\n " + FoodSide+"\n\n";
        }
        Intent intent = new Intent(this, OrderHandleActivity.class);
        startActivity(intent);
    }
    //Adds items to the type spinner from values/string
    public void SpinnerFoodType(){
        Spinner spinnerFoodType = (Spinner) findViewById(R.id.FoodTypeSpinner);
        spinnerFoodType.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.food_type_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFoodType.setAdapter(adapter);
    }
    //Adds items to the size spinner from values/string
    public void SpinnerFoodSize(){
        Spinner spinnerFoodSize = (Spinner) findViewById(R.id.FoodSizeSpinner);
        spinnerFoodSize.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.food_size_array,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFoodSize.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String Check = parent.getItemAtPosition(position).toString();
        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.FoodTypeSpinner)
        {
            if(!Check.equals("Main Order")){
                FoodMain = parent.getItemAtPosition(position).toString();
            }
            else{
                FoodMain = "--";
                FoodSide = "";
            }

        }
        else if(spinner.getId() == R.id.FoodSizeSpinner)
        {
            if(!Check.equals("Side Order")) {
                FoodSide = "+ "+parent.getItemAtPosition(position).toString();
            }
            else{
                FoodMain = "--";
                FoodSide = "";
            }
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
