
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers");

        Statistics allNumbers = new Statistics();
        Statistics onlyEven = new Statistics();
        Statistics onlyOdd = new Statistics();


        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {

                System.out.println("Sum: " + allNumbers.sum());
                System.out.println("Sum of even numbers: " + onlyEven.sum());
                System.out.println("Sum of odd numbers: " + onlyOdd.sum());
                break;
            } else {

                allNumbers.addNumber(input);
                if (input % 2 == 0) {
                    onlyEven.addNumber(input);
                } else {
                    onlyOdd.addNumber(input);
                }
            }


        }
    }
}

