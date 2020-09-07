public class Vehicle {
private String name;
private String Size;

private int currentVelocity;
private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.Size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int Direction){
        this.currentDirection += Direction;
        System.out.println("Vehicle.steer() called  Steering at " + this.currentDirection );

    }

    public void move (int velocity , int direction){
        this.currentVelocity = velocity ;
        this.currentDirection = direction ;
        System.out.println("Vehicle.move(): Moving At " + currentVelocity + "in direction of " + currentDirection);

    }

    public void stop(){
        this.currentVelocity = 0;
    }
}
