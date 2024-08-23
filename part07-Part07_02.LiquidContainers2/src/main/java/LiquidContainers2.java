
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            switch (command) {
                case "add":
                    firstContainer.add(amount);
                    break;

                case "move":
                    if (firstContainer.contains() < amount) {
                        amount = firstContainer.contains();
                    }
                    
                    firstContainer.remove(amount);
                    
                    secondContainer.add(amount);
                    break;

                case "remove":
                    secondContainer.remove(amount);
                    break;
                default:
                    break;
            }
        }
    }

}
