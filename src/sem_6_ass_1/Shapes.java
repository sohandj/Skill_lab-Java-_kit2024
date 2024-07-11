package sem_6_ass_1;

/*
 * Create an interface `Shape` with a method `draw()`.
 * Implement this interface in classes`Circle` and `Rectangle`.
 * Write a main method to create instances of `Circle` and`Rectangle`, 
 * and call their `draw()` methods using a `Shape` reference.
 * */
interface Shape {
    void draw();
}

class Circle implements Shape {
    
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
