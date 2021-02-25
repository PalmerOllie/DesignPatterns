package designPatterns.creational.builderExample;

import designPatterns.DesignPatternExample;

public class BuilderExample extends DesignPatternExample {
    @Override
    protected void run() {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayonaise").meat("Chicken");
        LunchOrder lunchOrder = builder.build();

        System.out.println("A sandwich was built with: ");
        lunchOrder.print();

        //Build another sandwich without dressing and don't have to change the underlying class's constructors
        LunchOrder.Builder builder2 = new LunchOrder.Builder();
        builder2.bread("Wheat").condiments("Lettuce").meat("Chicken");
        LunchOrder lunchOrder2 = builder2.build();

        System.out.println("\n\nAnother sandwich was built with NO MAYO without changing the constructors: ");
        lunchOrder2.print();
    }
}
