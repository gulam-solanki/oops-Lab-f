/*Suppose it is required to build a project consisting of a number of classes possibly using a large number of programmers.It is 
necessary to make sure that every class from whih all the other classes in the project will be inherited .Since any new classes 
in the project must inherit from the base class .Programmers are not free to create any interface.Therefore,it can be guaranted 
that all the classes in the project will respond to the same debugging commands. */

abstract class ProjectBase{
    void debug(){
        System.out.println("Debugging....");
    }

    abstract void execute();
    
}

class EmployeA extends ProjectBase{

    @Override
    void execute() {
        System.out.println("Employe A is executing !");
    }
    
}


class EmployeB extends ProjectBase{

    @Override
    void execute() {
        System.out.println("Employe B is executing !");
    }
    
}

class EmployeC extends ProjectBase{

    @Override
    void execute() {
        System.out.println("Employe C is executing !");
    }
    
}

public class P5 {
    public static void main(String[] args) {
        EmployeA a = new EmployeA();
        EmployeB b = new EmployeB();
        EmployeC c = new EmployeC();

        a.execute();
        a.debug();

        b.execute();
        b.debug();

        c.execute();
        c.debug();
    }
}
