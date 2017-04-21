package com.example.lynge.pfiminiprojectgroup226a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.lynge.pfiminiprojectgroup226a.MainActivity.orderTable1;

/**
 * Created by Lynge on 21-04-2017.
 */

public class DataBaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME ="Orders.db";
    public static final String TABLE_ORDERS = "Orders";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_ORDERNAME = "Ordername";

    public DataBaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE" + TABLE_ORDERS + "(" +
                COLUMN_ID + " INTERGER PRIMARY KEY AUTOINCREMENT " +
                COLUMN_ORDERNAME + " TEXT " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP_TABLE_IF_EXISTS" + TABLE_ORDERS);
        onCreate(db);
    }

    //Add a new row to the database
    public void AddRow(Order order){
        ContentValues values = new ContentValues();
        values.put(COLUMN_ORDERNAME, orderTable1.GetFood());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_ORDERS, null, values);
        db.close();
    }

    //Delete a order from the database
    public void deleteProduct(String orderName ){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM" + TABLE_ORDERS + "WHERE" + COLUMN_ORDERNAME + "=\"" + orderName + "\";");
    }

    //Print out the database as a String
    public String databaseToString(){
        String dbString ="";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_ORDERS + "WHERE 1";

        //Cursor point to a location in your results
        Cursor c = db.rawQuery(query, null);
        c.moveToFirst();
                while(!c.isAfterLast()){
                    if(c.getString((c.getColumnIndex("Ordername")))!=null){
                        dbString += c.getString(c.getColumnIndex("Ordername"));
                        dbString += "\n";

                    }
                }
                db.close();
        return dbString;
    }
}
