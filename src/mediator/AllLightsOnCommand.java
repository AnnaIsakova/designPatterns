package mediator;

import java.util.List;

public class AllLightsOnCommand implements Command {

    private Mediator mediator;

    public AllLightsOnCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.lightsOn();
    }
}
