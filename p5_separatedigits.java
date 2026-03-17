
import java.util.Scanner;

public class p5_separatedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a five digits number : ");
        int num = sc.nextInt();
        if(num/10000 >10 | num/10000 == 0){
            System.out.println("invalid number !!");
            return;
        } 
        int q = 10000;
        for(int i = 0; i<5; i++){
            System.out.print(num/q + "   ");
            num = num%q;
            q = q/10;
        }
    }
}
