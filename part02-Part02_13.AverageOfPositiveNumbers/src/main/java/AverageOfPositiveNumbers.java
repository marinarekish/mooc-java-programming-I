
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int nums = 0;
                
        while (true) {
            System.out.println("Give a number:");
            
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if (userNum > 0) {
                sum += userNum;
                nums += 1;
            }
            
            if (userNum == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

        }
        
        double average = (double) sum / nums;
        
        

        System.out.println("Average of the numbers: " + average);
    }
}
