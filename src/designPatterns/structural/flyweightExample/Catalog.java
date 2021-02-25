package designPatterns.structural.flyweightExample;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Item> items = new HashMap<String, Item>(); //acts like a cache

    //Factory method
    public Item lookup(String itemName) {
        if(items.containsKey(itemName) == false) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
