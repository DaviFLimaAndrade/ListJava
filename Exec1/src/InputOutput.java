import java.util.Scanner;

public class InputOutput {
    private Scanner scanner = new Scanner(System.in);

    public double inputGrossSalary() {
        System.out.println("Enter the gross salary:");
        return scanner.nextDouble();
    }

    public double inputGrossSalary(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public double inputExtraHours() {
        System.out.println("Enter the number of extra hours:");
        return scanner.nextDouble();
    }

    public void showPayroll(double grossSalary, double inss, double irpf, double healthInsurance, double overtimeAddition, double netSalary) {
        System.out.println("Payroll:");
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("INSS Deduction: " + inss);
        System.out.println("IRPF Deduction: " + irpf);
        System.out.println("Health Insurance Deduction: " + healthInsurance);
        System.out.println("Overtime Addition: " + overtimeAddition);
        System.out.println("Net Salary: " + netSalary);
    }
}
