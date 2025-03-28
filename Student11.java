public class Student11 {
    int id;
    String name;
    Student11(){
System.out.println("this is default constructor");
    }
    Student11(int i, String n){
        id = i;
        name = n;
    }
    public static void main(String[] args) {
        Student11 s = new Student();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student id:"+s.id +"\nStudent name:"+s.name);
        System.out.println("\nParameterized Constructor values:\n");
        Student student = new Student(10,"David");
        System.out.println("Student ID:"+student.id+"\nStudent Name:"+student.name);
    }
}
