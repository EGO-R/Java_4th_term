package org.java4term.pr_7.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        var pepperoniPizza = new PepperoniPizza("Pepperoni pizza", 10);
        var cheeseDecorator = new CheeseDecorator(pepperoniPizza);

        System.out.println(cheeseDecorator.getDescription());
        System.out.println(cheeseDecorator.getCost());
    }
}
