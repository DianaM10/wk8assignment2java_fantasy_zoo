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
    Food food;

    @Before
    public void before() {
        vampire1 = new Vampire("Vampire", "Spike", 136, 4, 478.99);
    }

    @Test
    public void vampireHasName() {
        assertEquals("Spike", vampire1.getName());
    }

    @Test
    public void vampireHasType() {
        assertEquals("Vampire", vampire1.getType());
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
    public void vampireHasPrice() {
        assertEquals(478.99, vampire1.getPrice(), 0.01);
    }

    @Test
    public void vampireCanEat() {
        vampire1.eat(food);
        assertEquals(1, vampire1.foodCount());
    }

    @Test
    public void vampireIsHungry() {
        vampire1.hungry();
        assertEquals(0, vampire1.foodCount());
    }
}
