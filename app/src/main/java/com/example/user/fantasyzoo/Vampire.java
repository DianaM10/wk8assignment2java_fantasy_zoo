package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Vampire extends FantasyCreature implements Undeadable {

    public Vampire(String name, int age, int size, double price) {
        super(name, age, size, price);
        super.belly = new ArrayList<Food>();

    }

    public String smellHumans() {
        return "I want to suck your blood!";
    }


}
