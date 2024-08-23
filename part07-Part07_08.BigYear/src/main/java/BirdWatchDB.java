
import java.util.ArrayList;

public class BirdWatchDB {
    private final ArrayList<Bird> birds;

    public BirdWatchDB() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird){
        this.birds.add(bird);
    }
    
    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void printOneBird(String searchName) {
        for (Bird bird : birds) {
            if (bird.getName().equals(searchName)) {
                System.out.println(bird);
            }
        }
    }
    
    public void addObservation(String birdName) {
        for (Bird bird : birds) {
            if (bird.getName().equals(birdName)) {
                bird.addObservation();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
}
