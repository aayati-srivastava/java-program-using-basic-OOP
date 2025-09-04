import java.util.Scanner;

public class HighestSalaryOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Create an array to store employees
        Employee[] employees = new Employee[numEmployees];

        // Input employee details
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Salary (₹): ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            employees[i] = new Employee(name, department, salary);
        }

        // Find the highest-paid employee
        Employee highestPaid = employees[0]; // Assume first is highest
        for (Employee emp : employees) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }

        // Print the result
        System.out.println("\nHighest-paid employee in the department:");
        System.out.println("Name: " + highestPaid.getName());
        System.out.println("Department: " + highestPaid.getDepartment());
        System.out.println("Salary: ₹" + highestPaid.getSalary());

        scanner.close();
    }
}

class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}