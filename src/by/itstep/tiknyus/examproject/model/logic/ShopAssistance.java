package by.itstep.tiknyus.examproject.model.logic;

import by.itstep.tiknyus.examproject.model.entity.Basket;
import by.itstep.tiknyus.examproject.model.entity.Orange;
import by.itstep.tiknyus.examproject.model.entity.Bread;
import by.itstep.tiknyus.examproject.model.entity.Milk;
import by.itstep.tiknyus.examproject.model.exception.ProductIndexOutOfBoundException;

public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket){
        double total = 0;

        try {
            for (int i = 0; i < basket.getOrangesSize(); i++) {
                Orange orange = basket.getOrange(i);
                total += orange.getCoast();
            }

            for (int i = 0; i < basket.getMilkSize(); i++) {
                Milk milk = basket.getMilk(i);
                total += milk.getMoney();
            }

            for (int i = 0; i < basket.getBreadSize(); i++) {
                Bread bread = basket.getBread(i);
                total += bread.getPrice();
            }

        } catch (ProductIndexOutOfBoundException exc){
            System.err.println(exc);


            }
        return total;
        }

    }
