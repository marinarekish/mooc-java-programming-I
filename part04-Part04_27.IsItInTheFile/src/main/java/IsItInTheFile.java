
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        ArrayList<String> list = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                list.add(name.trim());  // Add each name to the list after trimming any leading/trailing spaces
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            return;  // Exit the program if the file is not found
        }
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        while (true) {
            if (list.contains(searchedFor)) {
                System.out.println("Found!");
                break;
            } else {
                System.out.println("Not found.");
                break;
            }
        }
        
    }
}
