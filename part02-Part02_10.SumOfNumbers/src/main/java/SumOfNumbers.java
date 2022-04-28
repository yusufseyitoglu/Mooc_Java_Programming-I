
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            System.out.println("Give a number: ");

            if (number < 0) {
                sumOfNumbers = number + sumOfNumbers;
                continue;
            }
            if (number > 0) {
                sumOfNumbers = number + sumOfNumbers;
                continue;
            }
            if (number == 0) {
                System.out.println("Sum of the numbers: " + sumOfNumbers);
                break;
            }
        }

    }
}
