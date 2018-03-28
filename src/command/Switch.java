package command;

public class Switch {

    private Command command;

    public void storeAndExecute(Command command){
        command.execute();
    }
}
