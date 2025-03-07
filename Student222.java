// Defining an interface
interface Drawable {
    void draw(); // abstract method (implicitly public and abstract)
}

// Implementing the interface in the Rectangle class
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

// Implementing the interface in the Circle class
class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

// Main class to test the implementation
class TestInterface1 {
    public static void main(String args[]) {
        Drawable d = new Circle(); // Polymorphic reference
        Drawable r = new Rectangle(); // Polymorphic reference
        d.draw(); // Calls the draw() method of Circle class
        r.draw(); // Calls the draw() method of Rectangle class
    }
}
