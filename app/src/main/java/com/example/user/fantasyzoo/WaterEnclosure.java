package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class WaterEnclosure extends Enclosure {

    ArrayList<Submergable> cage;

    public WaterEnclosure(int size) {
        super(size);
        this.cage = new ArrayList<Submergable>();

    }
    public String cage(Submergable creature) {
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

    public Submergable remove() {
        if (cageCount()>0) {
            return cage.remove(0);
        }
        return null;
    }


    public Submergable remove(FantasyCreature fantasyCreature) {
        for (Submergable creature: cage) {
            if (creature == fantasyCreature) {
                return this.remove();
            }
        }
        return null;
    }

    public FantasyCreature checkCreature(FantasyCreature fantasyCreature) {
        for (Submergable creature: cage)
            if (creature == fantasyCreature) {
                return fantasyCreature;
            }
        return null;
    }

    public String listCreatures() {
        String displayText = "";
        for (Submergable creature: cage) {
            FantasyCreature thing = ((FantasyCreature) creature);
            displayText += "Type: ";
            displayText += thing.getType();
            displayText += " | Name: ";
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
