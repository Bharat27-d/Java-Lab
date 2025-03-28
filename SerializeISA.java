import java.io.*;

class Person implements Serializable {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Student extends Person {
    String course;
    int fee;

    public Student(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }
}

public class SerializeISA {
    public static void main(String args[]) {
        try {
            // Use the correct class name "Student"
            Student s1 = new Student(211, "ravi", "Engineering", 50000);

            // File name should include the extension for better readability
            FileOutputStream fout = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();

            System.out.println("success");

            // Deserialize the object
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"));
                Student s = (Student) in.readObject();

                System.out.println(s.id + " " + s.name + " " + s.course + " " + s.fee);

                in.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
