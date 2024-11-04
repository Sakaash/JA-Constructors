package MethodOverloading;

public class MathOperations {
    public static int add(int a, int b) {
        return a+b;
    }
    public static double add(double a, double b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }
    public static double subtract(double a, double b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }
    public static double multiply(double a, double b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        if(b == 0)
            throw new ArithmeticException("Cannot divide by zero!!!");
        else
            return a/b;
    }
    public static double divide(double a, double b) {
        if(b == 0.0)
            throw new ArithmeticException("Cannot divdie by zero!!!");
        else
            return a/b;
    }
    
    
}
