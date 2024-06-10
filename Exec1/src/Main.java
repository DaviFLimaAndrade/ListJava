public class Main {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        Calculation calculation = new Calculation();
        Validation validation = new Validation();

        double grossSalary = inputOutput.inputGrossSalary();
        while (!validation.isSalaryValid(grossSalary)) {
            grossSalary = inputOutput.inputGrossSalary("Invalid salary. Please enter a gross salary between 500 and 30000 reais:");
        }

        double inss = calculation.calculateINSS(grossSalary);
        double irpf = calculation.calculateIRPF(grossSalary);
        double healthPlan = calculation.calculateHealthPlan(grossSalary);
        double extraHours = inputOutput.inputExtraHours();
        double extraHoursAddition = calculation.calculateOvertime(grossSalary, extraHours);

        double netSalary = calculation.calculateNetSalary(grossSalary, inss, irpf, healthPlan, extraHoursAddition);

        inputOutput.showPayroll(grossSalary, inss, irpf, healthPlan, extraHoursAddition, netSalary);
    }
}
