package MethodOverriding;

public class Employee {
    int id;
    String name;
    int age;
    double salary;

    Employee(int id, String name,int age, double salary) {
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
}

class HourlyEmployee extends Employee{
    HourlyEmployee(int id, String name,int age, double salary) {
        super(id, name, age, salary);
    }
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + " per hour";
    }
}

class SalariedEmployee extends Employee {
    SalariedEmployee(int id, String name,int age, double salary) {
        super(id, name, age, salary);
    }
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + " LPA";
    }
}

class Main {
    public static void main(String[] args) {
        Employee hourlyEmployee = new HourlyEmployee(100, "John", 42, 500);
        Employee salariedEmployee = new SalariedEmployee(105, "Max", 27, 8);
        System.out.println(hourlyEmployee.getEmployeeDetails());
        System.out.println(salariedEmployee.getEmployeeDetails());
    }
}
