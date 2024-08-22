
import java.util.Scanner;


public class UserInterface {
    private TodoList todoList;
    private Scanner input;

    public UserInterface(TodoList todoList, Scanner input) {
        this.todoList = todoList;
        this.input = input;
    }
    
    public void start(){
        while (true) {
            System.out.print("Command: ");
            
            String command = input.nextLine();
            
            switch (command) {
                case "stop":
                    return;
                    
                case "add":
                    System.out.print("To add: ");
                    String task = input.nextLine();
                    
                    this.todoList.add(task);
                    break;
                    
                case "remove":
                    System.out.print("Which one is removed? ");
                    
                    if (input.hasNextInt()) {
                        int index = input.nextInt();
                        input.nextLine(); 
                        
                        this.todoList.remove(index);
                    } else {
                        System.out.println("Invalid input, expected a number.");
                        input.nextLine();  
                    }
                    break;
                    
                case "list":
                    todoList.print();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
    
}
