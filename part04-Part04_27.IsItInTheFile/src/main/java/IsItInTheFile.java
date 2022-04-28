
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean isFound = false;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {

                String row = fileScanner.nextLine();
                if (searchedFor.contains(row)) {
                    isFound = true;
                }

            }

            if (isFound) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file" + fileName + "failed.");
        }

    }
}
