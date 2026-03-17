
import java.util.Scanner;

/*Define a class called fruit with the following attributes :
1. Name of the fruit.
2. Single fruit or bunch fruit.
3. Price.
Define a suitable constructor and displayFruit() method that displays values of all the
attributes. Write a program that creates 2 objects of fruit class and display their attributes. */

class Fruit{
    String name;
    String type;
    double price;
    Scanner sc = new Scanner(System.in);

    Fruit() {
        System.out.println("enter name of the fruit");
        name = sc.next();
        System.out.println("enter single or bunch");
        type = sc.next();
        System.out.println("enter price ");
        price = sc.nextDouble();
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println(type);
        System.out.println("price : "+price);
    }
    
}
public class P4 {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.display();
        Fruit f2 = new Fruit();
        f2.display();
    }
}
