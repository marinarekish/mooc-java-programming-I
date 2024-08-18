
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        divisibleByThreeInRange(1, 13);
    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int start = beginning;
        int ending = end;
        
        for (int i = start; i <= ending; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
