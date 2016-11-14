package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class LochNessMonster extends FantasyCreature implements Cageable, Submergable {

    public LochNessMonster(String name, int age, int size, double price) {
        super(name, age, size, price);
        super.belly = new ArrayList<Food>();

    }

    public String canSwim() {
        return "Just keep swimming, just keep swimming";
    }
}
