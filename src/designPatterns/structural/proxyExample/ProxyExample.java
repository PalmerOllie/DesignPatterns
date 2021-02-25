package designPatterns.structural.proxyExample;

import designPatterns.DesignPatternExample;

public class ProxyExample extends DesignPatternExample {
    @Override
    protected void run() {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub()); //Because this is wrapped by SecurityProxy we can now control when/if it is made (e.g. adding security or LazyLoading)

        System.out.println(service.getTimeline("myTwitterHandle")); //Cannot connect to twitter due to HL firewall so using a stub service
        System.out.println("\n\n\n");


        System.out.println("In the Proxy pattern we have wrapped a class (SecurityProxy) around another class (TwitterService(Stub))");
        System.out.println("We used java.lang.reflect.Proxy which enables us to pass any class in the SecurityProxy 'newInstance' method and get back a proxy that has all the methods of the original class. (It does this using reflection.)");
        System.out.println("Then in the 'invoke' method in SecurityProxy we can control access to each method.");
        System.out.println("In this method we disallow any posting of tweets through the TwitterService.");


        //Uncomment the line below to cause the see the SecurityProxy in action (it stops the postToTimeline method)
        //service.postToTimeline("myTwitterHandle", "Some tweet that shouldn't appear");
        System.out.println("Try uncommenting the service.postToTimeline above to see the SecurityProxy in action.");

        System.out.println("In this pattern we can only have one Proxy wrapping a class, we cannot chain or wrap more around a class. Therefore if we needed to do more than just Security we would have to do it all in one Proxy class.");

    }
}
