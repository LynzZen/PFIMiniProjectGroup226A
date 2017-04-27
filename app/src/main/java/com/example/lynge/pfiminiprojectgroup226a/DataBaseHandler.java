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

    public static final String DRINK_TYPE = "drink_type";
    public static final String FOOD_TYPE = "food_type";
    public static final String TABLE_NUMBER = "Table_number";
    //Set name of the table
    public static final String TABLE_NAME = "Order_Info";


    //Creating a Query
    private static final String CREATE_QUERY =
            "CREATE TABLE "+TABLE_NAME+" ("+ TABLE_NUMBER+" TEXT," +
                    DRINK_TYPE+" TEXT, " +
                    FOOD_TYPE+" TEXT);";


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
        contentValues.put(TABLE_NUMBER, table);
        contentValues.put(DRINK_TYPE, drink);
        contentValues.put(FOOD_TYPE, food);
        db.insert(TABLE_NAME, "Nothing", contentValues);


        //Writes to the log
        Log.e("DATABASE OPERATIONS","One row inserted...");
    }
    //Gets the information from our database
    public Cursor getInformation(SQLiteDatabase db){
        Cursor cursor;
        String[] projections = {DRINK_TYPE, FOOD_TYPE, TABLE_NUMBER};
        cursor = db.query(TABLE_NAME, projections,null,null,null,null,null);
        return cursor;
    }

    public Integer RemoveInformation(String TableNumber){
return 1;
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
