package designPatterns;

import designPatterns.Color;

import java.util.Collections;

public abstract class DesignPatternExample {
    public void printExample (Color color) {
        printSeperator(color);
        System.out.println("-------- " + this.getClass().getSimpleName() + " --------");
        run();
        printSeperator(color);
        resetColour();
    }

    protected abstract void run();

    public static void printSeperator(Color colour) {
        System.out.println(colour.ANSI_STRING + "\n" + String.join("", Collections.nCopies(60, "-")) + "\n");
    }
    public static void resetColour() {
        System.out.print(Color._RESET_.ANSI_STRING);
    }



}
