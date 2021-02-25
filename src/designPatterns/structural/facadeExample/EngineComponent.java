package designPatterns.structural.facadeExample;

public abstract class EngineComponent {
    public void on() {
        System.out.println(this.getClass().getSimpleName() + " ON.");
    }

    public void off() {
        System.out.println(this.getClass().getSimpleName() + " OFF.");
    }

    public void run() {
        System.out.println(this.getClass().getSimpleName() + " RUNNING.");
    }
}
