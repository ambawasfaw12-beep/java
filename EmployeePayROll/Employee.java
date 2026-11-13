package EmployeePayROll;

// Base Class (Superclass)
public class Employee {
    private int id;
    private String name;
    private double baseSalary;

    // Constructor for Employee
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    // General method to be overridden by subclasses (Polymorphism)
    public double calculatePay() {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Total Pay: $" + calculatePay());
    }

    public static void main(String[] args) {
        // Testing our inheritance hierarchy with an array (Polymorphism in action)
        Employee[] employees = new Employee[2];
        
        employees[0] = new FullTimeEmployee(101, "Abebe", 5000.0, 1000.0); // base + monthly bonus
        employees[1] = new PartTimeEmployee(102, "Kebede", 20.0, 80);      // hourly rate + hours worked

        System.out.println("--- Employee Payroll System ---");
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}

// Subclass 1
class FullTimeEmployee extends Employee {
    private double monthlyBonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double monthlyBonus) {
        super(id, name, baseSalary); // Calls parent constructor
        this.monthlyBonus = monthlyBonus;
    }

    @Override
    public double calculatePay() {
        return getBaseSalary() + monthlyBonus; // Full-time gets base salary plus bonus
    }
}

// Subclass 2
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0.0); // Part-time might not have a fixed base salary
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked; // Part-time gets paid by hours
    }
}