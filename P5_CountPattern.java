
import java.util.Scanner;

/*you have to enter a range from a and b and search how many no. of times a pattern n. occurs between the range a and b. Eg :i/p:enter range :0 100 Enter pattern: 13 o/
p: the no. times 13 occurred betwwn 0 to 100:1 Eg :i/p:enter range :100 1000 Enter pattern: 13 o/p: the no. times 13 occurred betwwn 100 to 1000: (in this 13,113,131,
132,133.139,213,313,.913 all these will be counted) */
public class P5_CountPattern {

    public static int countPattern(int a, int b, int n){
        int count = 0;
        String pattern = String.valueOf(n);
        for(int i = a; i<=b; i++){
            if(String.valueOf(i).contains(pattern)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a, b, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range from : ");
        a = sc.nextInt();
        System.out.print("Enter range to : ");
        b = sc.nextInt();
        System.out.print("Enter Pattern : ");
        n = sc.nextInt();
        System.out.print("The no. of times "+ n +" occured between "+a+" to "+b+":");
        System.out.println(countPattern(a, b, n));
    }
}
