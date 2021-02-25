package designPatterns.structural.facadeExample;

public class CoolingController extends EngineComponent {
    public void setTemperatureUpperLimit(int degrees) {
        System.out.println("Upper Temperature set to: " + degrees + "'C.");
    }

    public void cool(int degrees) {
        System.out.println("Cooling Engine to: " + degrees + "'C.");
    }
}
