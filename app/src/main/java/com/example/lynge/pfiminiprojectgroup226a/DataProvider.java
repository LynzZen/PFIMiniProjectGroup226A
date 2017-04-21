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

    public void setDrink(String drink) {
        Drink = drink;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getTableNumber() {
        return TableNumber;
    }

    public void setTableNumber(String tableNumber) {
        TableNumber = tableNumber;
    }

    public DataProvider(String Drink, String Food, String TableNumber){
        this.Drink = Drink;
        this.Food = Food;
        this.TableNumber = TableNumber;
    }
}
