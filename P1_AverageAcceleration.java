
import java.util.Scanner;

public class P1_AverageAcceleration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter v0, v1 and t");
        double v0 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double t = sc.nextDouble();
        if(t<0){
            System.out.println("time cannot be negative");
            return;
        }
        double acc = (v1-v0)/t;
        System.out.println("acceleration : "+ acc);
    }
}
