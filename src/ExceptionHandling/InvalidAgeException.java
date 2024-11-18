package ExceptionHandling;

import java.util.Scanner;

public class InvalidAgeException extends Exception{ 
    InvalidAgeException() {
        super("Must be of age 18 or above to register");
    }
    InvalidAgeException(String message) {
        super(message);
    }
}

class Demo {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age<18) {
            throw new InvalidAgeException();
        }
        System.out.println("You are eligible to register");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int age = scanner.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception : " +e.getMessage());
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("End of program");
        }
    }
}


