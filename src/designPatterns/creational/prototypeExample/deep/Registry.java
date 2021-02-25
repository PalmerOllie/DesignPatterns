package designPatterns.creational.prototypeExample.deep;


import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<ItemType, Item> items = new HashMap<ItemType, Item>(); //List to hold preloaded items to clone

    public Registry() {
        loadItems();
    }

    public Item createItems(ItemType type) {
        Item item = null;

        try {
            item = (Item) (items.get(type)).deepCloneItem(); //Here a movie is pulled from the HashMap and cloned
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("12 Angry Men");
        movie.setPrice(19.57);
        movie.setRuntime("1 hour 36 minutes");
        movie.setRecord(new DeepRecord());
        items.put(ItemType.Movie, movie);

        Book book = new Book();
        book.setTitle("Northern Lights");
        book.setNumberOfPages(399);
        items.put(ItemType.Book, book);
    }

}
