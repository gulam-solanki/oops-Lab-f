
import java.util.Scanner;

/*Create a class to model a point in 3D space. Data members x,y,z as coordinate of 3D point are of type int.
Constructors: To create 3D point represented the origin arbitrary point. Methods:
 i/p the coordinates of 3D point.
 o/p the coordinate of 3D point in the form(x,y,z).
 Compute distance between two points. */
class Model {
    int x;
    int y;
    int z;

    public Model() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter points x, y, z respectively");
        this.x = sc.nextInt();
        this.y = sc.nextInt();
        this.z = sc.nextInt();
    }

    void display() {
        System.out.println("Point (" + x + ", " + y + ", " + z + ")");
    }
    
    double distance(Model p2) {
        double dis = Math.sqrt(Math.pow(p2.x - x, 2) + Math.pow(p2.y - y, 2) + Math.pow(p2.z - z, 2));
        return dis;
    }
    
}
class P6_3DModel {
    public static void main(String[] args) {
        Model p1 = new Model();
        p1.display();
        Model p2 = new Model();
        p2.display();
        System.out.println("distance between two points : "+p1.distance(p2));
    }
}