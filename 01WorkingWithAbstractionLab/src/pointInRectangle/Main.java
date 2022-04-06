package pointInRectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point bottomLeft = createPointOfTwoInts(scanner);
        Point topRight = createPointOfTwoInts(scanner);

        int numberOfPoints = scanner.nextInt();

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        for (int i = 0; i < numberOfPoints; i++) {

            Point point = createPointOfTwoInts(scanner);

            System.out.println(rectangle.contains(point));
        }
    }
    
    private static Point createPointOfTwoInts(Scanner scanner) {
        int pointX = scanner.nextInt();
        int pointY = scanner.nextInt();
        return new Point(pointX, pointY);
    }
}
