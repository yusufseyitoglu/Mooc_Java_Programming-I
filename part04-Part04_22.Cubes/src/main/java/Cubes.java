
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.toLowerCase().equals("end")) {
                break;
            }

            int getInt = Integer.valueOf(input);
            System.out.println(getInt*getInt*getInt);
        }

    }
}
