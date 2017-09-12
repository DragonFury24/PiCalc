import java.util.*;

public class PiCalcMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the number of iterations you would like to calculate pi to.");
        double iterations = keyboard.nextDouble();
        double piApproximation = 0;
        for (int i = 1; i < iterations + 1; i++) {
            if (i % 2 == 0)
                piApproximation  -= (1 / (2.0 * i - 1));
            else piApproximation += (1 / (2.0 * i - 1));
        }
        piApproximation *= 4;
        System.out.println("The approximation of pi is " + piApproximation);
    }
}