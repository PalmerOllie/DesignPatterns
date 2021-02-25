package designPatterns.creational.singletonExample;

public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance = null; //Volatile means multiple threads can now access this
    private ThreadSafeSingleton() {


        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create"); //This protects against Reflection
        }
    };

    public static ThreadSafeSingleton getInstance() {
        if(instance == null) {

            synchronized (ThreadSafeSingleton.class) {
                if(instance == null) { instance = new ThreadSafeSingleton(); } //Synchronise so only one instance is made
            }
        }
        return instance;
    }

}
