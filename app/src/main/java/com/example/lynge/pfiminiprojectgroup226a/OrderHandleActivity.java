package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Lynge on 26/04/2017.
 */

public class OrderHandleActivity extends AppCompatActivity {
    Context context = this;
    DataBaseHandler mDataBaseHandler;
    SQLiteDatabase mSQLiteDatabase;
    static String Drink,Food,TableNumber = "";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_handle);

    }

    public void FinishOrder(View view){
        mDataBaseHandler = new DataBaseHandler(context);
        mSQLiteDatabase = mDataBaseHandler.getReadableDatabase();
        mDataBaseHandler.addInformations(TableNumber,Drink,Food,mSQLiteDatabase);
        Toast.makeText(getBaseContext(), "Data Saved", Toast.LENGTH_LONG).show();
        mDataBaseHandler.close();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    public void NextPerson(View view){
        Intent intent = new Intent(this, AddDrinkActivity.class);
        startActivity(intent);

    }
}
