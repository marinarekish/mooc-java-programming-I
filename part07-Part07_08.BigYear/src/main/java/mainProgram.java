import java.util.Scanner;

public class mainProgram {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        BirdWatchDB birdWatchDB = new BirdWatchDB();
        
        UserInterface ui = new UserInterface(birdWatchDB, scan);
        ui.start();
    }
}
