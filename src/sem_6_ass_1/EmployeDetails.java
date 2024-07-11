package sem_6_ass_1;

abstract class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeDetails {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Alice", 101, 5000);
        Employee partTimeEmployee = new PartTimeEmployee("Bob", 102, 20, 80);

        System.out.println("Full-time employee salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part-time employee salary: " + partTimeEmployee.calculateSalary());
    }
}
