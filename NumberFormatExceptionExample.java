public class NumberFormatExceptionExample {
    void display() {
        try {
            String str = "abc";
            int num = Integer.parseInt(str); 
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred!");
        }
    }

    public static void main(String[] args) {
        NumberFormatExceptionExample obj = new NumberFormatExceptionExample();
        obj.display();
    }
}