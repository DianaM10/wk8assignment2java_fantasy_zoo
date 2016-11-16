package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 13/11/2016.
 */

public class DarkEnclosureTest {

    DarkEnclosure darkEnclosure1;
    DarkEnclosure darkEnclosure2;
    Vampire vampire1;
    Vampire vampire2;
    Vampire vampire3;
    Vampire vampire4;
    Zombie zombie1;
    DayWalker dayWalker;
    Werewolf werewolf;

    @Before
    public void before() {
        darkEnclosure1 = new DarkEnclosure(3);
        darkEnclosure2 = new DarkEnclosure(2);
        vampire1 = new Vampire("Spike", 136, 4, 478.99);
        vampire2 = new Vampire("Angel", 279, 4, 1289.53);
        vampire3 = new Vampire("Drusilla", 156, 4, 980.70);
        vampire4 = new Vampire("Dracula", 404, 4, 1456.00);
        zombie1 = new Zombie("Ed", 29, 4, 58.98);
        dayWalker = new DayWalker("Blade", 78, 4, 1699.50);
        werewolf = new Werewolf("Scott McCall", 17, 3, 325.09);
        darkEnclosure1.cage(zombie1);
        darkEnclosure1.cage(vampire1);
        darkEnclosure1.cage(vampire3);
        darkEnclosure2.cage(vampire2);

    }

    @Test
    public void cageHasSize() {
        assertEquals(3, darkEnclosure1.getSize());
    }

    @Test
    public void canCheckCageIsFull() {
        assertEquals(true, darkEnclosure1.cageFull());
    }

    @Test
    public void cageStartsEmpty() {
        darkEnclosure1.emptyCage();
        assertEquals(0, darkEnclosure1.cageCount());
    }

    @Test
    public void canEmptyCage() {
        darkEnclosure1.emptyCage();
        assertEquals(0, darkEnclosure1.cageCount());

    }

    @Test
    public void canRemoveCreatureFromCage() {
        Undeadable creature = darkEnclosure1.remove();
        assertNotNull(creature);
    }

    @Test
    public void canGetVampire1BackFromCage() {
        darkEnclosure1.remove(vampire1);
        assertEquals(2, darkEnclosure1.cageCount());
        assertEquals("Spike", vampire1.getName());

    }

    @Test
    public void canGetDayAnyCreatureBackFromCage() {
        darkEnclosure1.remove(vampire3);
        assertEquals(2, darkEnclosure1.cageCount());
        assertEquals("Drusilla", vampire3.getName());

    }

    @Test
    public void returnsNullwhenCreatureisNotinCage() {
        assertEquals(null,darkEnclosure1.remove(werewolf));

    }

    @Test
    public void canCheckCreaturesinCage() {
        assertEquals(vampire2, darkEnclosure2.checkCreature(vampire2));
    }

    @Test
    public void cannotPutMoreCreaturesInThanEnclosureSize() {
        assertEquals("This cage is full, use another one!", darkEnclosure1.cage(vampire4));
    }

    @Test
    public void canListContentsOfCage() {
        assertEquals("Name: Ed | Age: 29 | Price: 58.98" +System.getProperty("line.separator") + "Name: Spike | Age: 136 | Price: 478.99"+System.getProperty("line.separator") + "Name: Drusilla | Age: 156 | Price: 980.7"+System.getProperty("line.separator"), darkEnclosure1.listCreatures());
    }






}
