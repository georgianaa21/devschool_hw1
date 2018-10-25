package inheritance;

public class Car extends Vehicle {
    private int gearNumber;
    private String steering;
    private double speed;

    public Car(int g, String st, double s) {
        this.gearNumber = g;
        this.steering = st;
        this.speed = s;
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void changeGear(int gear){
        this.gearNumber = gear;
        System.out.println("You changed gear number " + gear);
    }

    public void changeDirection(String direction){
        this.steering = direction;
        System.out.println("You changed the direction to " + direction);
    }

    public void changeSpeed(double speed){
        this.speed = speed;
        System.out.println("You changed the speed to " + speed + " km/h");
    }

    @Override
    public String toString() {
        return "Car{" +
                "gearNumber=" + gearNumber +
                ", steering='" + steering + '\'' +
                ", speed=" + speed +
                '}';
    }
}
