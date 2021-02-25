package designPatterns.creational.singletonExample;

import designPatterns.DesignPatternExample;

public class SingletonExample extends DesignPatternExample {
    protected void run() {
        Singleton oneSingleton = Singleton.getInstance();
        Singleton theSameSingleton = Singleton.getInstance();
        System.out.println("Singleton is just an object that has a private constructor and holds a private static instance of itself - so it can only be instantiated once.");
        System.out.println("We usually access Singletons through SingletonClassName.getInstance()");

        System.out.println("Every access to this Singleton method returns the same static object instance");
        System.out.println("Are both instances the same: " + oneSingleton.equals(theSameSingleton));
        System.out.println("Memory addresses for both singletons:");
        System.out.println(System.identityHashCode(oneSingleton)); //HashCode is loosely linked to memory address
        System.out.println(System.identityHashCode(theSameSingleton));
        System.out.println("^^^^^ Both memory addresses should be the same");

    }

}
