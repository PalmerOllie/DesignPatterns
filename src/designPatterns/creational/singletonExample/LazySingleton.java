package designPatterns.creational.singletonExample;

//The LazySingleton is only created when getInstance() is called
public class LazySingleton {
    private static LazySingleton instance = null; //Private static Instance (guarantees only 1) - lazy loaded
    private LazySingleton() {}; //Private Constructor

    public static LazySingleton getInstance() {
        if(instance == null) { return new LazySingleton(); } //Make it if it's not been created
        return instance;
    }

}
