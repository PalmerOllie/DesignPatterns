package designPatterns.structural.compositExample;

import java.util.Iterator;

public class Menu extends MenuComponent {
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    //Could add these methods to abstract class and throw 'NotImplementedError' so only classes that need them override them
    //@Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }


    //@Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }


    @Override
    public String toWebString(String prefix) {
        StringBuilder builder = new StringBuilder();
        builder.append(print(prefix,this));

        for(MenuComponent menuComponent : this.getMenuComponents()) {
            builder.append(menuComponent.toWebString("  " + prefix));

        }

//        Iterator<MenuComponent> itr = menuComponents.iterator();
//        while (itr.hasNext()) {
//            MenuComponent menuComponent = itr.next();
//            builder.append("-" + menuComponent.toString());
//        }

        return builder.toString();
    }

}
