package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class DarkEnclosure extends Enclosure {

    ArrayList<Undeadable> cage;

    public DarkEnclosure(int size) {
        super(size);
        this.cage = new ArrayList<Undeadable>();
    }


    public String cage(Undeadable creature) {
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

    public Undeadable remove() {
        if (cageCount()>0) {
            return cage.remove(0);
        }
        return null;
    }


    public Undeadable remove(FantasyCreature fantasyCreature) {
        for (Undeadable creature: cage) {
            if (creature == fantasyCreature) {
                return this.remove();
            }
        }
        return null;
    }

    public FantasyCreature checkCreature(FantasyCreature fantasyCreature) {
        for (Undeadable creature: cage)
            if (creature == fantasyCreature) {
                return fantasyCreature;
            }
        return null;
    }

    public String listCreatures() {
        String displayText = "";
        for (Undeadable creature: cage) {
            FantasyCreature thing = ((FantasyCreature) creature);
            displayText += "Name: ";
            displayText += thing.getName();
            displayText += " | Age: ";
            displayText += thing.getAge();
            displayText += " | Price: ";
            displayText += thing.getPrice();
            displayText += "\n";
        }
        return displayText;

    }


}
