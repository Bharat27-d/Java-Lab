import java.util.Scanner;

interface AreaInterface {
    double pi = 3.14;
    double calc(double x, double y);
}

class Rect implements AreaInterface {
    public double calc(double x, double y) {
        return (x * y);
    }
}

class Circle implements AreaInterface {
    public double calc(double x, double y) {
        return (pi * x * x);
    }
}

public class Area {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length and breadth of the rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Rect r = new Rect();
        Circle c = new Circle();
        AreaInterface a;

        a = r;
        System.out.println("\nArea of Rectangle is : " + a.calc(length, breadth));

        a = c;
        System.out.println("\nArea of Circle is : " + a.calc(radius, radius));

        scanner.close();
    }
}
