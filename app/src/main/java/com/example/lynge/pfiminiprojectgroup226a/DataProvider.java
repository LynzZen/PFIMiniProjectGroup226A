package com.example.lynge.pfiminiprojectgroup226a;

/**
 * Created by Lynge on 21-04-2017.
 */

public class DataProvider {

    private String Drink;
    private String Food;
    private String TableNumber;

    public String getDrink() {
        return Drink;
    }

    public String getFood() {
        return Food;
    }

    public String getTableNumber() {
        return TableNumber;
    }

    public DataProvider(String Drink, String Food, String TableNumber){
        this.Drink = Drink;
        this.Food = Food;
        this.TableNumber = TableNumber;
    }
}
