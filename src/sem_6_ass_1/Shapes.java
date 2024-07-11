package sem_6_ass_1;


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
