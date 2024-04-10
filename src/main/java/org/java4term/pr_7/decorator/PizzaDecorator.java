package org.java4term.pr_7.decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    protected PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
