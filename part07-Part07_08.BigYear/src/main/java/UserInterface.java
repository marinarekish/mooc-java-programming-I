import java.util.Scanner;

public class UserInterface {
    private BirdWatchDB birdWatchDB;
    private Scanner input;

    public UserInterface(BirdWatchDB birdWatchDB, Scanner input) {
        this.birdWatchDB = birdWatchDB;
        this.input = input;
    }
    
    public void start() {
        while (true) {
            System.out.print("? ");
            String command = input.nextLine();

            switch (command) {
                case "Add":
                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Name in Latin: ");
                    String nameInLatin = input.nextLine();

                    Bird bird = new Bird(name, nameInLatin);
                    birdWatchDB.addBird(bird);
                    break;

                case "Observation":
                    System.out.print("Bird? ");
                    String birdName = input.nextLine();

                    birdWatchDB.addObservation(birdName);
                    break;

                case "All":
                    birdWatchDB.printAllBirds();
                    break;

                case "One":
                    System.out.print("Bird? ");
                    String searchName = input.nextLine();

                    birdWatchDB.printOneBird(searchName);
                    break;

                case "Quit":
                    return;
                default:
                    break;
            }
        }
    }
}
