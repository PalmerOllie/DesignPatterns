package designPatterns.creational.prototypeExample;

import designPatterns.DesignPatternExample;
import designPatterns.creational.prototypeExample.deep.ItemType;
import designPatterns.creational.prototypeExample.deep.Movie;
import designPatterns.creational.prototypeExample.deep.Registry;
import designPatterns.creational.prototypeExample.shallow.Record;
import designPatterns.creational.prototypeExample.shallow.Statement;

import java.util.ArrayList;
import java.util.List;

public class PrototypeExample extends DesignPatternExample {
    @Override
    protected void run() {
        runShallowExample();
        runDeepExample();
    }


    private void runShallowExample() {
        System.out.println("\n\n-------- Shallow" + this.getClass().getSimpleName() + " --------");
        String sql = "select * from movies where title = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("Star wars");
        Record record = new Record();

        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println("First Object's references: \n");
        firstStatement.print();

        Statement clonedStatement = firstStatement.clone();
        System.out.println("\n\nNext we make another 'Statement' object without using the 'new' keyword - we use the .clone() method");

        System.out.println("Cloned Object's references: \n");
        clonedStatement.print();

        System.out.println("\n\nNote how the cloned object is a different address but it has all the same data - including the same object reference to the 'Record' object.");


        System.out.println("These are shallow copies. Changing the clone will reflect changes to the original's data");

    }

    private void runDeepExample() {
        System.out.println("\n\n-------- Deep" + this.getClass().getSimpleName() + " --------");


        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItems(ItemType.Movie);
        movie.setTitle("The Dark Knight");
        movie.setRuntime("2 hours 32 minutes");

        System.out.println("Making a Movie: ");
        movie.print();

        System.out.println("\n\nMaking another Movie: ");
        Movie anotherMovie = (Movie) registry.createItems(ItemType.Movie);
        anotherMovie.setTitle("Forrest Gump");
        anotherMovie.setRuntime("2 hours 22 minutes");
        anotherMovie.setPrice(19.94);
        anotherMovie.print();

        System.out.println("\n\nNotice how the addresses are different because we used a custom clone method (deepCloneItem) to do a deep clone.");
        System.out.println("Therefore editing the fields of one movie does not change the others");
        System.out.println("In the prototype pattern a unique instance is made each time and we avoid using the costly new keyword");


    }

}
