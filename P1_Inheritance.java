
import java.util.Scanner;

/*Q1.)Design a class called figure . It must have three attributes r,aand v of the data type douoble.It must have the following methods:
public void dispArea(); public void dispVolume();
The method dispArea must have a statement to print the volume of a. The method dispVolume();
must have a statement to print the value of v.Design a class cone . It must extends class figure class .It must also have the following attributes h,s of type double.It must have following methods:
public void calcArea();public void calcVolume();
The formulae for the area and volume of the cone are as follows:
Area of a cone(p*r*s)+(p*r*s)
volume of a con=(p*r*s)/3
Write a main method in a class called inheritance demo to demonstrate inheritance. */

class Figure{
    double r, a, v;
    public void dispArea(){
        System.out.println("The Area is " + this.a);
    }

    public void dispVolume(){
        System.out.println("The Volume is " + this.v);
    }
}

class Cone extends Figure{
    double h, s;
    Scanner sc = new Scanner(System.in);

    public Cone() {
        System.out.print("enter radius of cone : ");
        this.r = sc.nextDouble();
        System.out.print("enter height of cone : ");
        this.h = sc.nextDouble();
        System.out.print("enter lateral length : ");
        this.s = sc.nextDouble();
    }
    
    public void calcArea(){
        this.a = Math.PI*this.r*this.s + Math.PI*this.r*this.r;
    }

    public void calcVolume(){
        this.v = Math.PI*this.r*this.r*this.h/3;
    }
}

public class P1_Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cone c = new Cone();
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();
        
    }
}
