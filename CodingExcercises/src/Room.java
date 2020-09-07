

public class Room {
    private Door door;
    private TWindow window;
    private Light light;


    public Room(Door door, TWindow window, Light light) {
        this.door = door;
        this.window = window;
        this.light = light;

    }

    public void SwitchLight(){

        System.out.println("Light Switched ON " );
     light.light();
    }

    public Door getDoor() {
        return door;
    }

    public TWindow getWindow() {
        return window;
    }

    public Light getLight() {
        return light;
    }


}
