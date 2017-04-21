package com.example.lynge.pfiminiprojectgroup226a;

/**
 * Created by Lynge on 21-04-2017.
 */

public class Order {
    private String Drink;
    private String Food;

    public void SetDrink(String i){
        this.Drink = i;
    }

    public void SetFood(String i){
        this.Food = i;
    }

    public String GetFood(){
        return this.Food;
    }

    public String GetDrink(){
        return this.Drink;
    }
}
