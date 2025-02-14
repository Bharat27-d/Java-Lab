import java.util.Scanner;

interface AreaInterface{
    double calc(double x, double y);
}
class Rect implements AreaInterface{
    public double calc(double x, double y){
        return (x * y);
    }
}
class Square implements AreaInterface{
    public double calc(double x, double y){
        return (x * x);
    }
}
public class Aarea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length and breadth of the rectangle: ");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        Rect r = new Rect();
        Square s = new Square();
        AreaInterface a;

        a=r;
        System.out.println("\nArea of Rectangle is : " + a.calc(length, breadth));

        a=s;
        System.out.println("\nArea of Square is : " + a.calc(side, side));
        
        scanner.close();
    }
}