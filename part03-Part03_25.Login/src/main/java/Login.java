
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username:");
        String input1 = scanner.nextLine();
        System.out.println("");

        System.out.print("Enter password:");
        String input2 = scanner.nextLine();

        if (input1.equals("alex") && input2.equals("sunshine") || input1.equals("emma") && input2.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
