package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 12/11/2016.
 */

public class Vampire extends FantasyCreature {

    public Vampire(String name, int age, int size) {
        super(name, age, size);
        super.belly = new ArrayList<String>();

    }


}
