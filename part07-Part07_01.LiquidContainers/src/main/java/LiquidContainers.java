
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            // reading the input and converting string to 2 parts array
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    // check amount validation
                    if (amount > 0) {
                        firstContainer += amount;
                    } 
                    
                    // check container limits
                    if (firstContainer > 100) {
                        firstContainer = 100;
                    }
                    
                    break;
                    
                case "move":
                    // check firstContainer 
                    if (amount > firstContainer && amount > 0) {
                        amount = firstContainer;
                    }
                    
                    firstContainer -= amount;
                    secondContainer += amount;
                    
                    // check container limits
                    if (secondContainer > 100) {
                        secondContainer = 100;
                    } 
                                        
                    break;
                    
                case "remove":
                    if (amount > 0) {
                        secondContainer -= amount;
                    }
                    
                    // check container limits
                    if (secondContainer < 0) {
                        secondContainer = 0;
                    }

                    break;
                default:
                    break;
            }

        }
        
        
    }

}
