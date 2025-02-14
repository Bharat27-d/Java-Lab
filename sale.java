import java.util.Scanner;

public class sale {
    public static void main(String[] args) {
        final int salespersons = 5;
        int[]   sales = new int[salespersons];
        int sum;
        Scanner scanner = new Scanner(System.in);
        for(int j=0; j<salespersons; j++) {
            System.out.println("Enter sales for salesperson " + (j + 1) + ": ");
            sales[j] = scanner.nextInt();
        }
        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for(int j=0; j<salespersons; j++) {
            System.out.println("     " + (j+1) + "         " + sales[j]);
            sum += sales[j];
        }
        System.out.println("\nTotal sales: " + sum);
        int max=0;
        for(int j=0; j<salespersons; j++) {
            if(sales[j] > sales[max]) {
                max = j;
            }
        }
        System.out.println("\n Total Sales Maximum: " + sales[max]);
        int min=sales[0];   
        for(int j=0; j<salespersons; j++) {
            if(sales[j] < sales[min]) {
                min = j;
            }
        }
        System.out.println("\n Total Sales Minimum: " + sales[min]);
    }
}
