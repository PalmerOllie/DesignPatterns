package designPatterns.creational.prototypeExample.deep;

public class Book extends Item {
    private int numberOfPages;

    public Book() {
        this.itemType = ItemType.Book;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
