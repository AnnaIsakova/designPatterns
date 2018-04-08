package command;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        Command toggleBedroomLight = new ToggleLightCommand(bedroomLight);
        Command allLightsOn = new AllLightsOnCommand(Arrays.asList(bedroomLight, kitchenLight));

        Switch switcher = new Switch();
        System.out.println("======toggleBedroomLight======");
        switcher.storeAndExecute(toggleBedroomLight);
        switcher.storeAndExecute(toggleBedroomLight);
        switcher.storeAndExecute(toggleBedroomLight);
        switcher.storeAndExecute(toggleBedroomLight);
        System.out.println("=========allLightsOn==========");
        switcher.storeAndExecute(allLightsOn);
    }
}
