package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class StandardEnclosure extends Enclosure {

    ArrayList<Bleedable> cage;

    public StandardEnclosure(int size) {
        super(size);
        this.cage = new ArrayList<Bleedable>();
    }

    public String cage(Bleedable creature) {
        if (this.cageFull() == false) {
            this.cage.add(creature);
            return "Creature has been sucessfully caged";
        }
        return "This cage is full, use another one!";
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

    public void emptyCage() {
        this.cage.clear();
    }

    public Bleedable remove() {
        if (cageCount()>0) {
            return cage.remove(0);
        }
        return null;
    }


    public Bleedable remove(FantasyCreature fantasyCreature) {
        for (Bleedable creature: cage) {
            if (creature == fantasyCreature) {
                return this.remove();
            }
        }
        return null;
    }

    public FantasyCreature checkCreature(FantasyCreature fantasyCreature) {
        for (Bleedable creature: cage)
            if (creature == fantasyCreature) {
                return fantasyCreature;
            }
        return null;
    }
}
