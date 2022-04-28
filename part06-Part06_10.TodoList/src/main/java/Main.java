
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        UserInterface e = new UserInterface(list,scanner);
        e.start();
    }
}
