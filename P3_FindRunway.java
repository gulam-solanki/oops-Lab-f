
import java.util.Scanner;

public class P3_FindRunway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter speed and accelaration : ");
        double v = sc.nextDouble();
        double a = sc.nextDouble();
        if(v<0  || a<0){
            System.out.println("speed and accelaration cannot be negative");
            return;
        }
        double l = v*v/(2*a);
        System.out.println("minimum run way length for the plane is "+ l);
    }
}
