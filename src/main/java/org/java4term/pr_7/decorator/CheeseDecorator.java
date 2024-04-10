package org.java4term.pr_7.decorator;

public class CheeseDecorator extends PizzaDecorator {

    protected CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 2;
    }
}
