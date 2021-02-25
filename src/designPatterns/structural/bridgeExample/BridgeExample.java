package designPatterns.structural.bridgeExample;

import designPatterns.DesignPatternExample;

public class BridgeExample extends DesignPatternExample {
    @Override
    protected void run() {
        System.out.println("We make a movie object with a bunch of info attached to it (like title, year, runtime)");
        Movie movie = new Movie();
        movie.setGenre("Action");
        movie.setTitle("Taken");
        movie.setRuntime("1:33");
        movie.setYear("2008");

        Formatter printFormatter = new PrintFormatter();
        //The moviePrinter doesn't know anything about the printFormatter - only knows the Formatter interface
        Printer moviePrinter = new MoviePrinter(movie);

        System.out.println("The classes MoviePrinter and PrintFormatter know nothing about eachother - they are kept separate.");
        System.out.println("The link occurs in the base class and interface. The Printer class interacts with the Formatter interface in it's print() method.");

        String printedMaterial = moviePrinter.print(printFormatter);

        System.out.println(printedMaterial);

        System.out.println("\n\nIf we wanted another type of print output (e.g. HTML) we can create a HTMLFormatter class that implements Formatter interface.");
        System.out.println("We can add this without having to change our MoviePrinter.");
        Formatter htmlFormatter = new HTMLFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);

        System.out.println("\n\nWe could also add a BookPrinter to print a Book class object (e.g. print author, pages, chapters) and we would not need to change the HTMLFormatter  or PrintFormatter class.");

    }
}
