import java.util.Scanner;

class Employe {
    private String name;
    private int age;
    private double salary;

    public Employe(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); 

        Employe emp = new Employe(name, age, salary);
        emp.display();

        System.out.println("Enter the number of salespersons: ");
        int n = sc.nextInt();
        double[] sales = new double[n];
        double totalSales = 0;
        double maxSales = Double.MIN_VALUE;
        double minSales = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = sc.nextDouble();
            totalSales += sales[i];
            if (sales[i] > maxSales) {
                maxSales = sales[i];
            }
            if (sales[i] < minSales) {
                minSales = sales[i];
            }
        }

        double averageSales = totalSales / n;

        System.out.println("Total Sales: " + totalSales);
        System.out.println("Maximum Sales: " + maxSales);
        System.out.println("Minimum Sales: " + minSales);
        System.out.println("Average Sales: " + averageSales);

        sc.close();
    }
}