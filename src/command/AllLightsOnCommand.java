package command;

import java.util.List;

public class AllLightsOnCommand implements Command {

    private List<Light> lights;

    public AllLightsOnCommand(List<Light> lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light : lights){
            if (!light.isOn()) light.on();
        }
    }
}
