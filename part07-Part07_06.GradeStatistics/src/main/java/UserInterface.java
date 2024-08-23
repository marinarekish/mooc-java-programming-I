import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Statistic statistic;
    private Scanner input;

    public UserInterface(Statistic statistic, Scanner input) {
        this.statistic = statistic;
        this.input = input;
    }
    
    public void start(){
        ArrayList<Integer> points = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int number = Integer.valueOf(input.nextLine());

            if (number == -1) {
                break;
            }

            if (number >= 0 && number <= 100) {
                points.add(number);
            }
        }

        statistic.getAverage(points);
        statistic.getAveragePass(points);
        statistic.getPassPercentage(points);

        int[] grades = statistic.getGrades(points);

        statistic.printGrades(grades);
    }
}
