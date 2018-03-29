package mediator;

public class Light {

    private boolean isOn = false;
    private String room;

    public Light(String room) {
        this.room = room;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn){
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println(this.room + " light's on");
    }

    public void off() {
        System.out.println(this.room + " light's off");
    }
}
