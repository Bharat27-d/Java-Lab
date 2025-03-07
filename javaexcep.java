public class javaexcep {
    void display() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }

    public static void main(String[] args) {
        javaexcep obj = new javaexcep();
        obj.display();
    }
}