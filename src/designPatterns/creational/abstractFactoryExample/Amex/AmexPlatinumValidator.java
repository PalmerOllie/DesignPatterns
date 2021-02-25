package designPatterns.creational.abstractFactoryExample.Amex;

import designPatterns.creational.abstractFactoryExample.CreditCard;
import designPatterns.creational.abstractFactoryExample.Validator;

public class AmexPlatinumValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
