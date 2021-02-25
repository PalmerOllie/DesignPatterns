package designPatterns.structural.facadeExample;

import designPatterns.DesignPatternExample;

public class FacadeExample extends DesignPatternExample {

    @Override
    protected void run() {
        CarEngineFacade carEngine = new CarEngineFacade();
        carEngine.StartEngine();
        //....
        ///Do some driving
        //...
        carEngine.stopEngine();

        System.out.println("\n\n\nThis pattern essentially wraps legacy code behind a class.");
        System.out.println("All complex interactions are abstracted away into that Facade class.");
        System.out.println("Here we have a CarEngine class with a complex setup for turning the engine on or off.");
        System.out.println("We move all the logic into neatly contained methods in the CarEngineFacade class.");
        System.out.println("Ideally we would refactor the CarEngine class itself to avoid the need for a Facade pattern, but sometimes Legacy code cannot be changed.");
        System.out.println("\n\nCheck the nonFacadeExample for how the code would be without the facade (interacting with the CarEngine class directly). Notice how the Facade pattern removes the need for a lot of specific details.");
    }




    ///See how all the code is in one method and you have to interact with all the details of the CarEngine
    private void nonFacadeExample() {
        CarEngine carEngine = new CarEngine();

        FuelInjector fuelInjector = carEngine.getFuelInjector();
        CoolingController coolingController = carEngine.getCoolingController();
        AirFlowController airFlowController = carEngine.getAirFlowController();

        //Start Engine - (might want very specific conditions or setup)
        fuelInjector.on();
        coolingController.on();
        airFlowController.on();
        airFlowController.takeAir();
        coolingController.setTemperatureUpperLimit(90);
        coolingController.run();

        //Engine Off
        fuelInjector.off();
        coolingController.cool(50);
        coolingController.off();
        airFlowController.off();
    }

}
