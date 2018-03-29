package mediator;

import java.util.List;

public class Mediator {

    private List<Light> lights;

    public Mediator(List<Light> lights) {
        this.lights = lights;
    }

    public void lightsOn(){
        for (Light light : lights){
            if (!light.isOn()) light.on();
        }
    }
}
