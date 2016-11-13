package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public abstract class FantasyCreature {

    private String name;
    private int age;
    private int size; //size is a scale of 1 to 5, 5 being largest
    ArrayList<String> belly;

    public FantasyCreature(String name, int age, int size) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.belly = new ArrayList<String>();
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

    public void eat(String food) {
        belly.add(food);
    }

    public int foodCount() {
        return belly.size();
    }

    public void hungry() {
        belly.clear();
    }



}
