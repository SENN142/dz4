package geometry2d;
public class Rectangle implements Figure {
    private final double width, height;
    public Rectangle(double width, double height) { this.width = width; this.height = height; }
    @Override public double Area() { return width * height; }
    @Override public void Show() { System.out.println("Rectangle: " + width + "x" + height + ", area = " + Area()); }
}