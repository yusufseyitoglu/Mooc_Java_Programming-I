import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdDataList = new BirdDatabase();

        TextUI  userInterfacse = new TextUI(scanner, birdDataList);

        userInterfacse.start();

    }

}
