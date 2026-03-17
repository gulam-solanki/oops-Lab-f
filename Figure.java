package FigPackage;

abstract class Figure {
    double r, a, v;
    double pi = 3.1428;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void DispVol();   
}

class Cone extends Figure{
    double h, s;
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