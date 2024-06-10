public class Main {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        Calculation calculation = new Calculation();
        Result result = new Result();
        Validation validation = new Validation();

        double grade1 = inputOutput.inputGrade("Enter the first grade:");
        while (!validation.isGradeValid(grade1)) {
            grade1 = inputOutput.inputGrade("Invalid grade. Please enter the first grade again (0 to 10):");
        }

        double grade2 = inputOutput.inputGrade("Enter the second grade:");
        while (!validation.isGradeValid(grade2)) {
            grade2 = inputOutput.inputGrade("Invalid grade. Please enter the second grade again (0 to 10):");
        }

        String meanType = inputOutput.inputMeanType();

        double mean;
        if (meanType.equalsIgnoreCase("Arithmetic")) {
            mean = calculation.arithmeticMean(grade1, grade2);
        } else {
            double weight1 = inputOutput.inputWeight("Enter the weight of the first grade:");
            double weight2 = inputOutput.inputWeight("Enter the weight of the second grade:");
            mean = calculation.weightedMean(grade1, grade2, weight1, weight2);
        }

        result.displayResult(mean);
    }
}
