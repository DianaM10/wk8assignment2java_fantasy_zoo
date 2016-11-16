package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class Zombie extends FantasyCreature implements Undeadable {

    public Zombie(String type, String name, int age, int size, double price) {
        super(type, name, age, size, price);
        super.belly = new ArrayList<Food>();

    }

    public String smellHumans() {
        return "Graaaaagh...Mrh?";
    }
}
