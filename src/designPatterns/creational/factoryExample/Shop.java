package designPatterns.creational.factoryExample;

import designPatterns.creational.factoryExample.pages.*;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new ItemPage());
        pages.add(new SearchPage());
        pages.add(new CartPage());
        pages.add(new ContactPage());
    }
}
