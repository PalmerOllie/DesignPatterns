package designPatterns.creational.abstractFactoryExample.Visa;

import designPatterns.creational.abstractFactoryExample.CardType;
import designPatterns.creational.abstractFactoryExample.CreditCard;
import designPatterns.creational.abstractFactoryExample.CreditCardFactory;
import designPatterns.creational.abstractFactoryExample.Validator;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisaBlackCreditCard();
        }

        return null;
    }

    public Validator getValidator(CardType cardType) {
        return new VisaValidator();
    }


}
