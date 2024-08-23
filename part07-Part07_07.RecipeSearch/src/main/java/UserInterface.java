import java.util.Scanner;

public class UserInterface {

    private Recipes recipes;
    private Scanner input;

    public UserInterface(Recipes recipes, Scanner input) {
        this.recipes = recipes;
        this.input = input;
    }

    public void start() {
        System.out.print("File to read: ");
        if (input.hasNextLine()) {
            String path = input.nextLine();
            System.out.println("");

            recipes.loadRecipes(path);

            System.out.println("Commands:\n"
                    + "list - lists the recipes\n"
                    + "stop - stops the program\n"
                    + "find name - searches recipes by name\n"
                    + "find cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient");

            while (true) {
                System.out.println("");
                System.out.print("Enter command: ");

                if (input.hasNextLine()) {
                    String command = input.nextLine();

                    switch (command) {
                        case "list":
                            recipes.printRecipes();
                            break;
                        case "find name":
                            System.out.print("Searched word: ");
                            String searchFor = input.nextLine().toLowerCase();
                            
                            recipes.findByName(searchFor);
                            break;
                            
                        case "find cooking time":
                            System.out.print("Max cooking time: ");
                            int maxTime = Integer.parseInt(input.nextLine());
                            
                            recipes.findByCookingTime(maxTime);
                            break;
                            
                        case "find ingredient":
                            System.out.print("Ingredient: ");
                            String searchForIngredient = input.nextLine().toLowerCase();
                            
                            recipes.findByIngredient(searchForIngredient);
                            break;
                            
                        case "stop":
                            return;
                            
                        default:
                            break;
                    }
                }
            }

        }
    }
}
