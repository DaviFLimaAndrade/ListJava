
import java.util.Scanner;

public class InputOutput {
    private final Scanner scanner = new Scanner(System.in);

    public double inputSalary() {
        System.out.println("Enter your current salary:");
        return scanner.nextDouble();
    }

    public double inputSalary(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public double inputLoanAmount() {
        System.out.println("Enter the amount you want to borrow:");
        return scanner.nextDouble();
    }

    public double inputLoanAmount(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public void showApproval(double totalAmount, double installmentValue) {
        System.out.println("Loan approved!");
        System.out.println("Total amount to be paid: $" + totalAmount);
        System.out.println("Value of each installment (24 months): $" + installmentValue);
    }

    public void showRejection() {
        System.out.println("Loan not approved. The installment value exceeds 15% of your salary.");
    }
}