package designPatterns.structural.flyweightExample;

import designPatterns.DesignPatternExample;

public class FlyweightExample extends DesignPatternExample {
    @Override
    protected void run() {
        InventorySystem ims = new InventorySystem();

        ///Several orders but only 3 items you can buy
        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Samsung TV", 100);
        ims.takeOrder("Roomba", 456);
        ims.takeOrder("Samsung TV", 194);
        ims.takeOrder("Apple Macbook", 142);
        ims.takeOrder("Samsung TV", 392);
        ims.takeOrder("Samsung TV", 229);
        ims.takeOrder("Roomba", 243);
        ims.takeOrder("Apple Macbook", 832);

        ims.process();

        System.out.println(ims.report());

        System.out.println("\n\n\nThe Flyweight pattern improves memory optimisation using a FlyweightFactory. (Here our Catalog class)");
        System.out.println("We have a Catalog and an Inventory Management System where we can send an Order to buy an Item (e.g. Samsung TV) in the catalog");
        System.out.println("The FlyweightFactory (Catalog) will create the Items we want to Order. If we order an item from the catalog it will create it. The second time we order that item it won't need to create it again because it has stored it.");
        System.out.println("In this way it acts like a cache and will just return that item.");
        System.out.println("So all the 'Samsung TV's returned from the Catalog were the same object regardless of the Order number.");
        System.out.println("An important aspect of this pattern is that the Client doesn't necessarily need to know that a Flyweight object was returned - it can still interact with it regardless - this is the same as with the Java 'String' class.");
    }
}
