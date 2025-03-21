 public class jj {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred!");
        } finally {
            System.out.println("Execution of the finally block.");
        }
    }
} 
