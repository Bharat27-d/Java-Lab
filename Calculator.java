import java.util.Scanner;

class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}

class Subtraction extends Addition {
    public int subtract(int a, int b) {
        return a - b;
    }
}

class Multiplication extends Subtraction {
    public int multiply(int a, int b) {
        return a * b;
    }
}

class Division extends Multiplication {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

class AdvancedOperations extends Division {
    public int square(int a) {
        return a * a;
    }

    public double squareRoot(int a) {
        return Math.sqrt(a);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedOperations calc = new AdvancedOperations();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Choose operation (+, -, *, /, square, sqrt): ");
        String operation = scanner.next();

        try {
            switch (operation) {
                case "+":
                    System.out.println("Result: " + calc.add(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + calc.subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + calc.multiply(num1, num2));
                    break;
                case "/":
                    System.out.println("Result: " + calc.divide(num1, num2));
                    break;
                case "square":
                    System.out.println("Result: " + calc.square(num1));
                    break;
                case "sqrt":
                    System.out.println("Result: " + calc.squareRoot(num1));
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}