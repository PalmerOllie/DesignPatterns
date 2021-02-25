package designPatterns.behavioral.chainOfResponsibilityExample;

import designPatterns.DesignPatternExample;

public class ChainOfResponsibilityExample extends DesignPatternExample {
    @Override
    protected void run() {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        //Build Chain of Responsibility
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        director.handleRequest(request);


        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);

        System.out.println("Here we see 3 different requests get handled by the Chain of Responsibility.");
        System.out.println("Since the first request is a 'Conference' request it can be handled by the first chain - the director.");
        System.out.println("Other types of requests are passed up the chain to the VP and eventually the CEO");

        System.out.println("\nThe handler classes themselves (Director, VP, CEO) don't know anything about their successors other than they have a 'handlerRequest()' method.");
        System.out.println("We can add other Handlers easily to the ends or middle of this chain without changing the existing logic within Handlers.");
        System.out.println("However, one pitfall of this pattern is that it doesn't guarantee that the Request is handled.");
    }
}
