/*Define an abstract class called Figure having following attribute pi of the data type double. The attribute pi have a value equal to 3.1420.It must have the following abstract methods .
public abstract void calcArea();public abstract void calcVol();
public abstract void DispArea();public abstract void Dispvol();
Design three classes cone , sphere and cylinder. Each of these classes must extend the Figure class
class name
Attribute
Cone
n,s of type double
Sphere
R
cylinder
h of type double
Define the inherited abstract methods in the subclass by using the given formulae and set the value of the inherited attribute a and v for area and volume, rspe. Define any constructor /method that may be necessary. Write a main method in a class called Demo and invoke the methods of each subclass. */

abstract class Figure{
    double pi=3.1420;
    double a,v;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void DispVol();
}

class Cone extends Figure{
    double r,h,s;
    Cone(double r,double h){
        this.r=r;
        this.h=h;
        this.s=Math.sqrt(r*r+h*h);
    }
    public void calcArea(){
        a=pi*r*s+pi*r*r;
    }
    public void calcVol(){
        v=(1/3.0)*pi*r*r*h;
    }
    public void DispArea(){
        System.out.println("Area of Cone: "+a);
    }
    public void DispVol(){
        System.out.println("Volume of Cone: "+v);
    }
}

class Sphere extends Figure{
    double r;
    Sphere(double r){
        this.r = r;
    }
    public void calcArea(){
        a = 4*pi*r*r;
    }
    public void calcVol(){
        v = (4.0/3.0)*pi*r*r*r;
    }
    public void DispArea(){
        System.out.println("Area of Sphere: "+a);
    }
    public void DispVol(){
        System.out.println("Volume of Sphere: "+v);
    }
}

class Cylinder extends Figure{
    double r,h;
    Cylinder(double r,double h){
        this.r=r;
        this.h=h;
    }
    public void calcArea(){
        a=2*pi*r*h+2*pi*r*r;
    }
    public void calcVol(){
        v=pi*r*r*h;
    }
    public void DispArea(){
        System.out.println("Area of Cylinder: "+a);
    }
    public void DispVol(){
        System.out.println("Volume of Cylinder: "+v);
    }
}
public class P2_AbstractDemo {
    public static void main(String[] args) {
        Cone c = new Cone(3,4);
        c.calcArea();
        c.calcVol();
        c.DispArea();
        c.DispVol();

        Sphere s = new Sphere(5);
        s.calcArea();
        s.calcVol();
        s.DispArea();
        s.DispVol();

        Cylinder cy = new Cylinder(3,4);
        cy.calcArea();
        cy.calcVol();
        cy.DispArea();
        cy.DispVol();
    }
}
