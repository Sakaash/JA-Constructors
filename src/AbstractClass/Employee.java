package AbstractClass;

import java.util.Scanner;

public abstract class Employee {
    int id;
    String name;
    byte age;
    double salary;

    Employee(int id, String name,byte age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeDetails() {
        StringBuilder sb = new StringBuilder(id +"\n"+ name +"\n"+ age);
        sb.append("\n"+salary);
        return sb.toString();
    }
    public abstract double calculatePay();

}

class HourlyEmployee extends Employee{
    private int hoursWorked = 8;

    HourlyEmployee(int id, String name,byte age, double salary) {
        super(id, name, age, salary);
    }
    HourlyEmployee(int id, String name,byte age, double salary, int hoursWorked) {
        super(id, name, age, salary);
        this.hoursWorked = hoursWorked;
    }
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + " per hour";
    }
    
    public double calculatePay() {
        return salary * hoursWorked;
    }

}

class SalariedEmployee extends Employee {
    SalariedEmployee(int id, String name,byte age, double salary) {
        super(id, name, age, salary);
    }
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + " LPA";
    }
    
    public double calculatePay() {
        return salary;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Employee hourlyEmployee = getHourlyEmployeeDetails(scanner);
        Employee salariedEmployee = getSalariedEmployeeDetails(scanner);

        System.out.println();
        System.out.println(hourlyEmployee.getEmployeeDetails());
        System.out.println(hourlyEmployee.calculatePay());
        System.out.println();
        System.out.println(salariedEmployee.getEmployeeDetails());
        System.out.println(salariedEmployee.calculatePay());
    }
    
    private static HourlyEmployee getHourlyEmployeeDetails(Scanner scanner) {
        System.out.println("Enter the hourly employee details : ");
        String name = getInput("Enter the name : ", scanner);
        int id = Integer.parseInt(getInput("Enter the id : ", scanner));
        byte age = Byte.parseByte(getInput("Enter the age of the employee : ", scanner));
        double salary = Double.parseDouble(getInput("Enter the salary of the employee : ", scanner));
        int hoursWorked = Integer.parseInt(getInput("Enter the hours worked by the employee : ", scanner));
        return new HourlyEmployee(id, name, age, salary, hoursWorked);
    }
    
    private static SalariedEmployee getSalariedEmployeeDetails(Scanner scanner) {
        System.out.println("Enter the salaried employee details : ");
        String name = getInput("Enter the name : ", scanner);
        int id = Integer.parseInt(getInput("Enter the id : ", scanner));
        byte age = Byte.parseByte(getInput("Enter the age of the employee : ", scanner));
        double salary = Double.parseDouble(getInput("Enter the salary of the employee : ", scanner));
        return new SalariedEmployee(id, name, age, salary);
    }    

    private static String getInput(String prompt, Scanner scanner) {
        System.out.println(prompt);
        return scanner.nextLine().trim();
    }
}
