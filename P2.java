
import java.util.Scanner;

/*An old-style movie theater has a simple profit program. Each customer pays $5 per ticket. 
Every performance costs the theater $20, plus $.50 per attendee.Develop the program 
calculate TotalProfit that consumes the number of attendees (of a show) and calculates how 
much income the show earns. */

class calculateProfit {
    double profit(int cus) {
        double prof = 5 * cus - 20 - 0.5 * cus;
        return prof;
    }
}
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateProfit p = new calculateProfit();
        System.out.println("enter number of customer ");
        int customer = sc.nextInt();
        System.out.println("Total Profit : " + p.profit(customer));      
    }
}
