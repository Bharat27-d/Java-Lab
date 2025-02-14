public class Student4p {
    int id;
    String name;

    Student4p() {
        id = 0;        
        name = "None"; 
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student4p s1 = new Student4p();
        Student4p s2 = new Student4p();
        
        s1.display(); 
        s2.display();
    }
}
