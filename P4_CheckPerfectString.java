/*You have to enter a string and check whether it is a perfect string or not. A perfect string is a string which has occurance of 
every character only once. */

import java.util.Scanner;

public class P4_CheckPerfectString {

    public static boolean checkPerfectString(String test){
        test = test.toLowerCase();
        int ar[] = new int[26];
        for(int i = 0; i<test.length();i++){
            char temp = test.charAt(i);
            ar[temp - 'a']++;
            if(ar[temp - 'a'] > 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int temp = 1;
        while(temp != 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter String : ");
            String test = sc.next();            
            System.out.println(checkPerfectString(test));
            System.out.println("enter 1 to continue or 0 to terminate");
            temp = sc.nextInt();
        }
    }
}
