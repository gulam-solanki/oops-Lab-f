/*A string is entered like aabcdeaabcjlkjerwlaaabbsadfdsf... And you have to print those characters which exceed a given no. n 
entered by user. */

import java.util.Scanner;

public class P3_PrintExceedChar {
    public static void printExceedChar(String test, int n){
        test = test.toLowerCase();
        int ar[] = new int[26];
        for(int i = 0; i<test.length();i++){
            char temp = test.charAt(i);
            ar[temp - 'a']++;
        }

        for(char c = 'a'; c<='z'; c++){
            if(ar[c-'a']>n){
                System.out.println(c);
            }
        }
    }
    public static void main(String[] args) {
        int temp = 1;
        int n;
        while(temp != 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter String : ");
            String test = sc.next();
            System.out.print("Enter n : ");
            n = sc.nextInt();
            printExceedChar(test, n);
            System.out.println("enter 1 to continue or 0 to terminate");
            temp = sc.nextInt();
        }
    }
}