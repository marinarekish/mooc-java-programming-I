
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to?  ");        
        int numEnd = scanner.nextInt();
        
        System.out.print("Where from? ");
        int numStart = scanner.nextInt();

        
        for (int i = numStart; i <= numEnd; i++) {
            System.out.println(i);
        }
    }
}
