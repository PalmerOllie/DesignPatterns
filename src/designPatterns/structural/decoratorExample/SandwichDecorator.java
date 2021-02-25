package designPatterns.structural.decoratorExample;


//This avoids us having classes for a 'SimpleSandwichWithCheese' or 'SimpleSandwichWithLettuce'
public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) { //This sandwich can be a ConcreteSandwich or another Decorator
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}
