package designPatterns.behavioral.commandExample;

import designPatterns.DesignPatternExample;

import java.util.ArrayList;
import java.util.List;

//Client
public class CommandExample extends DesignPatternExample {
    @Override
    protected void run() {
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command onCommand = new OnCommand(bedroomLight);
        lightSwitch.storeAndExecute(onCommand);

        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitchenLight);

        Command allLightsOffCommand = new AllLightsOffCommand(lights);
        lightSwitch.storeAndExecute(allLightsOffCommand);


        System.out.println("\n\n\nHere we use a 'Command' interface to generalise instructions into nicely packaged objects.");
        System.out.println("We use a the Light class as a receiver and a Switch which is an invoker of Commands");
        System.out.println("In this way the sender is decoupled from the processor of commands");

        System.out.println("This system is easily extended, as you can see when we added the AllLightsOff command.");
        System.out.println("One downside of this OOP approach is that we need a new object per new command.");

    }
}
