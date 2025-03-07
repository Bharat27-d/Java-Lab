public class Exarry {
    void display() {
        try {
            int a []=new int[5];
            a[7] = 8;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        System.out.println("Exception Handled.");
    }
    public static void main(String[] args) {
        Exarry obj = new Exarry();
        obj.display();
    }
}
