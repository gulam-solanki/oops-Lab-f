
import java.util.Scanner;

/*Image a queue of people standing at the bus stand to buy tickets .whenever a person buys a ticket,
he leaves the queue and all the remaining people take one step forward.any new person joins the 
queue at the back.implement the above queue for integer in the folowing mannerdefine an interface 
named QueueImpl that will have method to insert into the queue ,delete from the queue and display 
the integer currently present int the queue.let a class calleld QueueDemo implement the interface .
Make your own provisions for exception handaling in case of overflow and underflow condation use an 
array (with maximum size 10) to hiuse the queue. Write a single main program ti demonstrate the 
insert ,delete and display operations as well as the Exception handaling in case of overflow and 
underflow condation. */

interface QueueImpl {
    void insert(int val);

    void delete();

    void displaycurr();
}

class QueueDemo implements QueueImpl {
    int arr[] = new int[10];
    int curr = -1;

    public void insert(int val) {
        // if (curr == 9) {
        //     System.out.println("overflow");
        // }
        try {
            curr++;
            arr[curr] = val;
        } 
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("overflow");
        }
    }

    
    public void delete() {
        if (curr < 0) {
            System.out.println("underflow");
            return;
        }
        curr--;
    }

    public void displaycurr() {
        if (curr < 0) {
            System.out.println("No elements");
            return;
        }
        System.out.println(arr[curr]);
    }
}
class P1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueDemo q = new QueueDemo();
        while(true){
            System.out.print("enter element(-1 to terminate) : ");
            int x = sc.nextInt();
            if(x == -1) break;
            q.insert(x);
        }
        
        System.out.println("curr ");
        q.displaycurr();
        System.out.println("after delete");
        q.delete();
        q.displaycurr();
    }
}