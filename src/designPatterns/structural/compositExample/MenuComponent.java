package designPatterns.structural.compositExample;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public List<MenuComponent> getMenuComponents() {
        return menuComponents;
    }

    public abstract String toWebString(String prefix);

    String print(String prefix, MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(prefix);
        builder.append(menuComponent.name);
        builder.append(": ");
        builder.append(menuComponent.url);
        builder.append("\n");
        return builder.toString();
    }

}
