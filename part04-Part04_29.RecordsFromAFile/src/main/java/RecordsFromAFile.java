
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String user = fileScanner.nextLine();
                
                String[] info = user.split(",");
                
                String userName = info[0];
                int userAge = Integer.valueOf(info[1]);
                
                String years = " year";
                if (userAge > 1 || userAge == 0) {
                    years = " years";
                }
                
                System.out.println(userName + ", age: " + userAge + years);
            }
            
        } catch(Exception e) {
            System.out.println("Reading the file failed.");
            return; 
        }
    }
}
