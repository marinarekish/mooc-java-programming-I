
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        int totalSum = number1 + number2 + number3 + number4;
        System.out.println(totalSum);
        
        return totalSum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        int totalSum = sum(number1, number2, number3, number4);
        System.out.println(totalSum);
        
        double average = (double) totalSum / 4;
        System.out.println(average);

        return average;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
