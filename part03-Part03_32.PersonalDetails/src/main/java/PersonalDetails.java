

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        int sum = 0;
        int count = 0;
        String longName = null;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] newArray = input.split(",");

            if ( length < newArray[0].length()) {
                length = newArray[0].length();
                longName = newArray[0];
            }

            sum += Integer.valueOf(newArray[1]);
            count++;
        }

        System.out.println("Longest name: " + longName);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);
    }
}
