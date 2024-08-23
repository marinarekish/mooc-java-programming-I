import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipes {
    private final ArrayList<Recipe> recipes;
    private ArrayList<String> ingredients;
    private final Scanner scanner;
    
    public Recipes() {
        this.recipes = new ArrayList<>();
        this.ingredients = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    
    public void loadRecipes(String filename) {
        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            
            while(fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.valueOf(fileScanner.nextLine());

                Recipe recipe = new Recipe(name, cookingTime);
                recipes.add(recipe);
                                
                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    
                    recipe.addIngredients(ingredient);
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void printRecipes() {
        System.out.println("");
        System.out.println("Recipes:");
        
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void findByName(String searchFor) {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(searchFor)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByCookingTime(int maxTime) {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void findByIngredient(String searchForIngredient) {
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            for (String ingredient : recipe.getIngredients()) {
                if (ingredient.toLowerCase().equals(searchForIngredient)) {
                    System.out.println(recipe);
                    break;
                }
            }
        }
    }
}
