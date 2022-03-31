package by.itstep.tiknyus.examproject.model.entity;

import by.itstep.tiknyus.examproject.model.exception.ProductIndexOutOfBoundException;

public class Basket {
    private Orange[] oranges;
    private Milk[] milk;
    private Bread[] breads;

    public Basket() {
        oranges = new Orange[0];
        milk = new Milk[0];
        breads = new Bread[0];
    }

    public Basket(Orange[] oranges, Milk[] milk, Bread[] breads) {
        this.oranges = oranges;
        this.milk = milk;
        this.breads = breads;
    }

    public Orange getOrange(int index) throws ProductIndexOutOfBoundException {
        if (index >= 0 && index < oranges.length) {
            return oranges[index];
        } else {
            throw new ProductIndexOutOfBoundException();
        }
    }

    public int getOrangesSize(){
        return oranges.length;
    }

    public Milk getMilk(int index) throws ProductIndexOutOfBoundException {
        if (index >= 0 && index < milk.length) {
            return milk[index];
        } else {
            throw new ProductIndexOutOfBoundException();
        }
    }

    public int getMilkSize(){
        return milk.length;
    }

    public Bread getBread(int index) throws ProductIndexOutOfBoundException {
        if (index >= 0 && index < breads.length) {
            return breads[index];
        } else {
            throw new ProductIndexOutOfBoundException();
        }
    }

    public int getBreadSize(){
        return breads.length;
    }

    public void add(Orange orange) {
        Orange[] temp = new Orange[oranges.length + 1];
        int i = 0;
        for (; i < oranges.length; i++) {
            temp [i] = oranges[i];
        }
        temp[i] = orange;
        oranges = temp;
    }

    public void add(Bread bread) {
        Bread[] temp = new Bread [breads.length + 1];
        int i = 0;
        for (; i < breads.length; i++) {
            temp [i] = breads[i];
        }
        temp[i] = bread;
        breads = temp;
    }

    public void add(Milk milks) {
        Milk[] temp = new Milk [milk.length + 1];
        int i = 0;
        for (; i < milk.length; i++) {
            temp [i] = milk[i];
        }
        temp[i] = milks;
        milk = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of products: \n");

        for (Orange orange: oranges){
            builder.append(orange).append("\n");
        }

        for (Milk milk: milk){
            builder.append(milk).append("\n");
        }

        for (Bread bread: breads){
            builder.append(bread).append("\n");
        }
        return builder.toString();
    }
}
