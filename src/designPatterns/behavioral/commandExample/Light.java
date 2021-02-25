package designPatterns.behavioral.commandExample;

//Reciever
public class Light {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if(isOn) {
            off();
        }
        else {
            on();
        }
        isOn = !isOn;
    }


    public void on() {
        System.out.println("Light switched on.");
    }

    public void off() {
        System.out.println("Light switched off.");
    }
}
