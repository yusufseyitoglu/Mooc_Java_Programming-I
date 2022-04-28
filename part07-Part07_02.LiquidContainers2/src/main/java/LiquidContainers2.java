
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container firstContainer = new Container();
        Container secondContainer = new Container();
        Scanner scanner = new Scanner(System.in);

        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print(
                    "First: " + firstContainer + "\n"
                            + "Second: " + secondContainer + "\n");

            String userInput = scanner.nextLine();
            if (userInput.equals("quit")) {
                shouldLoop = false;
                break;
            }

            String[] userInputSplit = userInput.split(" ");

            String command = userInputSplit[0];

            int amount = Integer.valueOf(userInputSplit[1]);

            switch (command) {
                case "add":

                    firstContainer.add(amount);

                    break;
                case "move":

                    if (amount <= 0 || firstContainer.contains() == 0) {
                        return;
                    }
                    if (firstContainer.contains() - amount < 0) {
                        amount = firstContainer.contains();
                    }

                    firstContainer.remove(amount);

                    secondContainer.add(amount);

                    break;
                case "remove":
                    secondContainer.remove(amount);

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }
}