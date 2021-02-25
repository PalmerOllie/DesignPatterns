package designPatterns.behavioral.commandExample;

//Invoker
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
