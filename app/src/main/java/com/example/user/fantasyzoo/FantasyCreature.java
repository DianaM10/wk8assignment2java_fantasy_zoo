package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public abstract class FantasyCreature {

    private String name;
    private int age;
    private ArrayList<String> belly;

    public FantasyCreature(String name, int age) {
        this.name = name;
        this.belly = new ArrayList<String>();
    }

    public void canEat(String food) {
        belly.add(food);
    }


}
