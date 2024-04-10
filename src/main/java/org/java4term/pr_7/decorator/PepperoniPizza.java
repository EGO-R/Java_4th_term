package org.java4term.pr_7.decorator;

public class PepperoniPizza implements Pizza {
    private String description;
    private int cost;

    public PepperoniPizza(String description, int cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
