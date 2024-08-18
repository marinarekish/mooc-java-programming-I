
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        
        while (true) {
            System.out.println("Give a number:");
            
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if (userNum != 0) {
                num += userNum;
            }
            
            if (userNum == 0) {
                break;
            }

        }
        
        System.out.println("Sum of the numbers: " + num);


    }
}
