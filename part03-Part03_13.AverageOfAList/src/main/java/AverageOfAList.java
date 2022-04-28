
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            }
            list.add(numbers);

        }
        int counter = 0;
        int sum = 0;
        for (Integer number:list) {
            sum += number;
            counter++;
        }
        double average = (double)sum / counter;
        System.out.println("Average: " + average);




        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
