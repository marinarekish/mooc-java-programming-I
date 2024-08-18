
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = 0;
        String userName = "";

        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] params = input.split(",");
            // ["gabriel", "10"]
            int age = Integer.parseInt(params[1]);
            String name = params[0];
            
            if (age > maxAge) {
                maxAge = age;
                userName = name;
            }
            
        }
        
        System.out.println("Name of the oldest: " + userName);
    }
}
