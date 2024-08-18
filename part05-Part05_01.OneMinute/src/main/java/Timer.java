/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marina.rekish
 */
public class Timer {
    // The Timer class has two ClockHand objects: hundredthsOfSecond and seconds.
    private ClockHand hundredthsOfSecond;
    private ClockHand seconds;
    
    public Timer(){
        // Initialize the ClockHand for hundredths of a second with a limit of 100 (0-99)
        this.hundredthsOfSecond = new ClockHand(100);
        // Initialize the ClockHand for seconds with a limit of 60 (0-59)
        this.seconds = new ClockHand(60);
    }
    
    // The advance method moves the timer forward by one hundredth of a second 
    // by calling advance on hundredthsOfSecond.
    // If the hundredthsOfSecond hand reaches 0 (meaning it has completed a full cycle), 
    // the seconds hand is also advanced.
    public void advance() {
        // Advance the hundredths of a second hand
        this.hundredthsOfSecond.advance();
        
        // If hundredths of a second resets to 0, advance the seconds hand
        if (this.hundredthsOfSecond.value() == 0) {
            this.seconds.advance();
        }
    }
    
    // The toString method returns the current time as a string in the format "seconds:hundredthsOfSecond". 
    // The ClockHand class already provides a method to format the value with two digits, 
    // so it's directly used here.
    @Override
    public String toString() {
        // Return the time in the format "seconds:hundredthsOfSecond"
        return this.seconds + ":" + this.hundredthsOfSecond;
    }
}
