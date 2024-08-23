
public class Bird {
    private String name;
    private String nameInLatin;
    private int observation;
    
    public Bird (String name, String nameInLatin){
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observation = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addObservation() {
        this.observation++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.nameInLatin + ") " + observation + " observation";
    }
}
