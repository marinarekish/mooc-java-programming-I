

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    
    public static void printFromNumberToOne(int number) {
        int num = number;
            
        while (num >= 1) {
            System.out.println(num);
            num--;
        }
    }
}
