package designPatterns.creational.builderExample;

public class LunchOrder {

    public static class Builder { //static inner class that Builds an instance of LunchOrder

        //Optional Ingredients
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() { //Could add required ingredients here e.g. a 'Drink of Water' is required with every LunchOrder or whether the order is Kid or Adult sized.

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void print() {
        System.out.print(this.getBread());
        System.out.print(" with ");
        System.out.print(this.getCondiments());
        System.out.print(" with ");
        System.out.print(this.getDressing());
        System.out.print(" with ");
        System.out.print(this.getMeat());
    }
}
