/**
 *
 * @author marina.rekish
 * This class effectively calculates the target heart rate 
 * for different exercise intensities based on the given age 
 * and resting heart rate, making it useful for fitness monitoring and planning.
 */

public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        // The method first calculates the maximum heart rate using the formula 206.3 - (0.711 * age).
        double maxHeartRate = 206.3 - (0.711 * this.age);
        
        // Then, it calculates the target heart rate using the Karvonen formula.
        double targetHeartRate = (maxHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
        
        // Finally, it returns the calculated target heart rate as a double.
        return targetHeartRate;
    }
}
