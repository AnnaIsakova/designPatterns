package mediator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        Mediator mediator = new Mediator(Arrays.asList(bedroomLight, kitchenLight));

        Command allLightsOn = new AllLightsOnCommand(mediator);

        Switch switcher = new Switch();
        switcher.storeAndExecute(allLightsOn);
    }
}
