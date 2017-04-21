package com.example.lynge.pfiminiprojectgroup226a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class DataListActivity extends AppCompatActivity {
    ListView mListView;
    SQLiteDatabase mSQLiteDatabase;
    DataBaseHandler mDataBaseHandler;
    Cursor cursor;
    ListDataAdapter mListDataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_list_layout);
        mListView = (ListView) findViewById(R.id.listView);
        mListDataAdapter = new ListDataAdapter(getApplicationContext(),R.layout.row_layout);
        mListView.setAdapter(mListDataAdapter);
        mDataBaseHandler = new DataBaseHandler(getApplicationContext());
        mSQLiteDatabase = mDataBaseHandler.getReadableDatabase();
        cursor = mDataBaseHandler.getInformation(mSQLiteDatabase);
        if(cursor.moveToFirst()){

            do{
                String tableNumber,drink,food;
                tableNumber = cursor.getString(0);
                drink = cursor.getString(1);
                food = cursor.getString(2);
                DataProvider mdataProvider = new DataProvider(tableNumber,drink,food);
                mListDataAdapter.add(mdataProvider);
            }
            while (cursor.moveToNext());
        }

    }
}
