
import java.util.Scanner;

/*Create Product having following attributes: Product ID, Name, Category ID and UnitPrice. Create ElectricalProduct having the 
following additional attributes: VoltageRange and Wattage. Add a behavior to change the Wattage and price of the electrical 
product. Display the updated ElectricalProduct details. */
class Product{
    String id;
    String name;
    String catId;
    double unitPrice;
}

class ElectricalProduct extends Product{
    double voltageRange;
    double wattage;
    Scanner sc = new Scanner(System.in);
    ElectricalProduct(){
        System.out.println("enter Product ID ");
        this.id = sc.next();
        System.out.println("enter Product Name");
        this.name = sc.next();
        System.out.println("enter Category ID");
        this.catId = sc.next();
        System.out.println("enter Unit Price");
        this.unitPrice = sc.nextDouble();
        System.out.println("enter voltage range");
        this.voltageRange = sc.nextDouble();
        System.out.println("enter wattage");
        this.wattage = sc.nextDouble();
    }

    void display(){
        System.out.println("Product Id "+ id);
        System.out.println("Product Name "+ name);
        System.out.println("category ID "+ catId);
        System.out.println("Unit Price "+ unitPrice);
        System.out.println("Voltage range "+ voltageRange);
        System.out.println("Wattage "+ wattage);

    }

    void setWattage(double  w){
        wattage = w;
    }
    double getWattage(){
        return wattage;
    }

    void setPrice(double p){
        unitPrice = p;
    }
    double getPrice(){
        return unitPrice;
    }
    
}
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricalProduct e = new ElectricalProduct();
        e.display();
       
        System.out.println("enter new Wattage");
        double w = sc.nextDouble();
        e.setWattage(w);

        System.out.println("enter new price");
        double p = sc.nextDouble();
        e.setPrice(p);

        e.display();
    }
}
