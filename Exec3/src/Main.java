
public class Main {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        Loan loan = new Loan();
        Validation validation = new Validation();

        double salary = inputOutput.inputSalary();
        while (!validation.isSalaryValid(salary)) {
            salary = inputOutput.inputSalary("Invalid salary. Please enter a valid salary (greater than zero):");
        }

        double loanAmount = inputOutput.inputLoanAmount();
        while (!validation.isLoanValid(loanAmount)) {
            loanAmount = inputOutput.inputLoanAmount("Invalid loan amount. Please enter an amount up to 200,000 reais:");
        }

        double totalAmount = loan.calculateTotalAmount(loanAmount);
        double installmentValue = loan.calculateInstallmentValue(totalAmount);

        if (loan.isLoanApproved(salary, installmentValue)) {
            inputOutput.showApproval(totalAmount, installmentValue);
        } else {
            inputOutput.showRejection();
        }
    }
}
