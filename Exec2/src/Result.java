public class Result {
    public void showResult(double mean) {
        if (mean >= 7) {
            System.out.println("Student approved with mean: " + mean);
        } else {
            System.out.println("Student failed with mean: " + mean);
        }
    }

    public void displayResult(double mean) {
        System.out.println("Displaying result: " + mean);
    }
}
