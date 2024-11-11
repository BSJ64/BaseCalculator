
package basecalculator;
import java.util.Scanner;

/**
 * @author Brenden St. Juste
 */
public class BaseCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calc baseCalc = new calc();
        Scanner user = new Scanner(System.in);
        System.out.println("Input a whole number.");
        int input = user.nextInt();
        System.out.println("Input a base to convert to.");
        int base = user.nextInt();
        baseCalc.convert(input, base);
    }
}
