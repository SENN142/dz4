package test;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        circle.Show();
        rectangle.Show();
        Cylinder cylinder1 = new Cylinder(circle, 10);
        Cylinder cylinder2 = new Cylinder(rectangle, 8);
        System.out.println("Cylinder volume with circle base: " + cylinder1.Volume());
        System.out.println("Cylinder volume with rectangle base: " + cylinder2.Volume());
    }
}