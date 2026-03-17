
import java.util.Scanner;

/*Create Book having following attributes: Book ID, Title, Author and Price. Create Periodical which has the following additional 
attributes: Period (weekly, monthly etc…) .Add a behavior to modify the Price and the Period of the periodical. Display the 
updated periodical details. */

class Book{
    String BookId;
    String Title;
    String Author;
    double price;

    public Book(String Author, String BookId, String Title, double price) {
        this.Author = Author;
        this.BookId = BookId;
        this.Title = Title;
        this.price = price;
    }    
}

class Periodical extends Book{
    String Period;

    public Periodical(String Author, String BookId, String Title, double price, String Period) {
        this.Period = Period;
        super(Author, BookId, Title, price);
    }

    public void setPeriod(String period) {
        Period = period;
    }
    public void setPrice(double p) {
        price = p;
    }
    
    void display(){
        System.out.println("Name of the Author : "+ Author);
        System.out.println("Book Id : "+ BookId);
        System.out.println("Book Title : "+ Title);
        System.out.println("Price : "+ price);
        System.out.println("Period : "+ Period);
    }
}

public class P3_ImplementBook {
    public static void main(String[] args) {
        Periodical b1 = new Periodical("Robert Grenee", "3455934", "Mastery", 890, "Monthly");
        b1.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter new Period : ");
        String Per = sc.next();
        System.out.println("enter new Price : ");
        double pr = sc.nextDouble();
        b1.setPeriod(Per);
        b1.setPrice(pr);
        System.out.println("after modification ");
        b1.display();
    }
}
