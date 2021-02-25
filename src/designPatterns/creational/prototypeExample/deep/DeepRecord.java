package designPatterns.creational.prototypeExample.deep;

//Empty object (to show what happens with object references in the Prototype pattern
public class DeepRecord implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}