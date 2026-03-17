
import java.util.Scanner;

/*Create a washing machine class with methods as switchOn, acceptClothes, acceptDetergent, switchOff. acceptClothes accepts the 
noofClothes as argument & returns the no of Clothes. */
class WashingMachine {
    void switchOn() {
        System.out.println("Washing Machine Switch On");
    }

    int acceptClothes(int c) {
        System.out.println("cloths accepted");
        return c;
    }

    void switchOff() {
        System.out.println("Washing Machine Switch Off");
    }
}

public class P3_WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WashingMachine w = new WashingMachine();
        w.switchOn();
        System.out.println("enter number of cloths ");
        int c = sc.nextInt();
        System.out.println(w.acceptClothes(c));
        w.switchOff();
    }
}
