import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private BirdDatabase birdlist;

    public TextUI(Scanner scanner, BirdDatabase birdlist) {
        this.scanner = scanner;
        this.birdlist = birdlist;
    }

    public void start() {
        boolean shouldLoop = true;
        try {
            while (shouldLoop) {
                System.out.print("? ");
                String commmand = scanner.nextLine();
                switch (commmand.toLowerCase()) {
                    case "quit":
                        shouldLoop = false;
                        break;

                    case "add":
                        System.out.println("Name:");
                        String name = scanner.nextLine();

                        System.out.print("Name in Latin ");
                        String latinName = scanner.nextLine();

                        birdlist.addBird(new Bird(name,latinName));
                        break;

                    case "observation":
                        name = scanner.nextLine();
                        birdlist.addObservationFromDB(name);
                        break;

                    case "all":
                        birdlist.printBirdDatabase();
                        break;

                    case "one":
                        name = scanner.nextLine();
                        birdlist.printBird(name);
                    default:
                        System.out.println("Unknown command");
                }

            }
        } catch (Exception error) {
            System.out.println("There was an error msg is " + error.getMessage());
        }
    }
}
