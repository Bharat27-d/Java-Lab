import java.io.*;
class Persist implements Serializable {
    int id;
    String name;
    Persist(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class DePersist {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("b.txt"));
            Persist p = (Persist) in.readObject();
            System.out.println(p.id + " " + p.name);
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}