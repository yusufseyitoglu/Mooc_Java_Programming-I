
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.

        ArrayList<Integer> points = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                int sum = 0;
                int count = 0;
                for (Integer e : points) {
                    sum += e;
                    count++;
                }
                int sumPassing = 0;
                int countPassing = 0;
                for (Integer r : points) {
                    if (r >= 50) {
                        sumPassing += r;
                        countPassing++;
                    }
                }

                //double passPercentage = 100 * (1.0 * sumPassing / countPassing) / (1.0 * sum / count);

                System.out.println("Point average (all): " + 1.0 * sum / count);
                System.out.println("Point average (passing): " + 1.0 * sumPassing / countPassing);
                System.out.println("Pass percentage: " + 100 * (1.0 * countPassing) / (1.0 * count));

                int[] gradeDistArr = new int[6];
                for (int grade : points) {

                    if (grade >= 90) {
                        gradeDistArr[0]++;
                    } else if (grade <= 89 && grade > 79) {
                        gradeDistArr[1]++;
                    } else if (grade <= 79 && grade > 69) {
                        gradeDistArr[2]++;
                    } else if (grade <= 69 && grade > 59) {
                        gradeDistArr[3]++;
                    } else if (grade <= 59 && grade > 49) {
                        gradeDistArr[4]++;
                    } else if (grade <= 49) {
                        gradeDistArr[5]++;
                    }
                }


                System.out.println("Grade distribution:");
                int gradDistIndex = 5;
                for (int e : gradeDistArr) {
                    System.out.print(gradDistIndex + ":");

                    for (int i = 0; i < e; i++) {
                        System.out.print("*");
                    }

                    System.out.print("\n"); //line break
                    gradDistIndex--;
                }
                break;
            }

            if (userInput >= 0 && userInput <= 100) {
                points.add(userInput);
            }
        }
    }

}
