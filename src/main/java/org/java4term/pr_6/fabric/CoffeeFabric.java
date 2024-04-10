package org.java4term.pr_6.fabric;

public class CoffeeFabric {
    public static Coffee makeCoffee(CoffeeType type) {
        return switch(type) {
            case AMERICANO -> new Americano();
            case CAPPUCCINO -> new Cappuccino();
        };
    }
}
