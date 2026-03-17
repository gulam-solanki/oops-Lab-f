
import java.util.Scanner;

public class p4_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius of circle : ");
        int r = sc.nextInt();      //r -> radius
        float pi = 3.14159f;
        int diameter = 2*r;
        float circumfarance = 2*pi*r;
        float area = pi*r*r;
        System.out.println("diameter of the circle : "+diameter);
        System.out.println("circumfarance of the circle : "+circumfarance);
        System.out.println("area of the circle : "+area);
    }
}
