public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int HandSteering;
    private int Gears;
    private boolean manual;

    private int CurrentGear;


    public Car(String name, String size, int wheels, int doors, int handSteering, int gears, boolean manual ) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.HandSteering = handSteering;
        this.Gears = gears;
        this.manual = manual;

    }

    public void setCurrentGear(int currentGear) {
        this.CurrentGear = currentGear;
        System.out.println("Car.set: Car gear changed to " + currentGear);
    }

    public void ChangeVelocity(int speed , int direction){
        move(speed, direction);
        System.out.println("Car.changevelocity() Velocity "+ speed + " Direction " + direction);
    }
}
