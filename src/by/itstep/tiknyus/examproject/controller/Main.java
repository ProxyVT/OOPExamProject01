package by.itstep.tiknyus.examproject.controller;

import by.itstep.tiknyus.examproject.model.entity.Basket;
import by.itstep.tiknyus.examproject.model.entity.Bread;
import by.itstep.tiknyus.examproject.model.entity.Milk;
import by.itstep.tiknyus.examproject.model.entity.Orange;
import by.itstep.tiknyus.examproject.model.logic.ShopAssistance;

public class Main {
    public static void main(String[] args) {

        Milk milk = new Milk(1000, 3.5, 2.5);
        Orange orange = new Orange(200, 2000, 4.0);
        Bread bread = new Bread("Black", "Middle", 2.5);
//        Milk milk2 = new Milk(3000, 5.5, 1.5);
//        Orange orange2 = new Orange(100, 1000, 2.0);
//        Bread bread2 = new Bread("White", "Middle", 2.0);

        Basket basket = new Basket();

        basket.add(orange);
        basket.add(milk);
        basket.add(bread);

        double total = ShopAssistance.calculateTotalPrice(basket);

        System.out.print(milk);
        System.out.print(orange);
        System.out.print(bread);
    }
}
