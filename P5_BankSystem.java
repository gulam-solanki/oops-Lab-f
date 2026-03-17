

/*Create a Bank class with methods deposit & withdraw. The deposit method would accept attributes amount & balance & returns the 
new balance which is the sum of amount & balance. Similarly, the withdraw method would accept the attributes amount & balance & 
returns the new balance ‘balance – amount’ if balance > = amount or return 0 otherwise. */

import java.util.Scanner;

class Bank {
    double deposit(double amount, double balence) {
        return amount + balence;
    }

    double withdraw(double amount, double balance) {
        if (balance >= amount) {
            return balance - amount;
        }
        else {
            return 0;
        }
    }
}

public class P5_BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();
        System.out.println("deposit method");
        System.out.println("enter amount and balance respectively");
        double am = sc.nextDouble();
        double bl = sc.nextDouble();
        System.out.println("new Balance : " + b.deposit(am, bl));
        
        System.out.println("withdraw method");
        System.out.println("enter amount and balance respectively");
        double am2 = sc.nextDouble();
        double bl2 = sc.nextDouble();
        System.out.println("new Balance : "+b.withdraw(am2, bl2));

    }
    
}
