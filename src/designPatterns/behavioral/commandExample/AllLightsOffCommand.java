package designPatterns.behavioral.commandExample;

import java.util.List;

public class AllLightsOffCommand implements Command {
    List<Light> lights;

    public AllLightsOffCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        System.out.println("AllLightsOffCommand:");
        for(Light light : lights) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }
}
