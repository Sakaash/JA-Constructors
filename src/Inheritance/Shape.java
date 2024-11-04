package Inheritance;

class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(10);
        System.out.println(shape.calculateArea());

        shape = new  Rectangle(5, 7);
        System.out.println(shape.calculateArea());

        shape = new Square(5);
        System.out.println(shape.calculateArea());
    }    
}
public abstract class Shape {
    double sideA;
    double sideB;

    Shape(double sideA) {
        this.sideA = sideA;
    }

    Shape(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public abstract double calculateArea();
}

class Circle extends Shape{
    Circle(double radius) {
        super(radius);
    }
    
    public double calculateArea() {
        return Math.PI*sideA*sideA;
    }
}

class Rectangle extends Shape{
    Rectangle(double sideA, double sideB) {
        super(sideA, sideB);
    }
    
    public double calculateArea() {
        return sideA*sideB;        
    }
}

class Square extends Shape{
    Square(double sideA) {
        super(sideA);
    }
    
    public double calculateArea() {
        return sideA*sideA;
    }
}
