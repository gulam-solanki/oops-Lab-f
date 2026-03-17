
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans[] = { 'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A' };
        System.out.println("enter answer ");
        char quiz[] = new char[8];

        for (int i = 0; i < 8; i++) {
            quiz[i] = sc.next().toUpperCase().charAt(0);
        }

        System.out.println("Question SubmitedAns CorrectAns Result");
        for (int i = 0; i < 8; i++) {
            String result ;
            if(quiz[i] == ans[i]) result = "correct";
            else if (quiz[i] == 'X')
                result = "unanswered";
            else
                result = "incorrect";
            System.out.println((i+1)+"\t     "+quiz[i]+"\t        "+ans[i]+"\t"+result);
        }
    }
}
