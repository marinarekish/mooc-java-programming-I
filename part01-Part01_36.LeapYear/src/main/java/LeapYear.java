
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        if (year % 4 != 0) {
            // Year is not divisible by 4
            System.out.println("The year is not a leap year.");
        } else if (year % 100 != 0) {
            // Year is divisible by 4 but not by 100
            System.out.println("The year is a leap year.");
        } else if (year % 400 != 0) {
            // Year is divisible by 100 but not by 400
            System.out.println("The year is not a leap year.");
        } else {
            // Year is divisible by 400
            System.out.println("The year is a leap year.");
        }
    }
}
