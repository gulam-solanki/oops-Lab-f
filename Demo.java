package FigPackage;

public class Demo {
    public static void main(String[] args) {
        Cone c = new Cone(5,7);
        c.calcArea();
        c.calcVol();
        c.DispArea();
        c.DispVol();

        Sphere s = new Sphere(3);
        s.calcArea();
        s.calcVol();
        s.DispArea();
        s.DispVol();

        Cylinder cy = new Cylinder(9,7);
        cy.calcArea();
        cy.calcVol();
        cy.DispArea();
        cy.DispVol();
    }
}
