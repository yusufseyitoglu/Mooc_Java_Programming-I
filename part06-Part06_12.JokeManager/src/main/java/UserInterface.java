import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManagerUI;

    public UserInterface(JokeManager jokeManagerUI, Scanner scanner) {
        this.scanner = scanner;
        this.jokeManagerUI = jokeManagerUI;
    }

    public void start() {
        boolean loop = true;
        while (loop) {
            System.out.print("Commands:" + "\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop\n");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "X":
                    loop = false;
                    break;
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scanner.nextLine();
                    jokeManagerUI.addJoke(joke);
                    break;
                case "2":
                    System.out.println(jokeManagerUI.drawJoke());
                    break;
                case "3":
                    jokeManagerUI.printJokes();
                    break;
                default:
                    System.out.println("Unknown command");
            }

        }
    }
}
