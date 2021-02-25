package designPatterns.structural.facadeExample;

import designPatterns.DesignPatternExample;
import designPatterns.creational.singletonExample.Singleton;

import java.util.List;

public class CarEngineFacade {
    private static int DEFAULT_COOLING_TEMP = 90;
    private static int MAX_ALLOWED_TEMP = 50;

    private CarEngine carEngine = new CarEngine();
    private FuelInjector fuelInjector;
    private AirFlowController airFlowController;
    private CoolingController coolingController;

    public CarEngineFacade() {
        fuelInjector = carEngine.getFuelInjector();
        airFlowController = carEngine.getAirFlowController();
        coolingController = carEngine.getCoolingController();
    }

    public void StartEngine() {
        System.out.println("Engine starting...");
        fuelInjector.on();
        coolingController.on();
        airFlowController.on();
        airFlowController.takeAir();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();
        System.out.println();
    }

    public void stopEngine() {
        System.out.println("Engine stopping...");
        fuelInjector.off();
        coolingController.cool(MAX_ALLOWED_TEMP);
        coolingController.off();
        airFlowController.off();
        System.out.println();
    }

}
