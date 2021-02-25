package designPatterns.creational.factoryExample;

import designPatterns.creational.factoryExample.pages.AboutPage;
import designPatterns.creational.factoryExample.pages.CommentPage;
import designPatterns.creational.factoryExample.pages.ContactPage;
import designPatterns.creational.factoryExample.pages.PostPage;

public class Blog extends Website {

    //No constructor --> It is in the base abstract class (that calls the createWebsite() method)

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
