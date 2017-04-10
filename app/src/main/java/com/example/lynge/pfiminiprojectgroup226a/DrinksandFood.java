package com.example.lynge.pfiminiprojectgroup226a;

/**
 * Created by Weronika on 10/04/2017.
 */

public class DrinksandFood {

    String Cola = "Cola";
    String ColaZero = "ColaZero";
    String Fanta = "Fanta";
    String Sprite = "Sprite";
    String ScheweppesLemon = "ScheweppesLemon";
    String Spaghetti = "Spaghetti";
    String Burger = "Burger";
    String Pizza = "Pizza";
    String FrenchFries  = "FrenchFries";
    public DrinksandFood(){}

    public String DrinksandFood(int i){
        if (i == 1){
            return Cola;
        }
        else if (i == 2){
            return ColaZero;
        }
        else if (i == 3){
            return Fanta;
        }
        else if (i == 4){
            return Sprite;
        }
        else if(i == 5){
            return ScheweppesLemon;
        }

        return null;
    }

}
