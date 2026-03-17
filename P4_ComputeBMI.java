
import java.util.Scanner;

public class P4_ComputeBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        double w = sc.nextDouble();
        if(w<0){
            System.out.println("weight cannot be negative");
            return;
        }
        System.out.print("Enter height in inches : ");
        double h = sc.nextDouble();
        w = w * 0.45359237;
        h = h * 0.0254;
        double bmi = w/(h*h);
        System.out.println("BMI is "+bmi);
    }
}
