
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Recipes recipes = new Recipes();
        
        UserInterface ui = new UserInterface(recipes, input);
        ui.start();
    }

}
