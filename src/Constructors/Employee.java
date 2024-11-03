package Constructors;

import java.util.ArrayList;

public class Employee {
    private String name;
    private final String id;
    private double salary;
    private String email;

    private static int employeeCount = 0;
    private static ArrayList<Employee> employees = new ArrayList<Employee>();

    public Employee(String name, double salary, String email, String id) {
        setName(name);
        setSalary(salary);
        setEmail(email);
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty");
        }
        this.id = id;
        employeeCount++;
        employees.add(this);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        else
            this.name = name;
    }

    public String getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Salary cannot be negative");
        else
            this.salary = salary;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email == null || email.isEmpty())
            throw new IllegalArgumentException("Email cannot be null");
        else
            this.email = email;
    }
    public static int getEmployeeCount() {
        return employeeCount;
    }
    public static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
