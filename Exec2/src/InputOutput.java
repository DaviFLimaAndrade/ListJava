import java.util.Scanner;

public class InputOutput {
    private final Scanner scanner = new Scanner(System.in);

    public double inputGrade(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public double inputWeight(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    public String inputMeanType() {
        System.out.println("Which mean would you like to calculate (Arithmetic/Weighted)?");
        return scanner.next();
    }
}
