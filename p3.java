
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        System.out.println("enter three numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        float avg = sum/3.0f;
        int product = a*b*c;
        int largest;
        int smallest;

        largest = a;
        if(b>largest) largest = b;
        if(c>largest) largest = c;

        smallest = a;
        if(b<smallest) smallest = b;
        if(c<smallest) smallest = c;

        System.out.println("sum of numbers : "+sum);
        System.out.println("average of numbers : "+avg);
        System.out.println("product of numbers : "+product);
        System.out.println("largest : "+largest);
        System.out.println("smallest : "+smallest);
    }
}
