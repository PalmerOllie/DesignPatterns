package designPatterns.creational.singletonExample;

public class Singleton {
    private static Singleton instance = new Singleton(); //Private static Instance (guarantees only 1)
    private Singleton() {}; //Private Constructor

    public static Singleton getInstance() { return instance; } //Public getter, no setter

}
