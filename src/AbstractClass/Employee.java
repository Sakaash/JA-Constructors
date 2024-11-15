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
        StringBuilder sb = new StringBuilder(id +"\t"+ name +"\t"+ age);
        sb.append("\t"+salary);
        return sb.toString();
    }
    public abstract double calculatePay();

}

class HourlyEmployee extends Employee{
    private int hoursWorked;

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
        System.out.println("Enter the Hourly Employee Details");
        System.out.print("Enter the name : ");
        String name = scanner.nextLine();
        System.out.print("Enter the id : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the age : ");
        byte age = scanner.nextByte();
        scanner.nextLine();
        System.out.print("Enter the salary : ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();
        System.out.println("Enter the Salaried Employee Details");
        System.out.print("Enter the name : ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the id : ");
        int id2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the age : ");
        byte age2 = scanner.nextByte();
        scanner.nextLine();
        System.out.print("Enter the salary : ");
        double salary2 = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        Employee hourlyEmployee = new HourlyEmployee(id, name, age, salary, 8);
        Employee salariedEmployee = new SalariedEmployee(id2, name2, age2, salary2);
        System.out.println();
        System.out.println(hourlyEmployee.getEmployeeDetails());
        System.out.println(hourlyEmployee.calculatePay());
        System.out.println(salariedEmployee.getEmployeeDetails());
        System.out.println(salariedEmployee.calculatePay());
    }
}
