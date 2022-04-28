import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, page, year));
        }

        System.out.println("What information will be printed? ");
        String choise = scanner.nextLine();

        if (choise.toLowerCase().equals("everything")) {
            for (Book element:books) {
                System.out.println(element);
            }

        } else if(choise.toLowerCase().equals("name")) {
            for (Book element:books) {
                System.out.println(element.getTitle());
            }
        }


    }
}
