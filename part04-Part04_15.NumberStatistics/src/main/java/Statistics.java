
public class Statistics {
    private int numberCount;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.numberCount = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.numberCount++;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return this.numberCount;
    }
    
    public int sum() {
        // write code here
          return this.sum;
    }

    public double average() {
        if (this.numberCount == 0) {
            return 0.0;  // Return 0 to avoid division by zero
        }
        return (double) this.sum / this.numberCount;
    }
}
