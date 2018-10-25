import inheritance.*;
import barking.*;
import equal.*;
import minutes.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inheritance \n----------------------\n");
        Vehicle a = new Car(4, "front", 45.5);
        Vehicle b = new Car(4, "left", 50);
        Car c = new Porsche(4,"right", 70, "Cayman");
        Porsche d = new Porsche(4, "left", 100, "Panamera");

        a.changeDirection("right");
        a.changeGear(3);
        System.out.println(a.toString());

        b.changeSpeed(100);

        c.changeDirection("left");
        c.changeGear(2);
        c.changeSpeed(100);

        d.changeDirection("front");
        d.changeGear(1);
        d.changeSpeed(150);

        System.out.println("\n\nBarking \n----------------------\n");
        DogBarking dog = new DogBarking();
        if(dog.bark(true, 2))
            System.out.println("Wake up!");
        if(dog.bark(false, 8))
            System.out.println("Wake up!");
        if(dog.bark(true, 25))
            System.out.println("Wake up!");

        System.out.println("Equal Sum Checker\n----------------------\n");

        EqualChecker eq = new EqualChecker();
        System.out.println(eq.hasEqualSum(1,1,1));
        System.out.println(eq.hasEqualSum(1,-1,0));
        System.out.println(eq.hasEqualSum(1,1,2));

        System.out.println("Minutes to Years and Days\n----------------\n");

        MinutesToYears min = new MinutesToYears();
        min.printYearsAndDays(525600);
        min.printYearsAndDays(1051200);
        min.printYearsAndDays(561600);

    }
}
