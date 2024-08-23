import java.util.ArrayList;

public class Statistic {
    private ArrayList<Integer> points;
    
    public Statistic() {
        this.points = new ArrayList<Integer>();
    }

    public void getAverage(ArrayList<Integer> points) {
        if (points.isEmpty()) {
            System.out.println("Point average (all): -");
            return;
        }

        int totalSum = 0;
        for (int point : points) {
            totalSum += point;
        }

        double average = (double) totalSum / points.size();
        System.out.println("Point average (all): " + average);
    }

    public void getAveragePass(ArrayList<Integer> points) {
        int totalSum = 0;
        int passed = 0;

        for (int point : points) {
            if (point >= 50) {
                totalSum += point;
                passed++;
            }
        }

        if (passed == 0) {
            System.out.println("Point average (passing): -");
            return;
        }

        double average = (double) totalSum / passed;
        System.out.println("Point average (passing): " + average);
    }

    public void getPassPercentage(ArrayList<Integer> points) {
        if (points.isEmpty()) {
            System.out.println("Pass percentage: -");
            return;
        }

        int passed = 0;
        for (int point : points) {
            if (point >= 50) {
                passed++;
            }
        }

        double passedPercentage = (double) 100 * passed / points.size();
        System.out.println("Pass percentage: " + passedPercentage);
    }

    public int[] getGrades(ArrayList<Integer> points) {
        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;
        int zero = 0;

        for (int point : points) {
            if (point < 50) {
                zero++;
            } else if (point < 60) {
                one++;
            } else if (point < 70) {
                two++;
            } else if (point < 80) {
                three++;
            } else if (point < 90) {
                four++;
            } else {
                five++;
            }
        }

        int[] grades = {five, four, three, two, one, zero};

        return grades;
    }

    public void printGrades(int[] grades) {
        System.out.println("Grade distribution:");

        for (int i = 0; i < grades.length; i++) {
            System.out.print((5 - i) + ": ");
            printStars(grades[i]);
        }
    }

    public void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }
}
