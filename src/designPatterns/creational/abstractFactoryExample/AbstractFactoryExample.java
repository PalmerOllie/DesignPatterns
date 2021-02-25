package designPatterns.creational.abstractFactoryExample;

import designPatterns.DesignPatternExample;

public class AbstractFactoryExample extends DesignPatternExample {
    @Override
    protected void run() {
        int creditScore = 775;
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(creditScore); //This is the abstractFactory method returning a ConcreteFactory
        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.PLATINUM);

        System.out.println("\nWe get a AbstractFactory (Factory of factories) that produces different types of CreditCardFactory");
        System.out.println("To get a CreditCardFactory we call the static method getCreditCardFactory() in the abstract class CreditCardFactory which returns an instance of itself!");
        System.out.println("The instance it returns will either be a VisaFactory or an AmexFactory as these both extend from the abstract class CreditCardFactory.");
        System.out.println("Remember abstract classes cannot be instantiated themselves. You must create a class that inherits from it and instantiate that.");

        System.out.println("Once we have a ConcreteFactory (either Visa or Amex) we then call the getCreditCard() method (which all Factories extending CreditCardFactory have to implement.)");

        System.out.println("The choice of which CreditCardFactory is chosen made in the static method getCreditCardFactory() in the abstract class CreditCardFactory");
        System.out.println("The choice of which CreditCard is chosen is left to the type of ConcreteFactory (subclass) that is chosen (e.g. in the VisaFactory or AmexFactory class)");

        System.out.println("\n\n\n            We enter a credit score of: " + creditScore);
        System.out.println("         We get back a factory of type: " + creditCardFactory.getClass().getSimpleName());
        System.out.println("This factory then chose a card type of: " + creditCard.getClass().getSimpleName());


        int lowerCreditScore = 600;
        creditCardFactory = CreditCardFactory.getCreditCardFactory(lowerCreditScore);
        CreditCard anotherCreditCard = creditCardFactory.getCreditCard(CardType.GOLD);


        System.out.println("\n\n\n            We enter a credit score of: " + creditScore);
        System.out.println("         We get back a factory of type: " + creditCardFactory.getClass().getSimpleName());
        System.out.println("This factory then chose a card type of: " + anotherCreditCard.getClass().getSimpleName());

        System.out.println("\n\nWe only entered our credit score. The actual implementation is hidden from the client. Decisions over which creditCard to give us are deferred to the subclasses (AmexFactory) and (VisaFactory)");
        System.out.println("As a side note, in this example we also have a validator method that ");

    }
}
