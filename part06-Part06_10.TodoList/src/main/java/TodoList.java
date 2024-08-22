import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> tasks = new ArrayList<>();
    
    public void add(String task){
        this.tasks.add(task);
    }
    
    public void print(){
        int index = 1;
        
        while (index <= tasks.size()) {
            System.out.println(index + ": " + tasks.get(index - 1));
            index++;
        }
    }
    
    public void remove(int number){
        int index = number - 1;
        
        tasks.remove(index);
    }
}
