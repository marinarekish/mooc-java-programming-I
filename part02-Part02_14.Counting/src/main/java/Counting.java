
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//        System.out.println("Give a number (1-10): ");
        int number = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

    }
}
