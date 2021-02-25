package designPatterns.creational.factoryExample;

import designPatterns.DesignPatternExample;

import java.util.List;
import java.util.stream.Collectors;

public class FactoryExample extends DesignPatternExample {
    @Override
    protected void run() {
        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println("WebsiteFactory Building Blog Website: ");
        printListOfClassNames(website.getPages());


        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println("\nWebsiteFactory Building Shop Website: ");
        printListOfClassNames(website.getPages());

        System.out.println("\n\nThe constructors to the subclasses Blog and Shop were not implemented, so it will call the base abstract class Website constructor");
        System.out.println("The base Website constructor just calls an abstract method 'createWebsite' that the subclasses must implement.");
        System.out.println("In this way, the creation specifics are defered to the subclasses and yet they can still be created through the Factory without the factory needing to know specifics about each subclass");
    }


    public void printListOfClassNames(List<? extends Object> objects) {
        System.out.println( objects.stream().map(c -> c.getClass().getSimpleName()).collect(Collectors.toList()) );
    }

}
