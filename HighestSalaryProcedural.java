import java.util.Scanner;
public class HighestSalaryProcedural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int numEmployees = scanner.nextInt();
        double[] salaries = new double[numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter salary for employee " + (i+1) + ": $");
            salaries[i] = scanner.nextDouble();
        }
        double maxSalary = salaries[0];
        for (double salary : salaries) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }
        System.out.println("\nHighest salary in the department: $" + maxSalary);
        scanner.close();
    }
}