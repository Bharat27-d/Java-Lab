public class Vehicle {
    void run()
    {
        System.out.println("Vehicle is Running.");
    }
}
class Bike2 extends Vehicle{
    void run()
    {
        System.out.println("Bike Is Running Safely.");
    }
    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();
    }
}
