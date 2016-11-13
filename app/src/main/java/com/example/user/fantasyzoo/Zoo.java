package com.example.user.fantasyzoo;

/**
 * Created by user on 13/11/2016.
 */

public class Zoo {

    private double totalIncome;

    public Zoo(){
        totalIncome = 15000.00;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalIncome() {
        return(totalIncome);
    }

    public double sellTicket() {
        Customer.buyTicket();
        return (totalIncome + Ticket.getPrice());
    }
}
