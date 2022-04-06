package shapes;

public class Rectangle extends Shape {

    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculatePerimeter() {
        if (super.getPerimeter() == 0) {
            super.setPerimeter(2 * (height * width));
        }
        return super.getPerimeter();
    }

    @Override
    public double calculateArea() {
        if (super.getArea() == 0) {
            super.setArea(height * width);
        }
        return super.getArea();
    }
}
