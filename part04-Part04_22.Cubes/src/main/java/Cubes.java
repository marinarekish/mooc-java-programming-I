
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
//            int num = Integer.valueOf(scanner.nextLine());
            String num = scanner.nextLine();
            
            if (num.contains("end")) {
                break;
            }
            
            int cube = Integer.valueOf(num);
            
            System.out.print(cube * cube * cube);
            
            System.out.println("");

        }
        
    }
}

//3
//27
//-1
//-1
//11
//1331
//end