package designPatterns.structural.decoratorExample;

import designPatterns.DesignPatternExample;

public class DecoratorExample extends DesignPatternExample {
    @Override
    protected void run() {

        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println("Sandwich made: " + sandwich.make());

        System.out.println("\n\nThe Decorator pattern uses an Interface ('Sandwich') and an abstract class that implements that interface ('SandwichDecorator')");
        System.out.println("Since every ConcreteDecorator will implement the 'Sandwich' interface, we can 'daisy-chain' ConcreteDecorator and ConcreteSandwich classes together in the constructors");
        System.out.println("An example of this daisy-chaining is 'new MeatDecorator(new SimpleSandwich)'");
        System.out.println("\nEach decorator adds functionality through composition (not the same as the Composite pattern)");
        System.out.println("This avoids us having to make a new class for each different sandwich (e.g. SandwichWithCheese, SandwichWithCheeseAndJam)");
        System.out.println("However, we do also end up makig a lot of decorators for each new feature");
    }
}
