/*Define a class named Course having data members ID, Description, Duration and Fees. The class should have one parametrized 
constructors and GetData() function member to display the data. Create an array of 5 course objects and then display the data for 
all of them. */

class Course{
    String ID;
    String Description;
    String Duration;
    String Fees;
    public Course(String iD, String description, String duration, String fees) {
        ID = iD;
        Description = description;
        Duration = duration;
        Fees = fees;
    }


    void GetData(){
        System.out.println("Member ID : "+ this.ID);
        System.out.println("Description : "+ Description);
        System.out.println("Duration : "+ this.Duration);
        System.out.println("Fees : "+ this.Fees);
    }
    
}

public class P6_CourseDemo {
    public static void main(String[] args) {
        Course [] c = new Course[5];

        c[0] = new Course("4577747", "artificial inteligence", "4 years", "50000");
        c[1] = new Course("4562645", "Mechanical Engineering", "4 years", "40000");
        c[2] = new Course("2456347", "Electrical Engineering", "4 years", "30000");
        c[3] = new Course("2364356", "Electronics Engineering", "4 years", "50000");
        c[4] = new Course("8568584", "Chemical Engineering", "4 years", "50000");
        
        for(Course co : c){
            co.GetData();
        }
    }
}
