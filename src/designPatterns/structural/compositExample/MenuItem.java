package designPatterns.structural.compositExample;

public class MenuItem extends MenuComponent {
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toWebString(String prefix) {
        return print(prefix,this);
    }
}
