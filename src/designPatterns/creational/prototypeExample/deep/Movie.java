package designPatterns.creational.prototypeExample.deep;


public class Movie extends Item {
    private String runtime;

    public Movie() {
        this.itemType = ItemType.Movie;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }



    public void print() {
        System.out.println("       Reference:" + this);
        System.out.println("           Title:" + this.getTitle());
        System.out.println("         Runtime:" + this.getRuntime());
        System.out.println("           Price:" + this.getPrice());
        System.out.println("Record ObjectRef:" + this.getRecord());
    }
}
