
import java.util.Scanner;

public class P2_CalculateEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount of water in kilograms : ");
        double m = sc.nextDouble();
        if(m<0){
            System.out.println("mass cannot be negative");
            return;
        }
        System.out.println("enter initial temparature");
        double t1 = sc.nextDouble();
        System.out.println("enter final temparature");
        double t2 = sc.nextDouble();
        double q = m*(t2-t1)*4184;
        System.out.println("The energy needed is : "+ q);
    }
}
