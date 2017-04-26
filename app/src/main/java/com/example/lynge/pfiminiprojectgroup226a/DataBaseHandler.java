package com.example.lynge.pfiminiprojectgroup226a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



//This class controls the database by the SQLiteOpenHelper
public class DataBaseHandler extends SQLiteOpenHelper {
    //Database version and name
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME ="Orders.db";

    //Creating a Query
    private static final String CREATE_QUERY =
            "CREATE TABLE "+Order.NewOrderInfo.TABLE_NAME+" ("+ Order.NewOrderInfo.TABLE_NUMBER+" TEXT," +
                    Order.NewOrderInfo.DRINK_TYPE+" TEXT, " +
                    Order.NewOrderInfo.FOOD_TYPE+" TEXT);";


    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //Writes to the log
        Log.e("DATABASE OPERATIONS","Datebase created /opened");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_QUERY);
        //Writes to the log
        Log.e("DATABASE OPERATIONS","Table created...");

    }
    //Adds the information into our database in one row
    public void addInformations(String table, String drink, String food, SQLiteDatabase db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(Order.NewOrderInfo.TABLE_NUMBER, table);
        contentValues.put(Order.NewOrderInfo.DRINK_TYPE, drink);
        contentValues.put(Order.NewOrderInfo.FOOD_TYPE, food);
        db.insert(Order.NewOrderInfo.TABLE_NAME, "Nothing", contentValues);


        //Writes to the log
        Log.e("DATABASE OPERATIONS","One row inserted...");
    }
    //Gets the information from our database
    public Cursor getInformation(SQLiteDatabase db){
        Cursor cursor;
        String[] projections = {Order.NewOrderInfo.DRINK_TYPE, Order.NewOrderInfo.FOOD_TYPE, Order.NewOrderInfo.TABLE_NUMBER};
        cursor = db.query(Order.NewOrderInfo.TABLE_NAME, projections,null,null,null,null,null);
        return cursor;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
