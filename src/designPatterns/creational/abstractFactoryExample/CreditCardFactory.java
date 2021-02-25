package designPatterns.creational.abstractFactoryExample;

import designPatterns.creational.abstractFactoryExample.Amex.AmexFactory;
import designPatterns.creational.abstractFactoryExample.Visa.VisaFactory;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if(creditScore > 650) {
            return new AmexFactory();
        }
        else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
