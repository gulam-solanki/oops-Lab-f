
import java.util.Scanner;



/*Write a program to use ‘extends’ keyword to create student class by reusing Teacher class code.We should write only additional 
members in student class whih are not available in Teacher class. */

class Teacher{
    String name;
    int age;
    String id;
    String joiningDate;

    public Teacher() {
    }

    public Teacher(String n, int age, String idd, String Jd) {
        this.name = n;
        this.age = age;
        this.id = idd;
        this.joiningDate = Jd;
    }

    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :");
        this.name = sc.next();
        System.out.print("enter age :");
        this.age = sc.nextInt();
        System.out.print("enter ID :");
        this.id = sc.next();
        System.out.print("enter Joining Date :");
        this.joiningDate = sc.next();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+ age);
        System.out.println("ID : "+id);
        System.out.println("Joining Date : "+ joiningDate);
    }
};

class Student extends Teacher{
    String std;
    int roll;

    public Student() {
    }

    public Student(String n, int a, String i, String j, String std, int r, String JD) {
        super(n, a, i, JD);
        this.std = std;
        this.roll = r;
    }

    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :");
        this.name = sc.next();
        System.out.print("enter age :");
        this.age = sc.nextInt();
        System.out.print("enter ID :");
        this.id = sc.next();
        System.out.print("enter Joining Date :");
        this.joiningDate = sc.next();
        System.out.print("enter class :");
        this.std = sc.next();
        System.out.print("enter Roll Number :");
        this.roll = sc.nextInt();
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+ age);
        System.out.println("ID : "+id);
        System.out.println("Joining Date : "+ joiningDate);
        System.out.println("class : "+ std);
        System.out.println("Roll Number : "+ roll);
    }
}
public class P4_Student {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println("enter teacher info");
        t1.getInfo();
        t1.display();

        System.out.println("enter Student info");
        Student s1 = new Student();
        s1.getInfo();
        s1.display();
    }
}
