public class Calculation {
    public double calculateINSS(double grossSalary) {
        return grossSalary * 0.20;
    }

    public double calculateIRPF(double grossSalary) {
        return grossSalary * 0.10;
    }

    public double calculateHealthInsurance(double grossSalary) {
        return grossSalary * 0.05;
    }

    public double calculateOvertime(double grossSalary, double extraHours) {
        double normalHourlyRate = grossSalary / 160;
        double extraHourlyRate = normalHourlyRate * 1.50;
        return extraHourlyRate * extraHours;
    }

    public double calculateNetSalary(double grossSalary, double inss, double irpf, double healthInsurance, double overtimeAddition) {
        return grossSalary - inss - irpf - healthInsurance + overtimeAddition;
    }

    public double calculateHealthPlan(double grossSalary) {
        return grossSalary * 0.05; // Assume-se que o plano de saúde seja 5% do salário bruto
    }


}
