package MethodOverriding;

class Running {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        car.start();;
        car.stop();
        bike.start();
        bike.stop();
        truck.start();
        truck.stop();
    }
}

public class Vehicle {
    public void start() {
        System.out.println("Vehicle's engine has started.");
    }
    public void stop() {
        System.out.println("Vehicle's Engine has stopped.");
    }
}

class Car extends Vehicle{
    public void start() {
        System.out.println("Car's Engine has started.");
    }
    public void stop() {
        System.out.println("Car's Engine has stopped.");
    }
}

class Bike extends Vehicle {
    public void start() {
        System.out.println("Bike's Engine has started.");
    }
    public void stop() {
        System.out.println("Bike's Engine has stopped.");

    }
}

class Truck extends Vehicle {
    public void start() {
        System.out.println("Truck's Engine has started.");
    }
    public void stop() {
        System.out.println("Truck's Engine has stopped.");
    }
}


