
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negative = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0 ) {
                continue;

            }
            if (number == 0) {
                System.out.println("Number of negative numbers: " + negative);
                break;
            }
            negative++;
        }

    }
}
