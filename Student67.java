class Student67{
    int id;
    String name;
}

class TestStudent3{
    public static void main(String[] args)
     {
        Student67 s1 = new Student67();
        Student67 s2 = new Student67();
        s1.id = 101;
        s1.name = "Karan";
        s2.id = 102;
        s2.name = "Rahul";
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);

    }
}