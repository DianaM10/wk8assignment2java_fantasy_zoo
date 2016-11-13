package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public abstract class FantasyCreature {

    private String name;
    private int age;
    private int size; //size is a scale of 1 to 5, 5 being largest
    private double price;
    ArrayList<Food> belly;

    public FantasyCreature(String name, int age, int size, double price) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.price = price;
        this.belly = new ArrayList<Food>();
    }

    public String getName() {
        return(name);
    }

    public int getAge() {
        return(age);
    }

    public int getSize() {
        return(size);
    }

    public double getPrice() {
        return(price);
    }

    public void eat(Food food) {
        belly.add(food);
    }

    public int foodCount() {
        return belly.size();
    }

    public void hungry() {
        belly.clear();
    }



}
