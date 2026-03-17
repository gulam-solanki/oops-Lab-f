
import java.util.Scanner;

/*Createa class called Student which has the following methods: i). Average: which would accept marks of 3 examinations & return whether the student has passed or failed Depending on whether he has scored an average above 50 or not.
ii). Input name: which would accept the name of the student & returns the name. */
class Student{
    boolean average(int m1, int m2, int m3){
        int avg = (m1 + m2 + m3)/3;
        if(avg<50) return false;
        else return true;
    }
    String inputName(String name){
        return name;
    }
}
public class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("enter marks of student");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        System.out.println("enter the name of the student");
        String name = sc.nextLine();
        if(s.average(m1, m2, m3)){
            System.out.println("the student passed \nname : "+ s.inputName(name));
        }
    }
}
