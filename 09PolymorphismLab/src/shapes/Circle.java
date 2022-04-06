package shapes;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public final double getRadius() {
        return radius;
    }

    @Override
    public double calculatePerimeter() {
        if (super.getPerimeter() == 0) {
            super.setPerimeter(2 * Math.PI * radius);
        }
            return super.getPerimeter();
        }

    @Override
    public double calculateArea() {
        if (super.getArea() == 0) {
            super.setArea(Math.PI * radius * radius);
        }
        return super.getArea();
    }
}
