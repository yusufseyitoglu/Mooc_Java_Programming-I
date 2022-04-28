
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String words = scanner.nextLine();
            if (words.equals("")){
                break;
            }
            String[] wordsArray = words.split(" ");
            for (int i = 0; i < wordsArray.length; i++) {
                if (wordsArray[i].contains("av")) {
                    System.out.println(wordsArray[i]);
                }
            }

        }
    }
}
