package designPatterns.creational.prototypeExample.deep;

import designPatterns.creational.prototypeExample.shallow.Record;

public abstract class Item implements Cloneable {

    private String title;
    private double price;
    private String url;
    protected static ItemType itemType;
    private DeepRecord record; //dummy object for object ref

    protected Object cloneItem() throws CloneNotSupportedException {
        return super.clone();
    }

    protected Object deepCloneItem() throws CloneNotSupportedException {
        Item clonedItem = (Item) super.clone();
        clonedItem.record = (DeepRecord) this.record.clone(); //DEEP COPY
        return clonedItem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DeepRecord getRecord() {
        return record;
    }

    public void setRecord(DeepRecord record) {
        this.record = record;
    }
}
