import java.io.*;

// Define the Student class and implement Serializable
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Added serialVersionUID
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Persist {
    public static void main(String args[]) {
        try {
            // Creating the object
            Student s1 = new Student(211, "ravi");

            // Creating stream and writing the object
            try (FileOutputStream fout = new FileOutputStream("f.txt");
                 ObjectOutputStream out = new ObjectOutputStream(fout)) {

                out.writeObject(s1);
                System.out.println("Serialization successful.");
            }

        } catch (IOException e) {
            System.out.println("Error during serialization: " + e);
        }
    }
}