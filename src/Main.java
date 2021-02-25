import designPatterns.Color;
import designPatterns.DesignPatternExample;
import designPatterns.behavioral.chainOfResponsibilityExample.ChainOfResponsibilityExample;
import designPatterns.behavioral.commandExample.CommandExample;
import designPatterns.behavioral.interpreterExample.InterpreterExample;
import designPatterns.behavioral.iteratorExample.IteratorExample;
import designPatterns.creational.abstractFactoryExample.AbstractFactoryExample;
import designPatterns.creational.builderExample.BuilderExample;
import designPatterns.creational.factoryExample.FactoryExample;
import designPatterns.creational.prototypeExample.PrototypeExample;
import designPatterns.creational.singletonExample.SingletonExample;
import designPatterns.structural.adapterExample.AdapterExample;
import designPatterns.structural.bridgeExample.BridgeExample;
import designPatterns.structural.compositExample.CompositeExample;
import designPatterns.structural.decoratorExample.DecoratorExample;
import designPatterns.structural.facadeExample.FacadeExample;
import designPatterns.structural.flyweightExample.FlyweightExample;
import designPatterns.structural.proxyExample.ProxyExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static designPatterns.Color.PURPLE;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println(PURPLE.ANSI_STRING + "Design Patterns in Java\n" + PURPLE.ANSI_STRING);

        List<Class<? extends DesignPatternExample>> creationalPatternExamples = new ArrayList<>(Arrays.asList(
                SingletonExample.class,
                BuilderExample.class,
                PrototypeExample.class,
                FactoryExample.class,
                AbstractFactoryExample.class
        ));

        List<Class<? extends DesignPatternExample>> structuralPatternExamples = new ArrayList<>(Arrays.asList(
                AdapterExample.class,
                BridgeExample.class,
                CompositeExample.class,
                DecoratorExample.class,
                FacadeExample.class,
                FlyweightExample.class,
                ProxyExample.class
        ));

        List<Class<? extends DesignPatternExample>> behaviouralPatternExamples = new ArrayList<>(Arrays.asList(
                ChainOfResponsibilityExample.class,
                CommandExample.class,
                InterpreterExample.class,
                IteratorExample.class
        ));

        System.out.println(PURPLE.ANSI_STRING + "\n\n ----------------------------------- CREATIONAL -----------------------------------");
        runExamples(creationalPatternExamples);
        System.out.println(PURPLE.ANSI_STRING + "\n\n ----------------------------------- STRUCTURAL -----------------------------------");
        runExamples(structuralPatternExamples);
        System.out.println(PURPLE.ANSI_STRING + "\n\n ----------------------------------- BEHAVIOURAL -----------------------------------");
        runExamples(behaviouralPatternExamples);

    }


    private static void runExamples(List<Class<? extends DesignPatternExample>> examples) throws IllegalAccessException, InstantiationException {
        Color[] colors = Color.values();
        int i = 0;

        for (Class<? extends DesignPatternExample> exampleClass : examples) {
            exampleClass.newInstance().printExample(colors[i++ % (colors.length - 1)]); //Print the Design Pattern Example with a different color (wraps around before the _RESET_ color)
        }
    }


}
