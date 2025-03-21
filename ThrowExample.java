public class ThrowExample {

    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("You must be 18 or older.");
        }
        System.out.println("You are eligible.");
    }

    public static void main(String[] args) {
        int age = 16;

        try {
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}