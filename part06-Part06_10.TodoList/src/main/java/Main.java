
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
//        TodoList list = new TodoList();
//        Scanner scanner = new Scanner(System.in);
//
//        list.add("first");
//        list.add("second");
//        
//        UserInterface ui = new UserInterface(list, scanner);
//        ui.start();

        TodoList list = new TodoList();
        list.add("one");
        list.add("two");
        list.add("three");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
        list.print();

    }
}
