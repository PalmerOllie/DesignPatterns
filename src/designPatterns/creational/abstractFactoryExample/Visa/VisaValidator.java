package designPatterns.creational.abstractFactoryExample.Visa;

import designPatterns.creational.abstractFactoryExample.CreditCard;
import designPatterns.creational.abstractFactoryExample.Validator;

public class VisaValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
