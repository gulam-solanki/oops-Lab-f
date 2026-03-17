
import java.util.Scanner;

public class P7_Grade {
    public static void main(String[] args) {
        // char[] correct = {'C', 'A', 'B', 'D'};
        String correct = "CABD";

        Scanner sc = new Scanner(System.in);
        String ans;
        int cor = 0;
        int incor = 0;
        System.out.println("enter your Answers ");
        ans = sc.next();

        System.out.println("Question "+ "Submitted "+ " Correct "+ "Result");
        for(int i = 0; i<4; i++){
            if(ans.charAt(i) == 'X'){
                System.out.printf("%d         %c          %c      Not Attempt\n",i+1, ans.charAt(i), correct.charAt(i));
            }
            else if(ans.charAt(i) == correct.charAt(i)){
                cor++;
                System.out.printf("%d         %c          %c      Correct\n",i+1, ans.charAt(i), correct.charAt(i));
            }
            else{
                incor++;
                System.out.printf("%d         %c          %c      Wrong\n",i+1, ans.charAt(i), correct.charAt(i));
            }
        }
        System.out.println("No of Correct "+ cor);
        System.out.println("No of Wrong "+ incor);
        if(cor >= 2){
            System.out.println("The candidate passed");
        }
        else{
            System.out.println("The Candidate Failed");
        }
    }
}
