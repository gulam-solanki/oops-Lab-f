/*Write a class vehicle .Define suitable attributes and methods. Write subclasses of Vehicle like Car, Bicycle, Scooter.
Assume suitable required attributes. Write constructor for each and define a method maxSpeed() in each class
Which prints the maximum speed of the vehicle? (Use of super keyword is expected in the constructor of inherited classes). */

abstract class Vehicle{
    int noOfWheels;
    int noOfSeats;
    int max;
    abstract void startVehicle();
    abstract void maxSpeed();

    public Vehicle(int w, int s, int max) {
        this.noOfWheels = w;
        this.noOfSeats = s;
        this.max = max;
    }

    
}

class Car extends Vehicle{

    public Car(int w, int s, int max) {
        super(w, s, max);
    }
    
    void startVehicle(){
        System.out.println("Car is started");
    }

    void maxSpeed(){
        System.out.println("max speed is : "+ max);
    }
    
};

class Bicycle extends Vehicle{

    public Bicycle(int w, int s, int max) {
        super(w, s, max);
    }
    
    void startVehicle(){
        System.out.println("No need to start Bicycle ");
    }
    void maxSpeed(){
        System.out.println("max speed is : "+ max);
    }
    
};

class Scooter extends Vehicle{

    public Scooter(int w, int s, int max) {
        super(w, s, max);
    }
    
    void startVehicle(){
        System.out.println("Scooter is started");
    }
    void maxSpeed(){
        System.out.println("max speed is : "+ max);
    }
    
}
public class P2_VehicleDemo {
    public static void main(String[] args) {
        Car Defender = new Car(4,7, 220);
        System.out.println("no Of wheels "+Defender.noOfWheels);
        System.out.println("no of seats "+ Defender.noOfSeats);
        Defender.startVehicle();
        Defender.maxSpeed();

        Bicycle b1 = new Bicycle(2,1,50);
        System.out.println("no Of wheels "+b1.noOfWheels);
        System.out.println("no of seats "+ b1.noOfSeats);
        b1.startVehicle();
        b1.maxSpeed();

        Scooter Activa = new Scooter(2,2, 150);
        System.out.println("no Of wheels "+Activa.noOfWheels);
        System.out.println("no of seats "+ Activa.noOfSeats);
        Activa.startVehicle();
        Activa.maxSpeed();
    }
}
