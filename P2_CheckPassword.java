/*We need to write the function to check the password entered is correct or not based on the following conditions. a) It must 
have atleast one lower case character and one digit. b) It must not have any Upper case characters and any special characters c) 
length should be b/w 5-12. d) It should not have any same immediate patterns like abcanan1 : not acceptable coz of an an pattern 
abc11se: not acceptable, coz of pattern 11 123sd123 : acceptable, as not immediate pattern adfasdsdf : not acceptable, as no 
digits Aasdfasd12: not acceptable, as have uppercase character */

import java.util.Scanner;

public class P2_CheckPassword {

    public static boolean passwordValidator(String test){
        int len = test.length();
        if(len < 5 || len > 12){
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for(int i = 0; i<test.length(); i++){
            char t = test.charAt(i);
            if(t>='a' && t<= 'z'){
                hasLower = true;
            }
            else if(t>='0' && t<='9'){
                hasDigit = true;
            }
            else if(t>='A' && t<='Z'){
                hasUpper = true;
            }
            else{
                hasSpecialChar = true;
            }
        }
        if(!hasLower || !hasDigit || hasUpper || hasSpecialChar){
                return false;
            }

        String t1, t2;
        for(int i = 1; i<len/2; i++){
            for(int j = 0; j + 2*i<=len; j++){
                t1 = test.substring(j, j + i);
                t2 = test.substring(j + i, j+ 2*i);
                if(t1.equals(t2)){
                    return false;
                }
            }
        }

        return true;

    }
    public static void main(String[] args) {
        int temp = 1;
        System.out.println("enter password you want to validate");
        while(temp != 0){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter password : ");
            String test = sc.next();
            System.out.println(passwordValidator(test));
            System.out.println("enter 1 to continue or 0 to terminate");
            temp = sc.nextInt();
        }
    }
}