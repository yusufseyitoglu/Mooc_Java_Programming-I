
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCounter = 0;
        int sumOfPositiveNumber = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number < 0) {

                continue;
            }
            if (number > 0) {
                sumOfPositiveNumber = number + sumOfPositiveNumber;
                numberCounter++;
                continue;
            }
            if (number == 0) {
                if (numberCounter==0) {
                    System.out.println("Cannot calculate the average");
                } else {
                    System.out.println(1.0 * sumOfPositiveNumber / numberCounter);
                }
                break;
            }
        }

    }
}
