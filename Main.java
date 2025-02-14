public class Main {
    int i;
    Main() {
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Value of i: " + obj.i);
    }
}
