import java.util.ArrayList;

public class Suitcase {
    private final ArrayList<Item> items = new ArrayList<>();
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        int currentTotalWeight = 0;

        // Calculate the current total weight of items in the suitcase
        for (Item currentItem : this.items) {
            currentTotalWeight += currentItem.getWeight();
        }

        // Check if adding the new item exceeds the max weight
        if (currentTotalWeight + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items){
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for (Item item : items){
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
    
    @Override
    public String toString(){
        if (this.items.isEmpty()) {
            return "no items (" + totalWeight() + " kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + " kg)";
        }
        
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }
}
