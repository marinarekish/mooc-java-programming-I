
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        
        while (true) {
            System.out.println("Give a number:");
            
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if (userNum != 0) {
                num += 1;
            }
            
            if (userNum == 0) {
                break;
            }

        }
        
        System.out.println("Number of numbers: " + num);

    }
}
