public class ExceptionHandlingExample {

    
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            divide(10, 0); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}