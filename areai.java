import java.util.Scanner;

interface area {
    double pi = 3.14;
    double calc(double x, double y);
}

class rect implements area {
    public double calc(double x, double y) {
        return (x * y);
    }
}

class circle implements area {
    public double calc(double x, double y) {
        return (pi * x * x);
    }
}

class areai {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length and breadth of the rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        rect r = new rect();
        circle c = new circle();
        area a;

        a = r;
        System.out.println("\nArea of Rectangle is : " + a.calc(length, breadth));

        a = c;
        System.out.println("\nArea of Circle is : " + a.calc(radius, radius));

        scanner.close();
    }
}
