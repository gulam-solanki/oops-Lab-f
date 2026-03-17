/*Create an abstract class car contains an instance variable .one concrete method and two abstract method.Maruti and santro are 
subclass implements the abstrat method of super class and methods are avg() and mode().Create a class Car1 to use all the 
features of abstract method by creating a reference to it and referring to the subclass object. */

abstract class Car {
    int noOfWheels;

    Car(int w) {
        this.noOfWheels = w;
    }
    abstract int avg();

    abstract String mode();
}

class Maruti extends Car {

    public Maruti() {
        super(4);
    }
    
    int avg() {
        System.out.println("average "+15);
        return 15;
    }

    String mode() {
        System.out.println("Manual");
        return "Manual";
    }
}

class Santro extends Car {
    public Santro() {
        super(4);
    }
    int avg() {
        System.out.println("average "+12);
        return 12;
    }

    String mode() {
        System.out.println("Automatic");
        return "Automatic";
    }
}

public class P4_Car {
    public static void main(String[] args) {
        Maruti c1 = new Maruti();
        c1.avg();
        c1.mode();

        Santro c2 = new Santro();
        c2.avg();
        c2.mode();
    }
}
