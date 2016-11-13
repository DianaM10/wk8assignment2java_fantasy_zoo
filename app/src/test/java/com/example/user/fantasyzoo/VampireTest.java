package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 13/11/2016.
 */

public class VampireTest {

    Vampire vampire1;
    ArrayList<String> belly;

    @Before
    public void before() {
        vampire1 = new Vampire("Spike", 136, 4);
        belly = new ArrayList<String>();
    }

    @Test
    public void vampireHasName() {
        assertEquals("Spike", vampire1.getName());
    }

    @Test
    public void vampireHasAge() {
        assertEquals(136, vampire1.getAge());
    }

    @Test
    public void vampireHasSize() {
        assertEquals(4, vampire1.getSize());
    }

    @Test
    public void vampireCanEat() {
        belly.eat(food);
    }
}
