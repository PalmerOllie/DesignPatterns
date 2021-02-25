package designPatterns.structural.facadeExample;

public class CarEngine {
    FuelInjector fuelInjector = new FuelInjector();
    CoolingController coolingController = new CoolingController();
    AirFlowController airFlowController = new AirFlowController();

    public CarEngine() {}

    public FuelInjector getFuelInjector() {
        return fuelInjector;
    }

    public CoolingController getCoolingController() {
        return coolingController;
    }

    public AirFlowController getAirFlowController() {
        return airFlowController;
    }
}
