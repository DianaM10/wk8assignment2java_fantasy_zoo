package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Vampire extends FantasyCreature implements Undeadable {

    public Vampire(String type, String name, int age, int size, double price) {
        super(type, name, age, size, price);
        super.belly = new ArrayList<Food>();

    }

    public String smellHumans() {
        return "I want to suck your blood!";
    }


}
