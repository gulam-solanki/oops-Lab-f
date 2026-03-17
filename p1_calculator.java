import java.util.Scanner;
import mytools.calc;


public class p1_calculator {
    public static void main(String[] args) {
        System.out.print("enter two numbers a and b : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum of a and b : "+calc.sum(a,b));
        System.out.println("difference of a and b : "+calc.difference(a, b));
        System.out.println("product of a and b : "+calc.product(a,b));
        System.out.println("quotiont of a and b : "+calc.quotiont(a,b));
    }
}
