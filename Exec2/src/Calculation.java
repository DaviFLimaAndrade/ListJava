public class Calculation {

    public double arithmeticMean(double grade1, double grade2) {
        return (grade1 + grade2) / 2;
    }

    public double weightedMean(double grade1, double grade2, double weight1, double weight2) {
        return (grade1 * weight1 + grade2 * weight2) / (weight1 + weight2);
    }
}
