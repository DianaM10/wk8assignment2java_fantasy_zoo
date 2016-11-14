package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class DayWalker extends FantasyCreature implements Bleedable {

    public DayWalker(String name, int age, int size, double price) {
        super(name, age, size, price);
        super.belly = new ArrayList<Food>();

    }
}
