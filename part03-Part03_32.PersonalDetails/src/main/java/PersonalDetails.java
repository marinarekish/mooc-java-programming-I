
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> names = new ArrayList();        
        ArrayList<Integer> years = new ArrayList(); 

        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            String[] params = input.split(",");
            
            names.add(params[0]); 
            years.add(Integer.valueOf(params[1]));
        }
        
        findLongestName(names);
        findAverageYear(years);
    }
    
    public static void findLongestName(ArrayList<String> names) {
        String longestName = "";
        
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        System.out.println("Longest name: " + longestName);
    }
    
    public static void findAverageYear(ArrayList<Integer> years) {
        int sum = 0;
        int count = years.size();
        
        for (int year : years) {
            sum += year;
        }

        System.out.println("Average of the birth years: " + (double) sum / count);
    }
}
