package FactoryMethod;
// Abstract class
abstract class Shape {
    // Abstract method to be implemented by subclasses
    abstract void draw();
}

// Concrete subclass 1
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Concrete subclass 2
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Factory class
class ShapeFactory {
    // Factory method to create an instance of Shape based on the given type
    static Shape createShape(String type) {
        if ("Rectangle".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        }
        // Handle unknown types or return a default shape
        System.out.println("Unknown shape type. Returning default: Rectangle");
        return new Rectangle();
    }
}

// Main class
public class Solution {
    public static void main(String[] args) {
        // Using the factory method to create instances
        Shape rectangle = ShapeFactory.createShape("Rectangle");
        Shape circle = ShapeFactory.createShape("Circle");

        // Invoking draw() method
        rectangle.draw(); // Output: Drawing a Rectangle
        circle.draw();    // Output: Drawing a Circle
    }
}
