import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;  // Ensure compatibility during serialization

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
