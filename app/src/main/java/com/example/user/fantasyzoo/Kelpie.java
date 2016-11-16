package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class Kelpie extends FantasyCreature implements Submergable {

    public Kelpie(String type, String name, int age, int size, double price) {
        super(type, name, age, size, price);
        super.belly = new ArrayList<Food>();

    }

    public String canSwim() {
        return "swimming";
    }
}
