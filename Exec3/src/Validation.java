
public class Validation {
    public boolean isSalaryValid(double salary) {
        return salary >= 100 && salary <= 100000;
    }

    public boolean isLoanValid(double loanAmount) {
        return loanAmount > 0 && loanAmount <= 200000;
    }
}
