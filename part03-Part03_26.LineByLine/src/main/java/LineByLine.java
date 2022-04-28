
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String words = scanner.nextLine();
            if (words.equals("")){
                break;
            }
            String[] pieces = words.split(" ");

            for (String word:pieces) {
                System.out.println(word);
            }
        }

    }
}
