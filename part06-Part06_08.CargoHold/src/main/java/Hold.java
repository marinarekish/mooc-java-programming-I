
import java.util.ArrayList;

public class Hold {
    private final int maxWeight;
    private final ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int currentTotalWeight = 0;

        for (Suitcase currentsSuitcase : this.suitcases) {
            currentTotalWeight += currentsSuitcase.totalWeight();
        }

        if (currentTotalWeight + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }      
    }
    
    public void printItems(){
        suitcases.forEach((suitcase) -> {
            suitcase.printItems();
        });
    }
        
    @Override
    public String toString(){
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
}
