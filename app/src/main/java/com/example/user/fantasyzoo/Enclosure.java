package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class Enclosure {

    private int size;
    ArrayList<Cageable> cage;

    public Enclosure(int size) {
        this.size = size;
        this.cage = new ArrayList<Cageable>();
    }

    public int getSize() {
        return(size);
    }

    public void cage(Cageable creature) {
        this.cage.add(creature);
    }

    public int cageCount() {
        return this.cage.size();
    }

    public boolean cageFull() {
        if (cageCount() == size) {
            return true;
        }
        else return false;

    }

    public Cageable remove() {
        if (cageCount()>0) {
            return cage.remove(0);
        }
        return null;
    }


}
