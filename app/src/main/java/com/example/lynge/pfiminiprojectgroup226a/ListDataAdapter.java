package com.example.lynge.pfiminiprojectgroup226a;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lynge on 21-04-2017.
 */

public class ListDataAdapter extends ArrayAdapter {
    List mList = new ArrayList();
    public ListDataAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    static class LayoutHandler
    {
        TextView TABLENUMBER, DRINK, FOOD;
    }
    @Override
    public void add(@Nullable Object object) {
        super.add(object);
        mList.add(object);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row = convertView;
        LayoutHandler layoutHandler;
        if(row == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.row_layout,parent,false);
            layoutHandler = new LayoutHandler();
            layoutHandler.TABLENUMBER = (TextView) row.findViewById(R.id.text_tablenumber);
            layoutHandler.DRINK = (TextView) row.findViewById(R.id.text_drink);
            layoutHandler.FOOD = (TextView) row.findViewById(R.id.text_food);
            row.setTag(layoutHandler);
        }
        else{

            layoutHandler = (LayoutHandler) row.getTag();

        }
        DataProvider dataProvider = (DataProvider) this.getItem(position);
        layoutHandler.DRINK.setText(dataProvider.getDrink());
        layoutHandler.FOOD.setText(dataProvider.getFood());
        layoutHandler.TABLENUMBER.setText(dataProvider.getTableNumber());
        return row;
    }
}
