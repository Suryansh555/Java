public class RoomFunction {
    public static void main(String args[]) {
        Door Main = new Door(new TDimension(25, 25, 10), 2);
        TWindow window = new TWindow(new TDimension(25, 10, 5), 4);
        Light main = new Light("Eros", 3);
        Room Hall = new Room(Main, window, main);

        Hall.SwitchLight();
        Hall.getLight().light();
    }
}
