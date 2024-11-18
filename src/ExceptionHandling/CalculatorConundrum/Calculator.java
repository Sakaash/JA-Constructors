package ExceptionHandling.CalculatorConundrum;

public class Calculator {
    public void calculate(int operand1,int operand2,String operation) throws IllegalArgumentException {
        if(operation == null) {
            throw new IllegalArgumentException("Operator cannot be null");
        }
        
        if(operation == "") {
            throw new IllegalArgumentException("Operator cannot be empty");
        }

        if(!(operation.contains("+") || operation.contains("*") || operation.contains("/"))) {
                throw new IllegalArgumentException("Operation " + operation + " does not exist");
        }

        if(operation.equals("/") && operand2 == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }

        switch (operation) {
            case "+" -> System.out.println("Result: "+(operand1+operand2));
            case "*" -> System.out.println("Result: "+(operand1*operand2));
            case "/" -> System.out.println("Result: "+(operand1/operand2));
        }
    }
}
