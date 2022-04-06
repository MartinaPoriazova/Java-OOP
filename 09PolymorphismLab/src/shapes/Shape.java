package shapes;

public abstract class Shape {

    private double perimeter;
    private double area;

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public final double getPerimeter() {
        return perimeter;
    }

    public final double getArea() {
        return area;
    }
}
