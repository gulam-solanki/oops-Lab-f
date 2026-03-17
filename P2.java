
import java.util.Scanner;

class checkHexadecimal {

    boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            char t = s.toUpperCase().charAt(i);
            if (t >= 'A' && t <= 'F' || t >= '0' && t <= '9') {

            } else {
                return false;
            }
        }
        return true;
    }
}

public class P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        String s = sc.next();
        checkHexadecimal c = new checkHexadecimal();
        if (c.check(s)) {
            System.out.println("it is hexadecimal"); 
        }else {
            System.out.println("it is not hexadecimal number");
        }
    }
}
