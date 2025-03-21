public class Exarry {
    void display() {
        try {
            int a[] = new int[5];
            a[4] = 8; // Accessing a valid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        }
        System.out.println("Exception Handled.");
    }

    public static void main(String[] args) {
        Exarry obj = new Exarry();
        obj.display();
    }
}