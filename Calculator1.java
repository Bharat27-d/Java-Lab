import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator!");
        
        while (true) {
            double num1 = 0, num2 = 0;
            boolean validInput = false;

            
            while (!validInput) {
                try {
                    System.out.print("Enter the first number: ");
                    num1 = sc.nextDouble();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.next(); 
                }
            }

            
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);
            
            validInput = false;
            
            while (!validInput) {
                try {
                    System.out.print("Enter the second number: ");
                    num2 = sc.nextDouble();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.next(); 
                }
            }
            
            double result = 0;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please try again.");
                    continue;
            }
            
            System.out.printf("The result of %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
        }
        
    }
}
