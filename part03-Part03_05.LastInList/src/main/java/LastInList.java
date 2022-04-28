
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int index = 0;

        while (true) {
            String input = scanner.nextLine();
            index++;

            if (input.equals("")) {
                System.out.println(list.get(index - 2));

                break;
            }

            list.add(input);
        }

    }
}
