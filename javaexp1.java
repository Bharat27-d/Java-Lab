public class javaexp1 {
    void display() {
        try {
            String str = null;
            System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred!");
        }
    }

    public static void main(String[] args) {
        javaexp1 obj = new javaexp1();
        obj.display();
    }
}