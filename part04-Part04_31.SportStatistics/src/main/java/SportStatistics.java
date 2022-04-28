
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String teamName = scan.nextLine();

        int gamesCount = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String[] parts = fileScanner.nextLine().split(",");

                if (fileScanner.equals("")) {
                    continue;
                }

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);


                for (int i=0 ; i<2 ; i++) {

                    if (parts[i].equals(teamName)){
                        gamesCount++;
                    }

                }

                if (teamName.equals(homeTeam)) {
                    if (homeTeamPoints > visitingTeamPoints) {
                        wins++;
                    }
                    else if (homeTeamPoints < visitingTeamPoints) {
                        losses++;
                    }
                }
                if (teamName.equals(visitingTeam)) {
                    if (visitingTeamPoints > homeTeamPoints) {
                        wins++;
                    }
                    else if (homeTeamPoints < visitingTeamPoints) {
                        losses++;
                    }
                }

            }



        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gamesCount);

        System.out.println("Wins: " + wins);

        System.out.println("Losses: " + losses);

    }

}
