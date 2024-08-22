import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private final ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        jokes.add(joke);
    }
    
    public String drawJoke(){
        
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } 
        
        System.out.println("Drawing a joke");

        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        return jokes.get(index);
    }
    
    public void printJokes(){
        System.out.println("Printing the jokes.");

        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
