import java.util.Scanner;

public class TextUI {
    private Scanner input;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner input, SimpleDictionary dictionary){
        this.input = input;
        this.dictionary = dictionary;
    }
    
    public void start(){
        
        while (true) {
            System.out.print("Command: ");
            
            if (!input.hasNextLine()) {
                System.out.println("No input available");
                break;  // Or handle the scenario accordingly
            }
            
            String command = input.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")) {
                System.out.print("Word: ");
                String word = input.nextLine();

                System.out.print("Translation: ");
                String translation = input.nextLine();

                this.dictionary.add(word, translation);
                continue;
            }
            
            if (command.equals("search")) {
                System.out.print("To be translated: ");
                String searchFor = input.nextLine();

                String translatedWord = this.dictionary.translate(searchFor);

                if (translatedWord != null) {
                    System.out.println("Translation:" + translatedWord);
                } else {
                    System.out.println("Word " + searchFor + " was not found");
                }
                continue;
            }

            System.out.println("Unknown command");
        }
    }

}
