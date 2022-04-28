
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = null;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] ourArray = input.split(",");
            if (Integer.valueOf(ourArray[1]) >= oldest) {
                oldest = Integer.valueOf(ourArray[1]) ;
                oldestName = ourArray[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
