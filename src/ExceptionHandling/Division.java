package ExceptionHandling;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator");
            int numerator = scanner.nextInt();

            System.out.println("Enter the denominator");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result : "+result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide the numerator with 0 as denominator");
        } catch(Exception e) {
            System.out.println("An exception occured at " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("End of program!");
        }
    }
}
