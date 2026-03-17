
import java.util.Scanner;

public class p2_large{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is larger");
        }
        else if(b>a){
            System.out.println(b+" is larger");
        }
        else{
            System.out.println("the numbers are equal");
        }
    }
}