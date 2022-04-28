import java.util.Scanner;

public class UserInterface {

    private TodoList exampleList;
    private Scanner scanner;

    public UserInterface(TodoList exampleList, Scanner scanner) {
        this.exampleList = exampleList;
        this.scanner = scanner;
    }

    public void start() {
        boolean loopControl = true;

        while (loopControl) {
            System.out.print("Command: ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "stop":
                    loopControl = false;
                    break;
                case "add":
                    System.out.print("To add: ");
                    String addingWord = scanner.nextLine();
                    exampleList.add(addingWord);
                    break;
                case "list":
                    exampleList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int removeIndex = Integer.valueOf(scanner.nextLine());
                    exampleList.remove(removeIndex);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }


}
