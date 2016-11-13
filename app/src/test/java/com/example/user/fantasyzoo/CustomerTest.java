package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class CustomerTest {

    Customer customer1;
    Customer customer2;

    @Before
    public void before() {
        customer1 = new Customer(100.00, 0);
        customer2 = new Customer(30.53, 1);
    }

    @Test
    public void doesCustomerHaveMoney() {
        assertEquals(100.00, customer1.getWallet(), 0.01);
    }

    @Test
    public void doesCustomerHaveTicket() {
        assertEquals(1, customer2.getTicket());
    }
}
