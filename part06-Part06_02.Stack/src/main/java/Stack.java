
/**
 *
 * @author marina.rekish
 */

import java.util.ArrayList;

public class Stack {
    ArrayList<String> values = new ArrayList<>();

    public boolean isEmpty(){
        return this.values.isEmpty();
    }
    
    public void add(String value){
        this.values.add(value);
    }
    
    public ArrayList<String> values(){
        return this.values;
    }
    
    public String take(){
        String taken = this.values.get(this.values.size() - 1);
        this.values.remove(taken);
        
        return taken;
    }
}
