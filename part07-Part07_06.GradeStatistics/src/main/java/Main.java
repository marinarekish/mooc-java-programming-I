
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Statistic statistic = new Statistic();
        
        UserInterface ui = new UserInterface(statistic, input);
        ui.start();
    }
    
}