
public class Loan {
    private static final double INTEREST_RATE = 0.35;
    private static final int MONTHS = 24;
    private static final double INSTALLMENT_SALARY_LIMIT = 0.15;

    public double calculateTotalAmount(double loanAmount) {
        return loanAmount * (1 + INTEREST_RATE);
    }

    public double calculateInstallmentValue(double totalAmount) {
        return totalAmount / MONTHS;
    }

    public boolean isLoanApproved(double salary, double installmentValue) {
        return installmentValue <= (salary * INSTALLMENT_SALARY_LIMIT);
    }
}
