package designPatterns.structural.proxyExample;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        StringBuilder sb = new StringBuilder();
        sb.append("Fake Stub Timeline - returned from TwitterServiceStub:");
        sb.append("\n@" + screenName + ": First Tweet, Hello Twitter");
        sb.append("\n@" + screenName + ": Second Tweet, Bye Twitter");
        return sb.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        System.out.println("New Tweet Added: " + "@" + screenName + ": " + message);
    }
}
