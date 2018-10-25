package inheritance;

public class Porsche extends Car {
    private String model;

    public Porsche(int g, String st, double s, String m){
        super(g,st,s);
        this.model = m;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void changeGear(int gear){
        this.setGearNumber(gear);
        System.out.println("You changed your Porsche's gear number " + gear);
    }

    @Override
    public void changeDirection(String direction){
        this.setSteering(direction);
        System.out.println("You changed your Porsche's direction to " + direction);
    }

    @Override
    public void changeSpeed(double speed){
        this.setSpeed(speed);
        System.out.println("You changed your Porsche's speed to " + speed + " km/h");
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "gearNumber=" + this.getGearNumber() +
                ", steering='" + this.getSteering() + '\'' +
                ", speed=" + this.getSpeed() +
                "model='" + model + '\'' +
                '}';
    }
}
