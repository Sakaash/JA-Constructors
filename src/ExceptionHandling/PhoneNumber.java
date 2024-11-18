package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the phone number");
            String phNo = scanner.next();

            if (!containsNumbers(phNo)) {
                throw new InputMismatchException();
            }
            System.out.println("Valid phone number.");
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid phone number containing only 10 digits!");
        } finally {
            scanner.close();
            System.out.println("End of program!!");
        }
    }

    static private boolean containsNumbers(String phNo) {
        for (int i = 0; i < phNo.length(); i++) {
            if (!Character.isDigit(phNo.charAt(i))) {
                return false;
            }
        }
        return phNo.length() == 10;
    }
}
