package designPatterns.behavioral.iteratorExample;

import designPatterns.DesignPatternExample;

import java.util.Iterator;

public class IteratorExample extends DesignPatternExample {
    @Override
    protected void run() {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Mach Bike");
        repo.addBike("Nano Bike");
        repo.addBike("Wario Bike");

        Iterator<String> bikeIterator = repo.iterator();


        System.out.println("Because BikeRepository implements the iterator() method we can loop over it using that iterator in a while loop:");
        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }

        System.out.println("\n\nWe can also easily use the for-each loop:");
        for (String bike : repo) {
            System.out.println(bike);
        }

        System.out.println("\n\nThe iterator pattern allows us to define a way to loop through a container.");
        System.out.println("Here we have a BikeRepository so we need to create a custom way to loop through it.");
        System.out.println("The 'Bikes' could be custom 'Bike' objects but here we just have Strings to represent them.");
        System.out.println("Note how in this method 'run()' we don't care how the BikeRepository is implmented, the details are not important to us.");
        System.out.println("We just want a way to loop through it. How we actually do that is left to the BikeRepository. It is defined in the BikeRepository Iterator() inner class.");
        System.out.println("All that class has to implement is a way to get the next item 'next()' and a way to see if there is a next item. 'hasNext()'");




    }
}
