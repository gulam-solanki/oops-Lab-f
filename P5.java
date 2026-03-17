
import java.util.Scanner;

/*Utopias tax accountants always use programs that compute income taxes even though the tax rate is a solid, never- changing 15%.
Define the program calculate Tax which determines the tax on the gross pay. Define calculate NetPay that determines the net pay 
of an employee from the number of hours worked. Assume an hourly rate of $12. */

class Calculate{
    double netpay(double hours){
       double gros = 12*hours;
       double net = gros - gros*15/100;
       return net;
    }
}
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of hours worked ");
        double hours = sc.nextDouble();
        Calculate c = new Calculate();
        double net = c.netpay(hours);
        System.out.println("net pay is "+net);
    }
}
