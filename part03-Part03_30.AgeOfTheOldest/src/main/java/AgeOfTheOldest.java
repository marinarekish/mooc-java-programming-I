
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;

        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] params = input.split(",");
            // ["gabriel", "10"]
            int age = Integer.parseInt(params[1]);
            
            if (age > maxAge) {
                maxAge = age;
            }
            
        }
        
        System.out.println("Age of the oldest: " + maxAge);
    }
}
