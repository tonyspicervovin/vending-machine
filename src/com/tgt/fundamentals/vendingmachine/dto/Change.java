package com.tgt.fundamentals.vendingmachine.dto;

public class Change {
    private int quarter;
    private int dimes;
    private int nickels;
    private int pennies;

    @Override
    public String toString() {
        return "Dispensing "+ quarter + " quarters " +
                dimes + " dimes " +
                nickels + " nickels " +
                pennies + " pennies";
    }

    public Change(int quarter, int dimes, int nickels, int pennies) {
        this.quarter = quarter;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getDimes() {
        return dimes;
    }

    public void setDimes(int dimes) {
        this.dimes = dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public void setNickels(int nickels) {
        this.nickels = nickels;
    }

    public int getPennies() {
        return pennies;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }
}
