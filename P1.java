/*Demonstrate the use of ‘super’ and this keyword(constructor changing)
a) To refer to a member of super class.
b) To call super class constructor from sub class constructor. */

class Person{
    String pName;
    int age;

    public Person(String pName, int age) {
        this.pName = pName;
        this.age = age;
    }
}

class Student extends Person{
    String AdmissonNum;
    String div;
    String year;
    String department;

    public Student(String pName, int age, String AdmissonNum, String department) {
        super(pName, age);
        this.AdmissonNum = AdmissonNum;
        this.department = department;
        this.div = div;
    }

    void display(){
        System.out.println("Name : "+ pName);
        System.out.println("age : " + age);
        System.out.println("admission number : " + AdmissonNum);
        System.out.println("department : "+ department);
    }
}

public class P1 {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 19, "35425", "Mechanical Engineering");
        s1.display();
    }
}
