
import java.util.Scanner;

/*Q7.)A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an
additional $0.50 per hours for each hours or part thereof in excess of three hours. The maximum charge for any
given 24-hours period is $10.00.Assume that no car parks for longer than 24 hours at a time. Write an application
that calculates and displays the parking charges for each customers who parked in the garage yesterday. You
should enter the hours parked for each customers . The program should display the charge for the current
customers and should calculate and display the running total os yesterday's receipts. It should use the method
calculate charges to determine the charge for each customer. */

class Customer{

   int hour;

    Customer() {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter number of hours car parked : ");
        // this.hour = sc.nextInt();
        }
    
    void calculateCharges(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of hours car parked : ");
        this.hour = sc.nextInt();
        double charges;
        charges = this.hour*0.5;
        if(charges<2){
            System.out.println("number of hours = "+this.hour);
            System.out.println("charges : "+ 2+" $");
            return;
        }
        else if(charges>10){
            System.out.println("number of hours = "+this.hour);
            System.out.println("charges : "+ 10+" $");
            return;  
        }
            System.out.println("number of hours = "+this.hour);
            System.out.println("charges : "+ charges+" $");
            return;
    }
}


public class P7_ParkingCharges {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        c1.calculateCharges();
    }
}
