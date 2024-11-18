package ExceptionHandling.CalculatorConundrum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        try {
            int operand1 = scanner.nextInt();
            int operand2 = scanner.nextInt();
            String operation = scanner.next();
            calculator.calculate(operand1,operand2,operation);
        } catch(IllegalArgumentException e) {
            System.out.println("Error : "+e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("Error : "+e.getMessage());
        } finally {
            System.out.println("Program ends here");
            scanner.close();
        }
    }
}
