package Inheritance;

public class Vehicle {
    String brand;
    String color;
    int maxSpeed;

    Vehicle(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "Brand : "+brand 
                +"\nColor : "+ color 
                +"\nMaximum Speed : " + maxSpeed;
    }
}

class Car extends Vehicle {
    private int wheels;

    Car(String brand, String color, int maxSpeed, int wheels) {
        super(brand, color, maxSpeed);
        this.wheels = wheels;
    }

    public String toString() {
        return super.toString() 
                + "\nNumber of Wheels : "+wheels;
    }
}

class Bike extends Vehicle {
    private int wheels;

    Bike(String brand, String color, int maxSpeed, int wheels) {
        super(brand, color, maxSpeed);
        this.wheels = wheels;   
    }

    public String toString() {
        return super.toString() 
                + "\nNumber of Wheels : "+wheels;
    }    
}

class Truck extends Vehicle {
    private int wheels;

    Truck(String brand, String color, int maxSpeed, int wheels) {
        super(brand, color, maxSpeed);
        this.wheels = wheels;
    }

    public String toString() {
        return super.toString() 
                + "\nNumber of Wheels : "+wheels;
    }
}