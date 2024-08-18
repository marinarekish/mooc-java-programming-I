import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(title, pages, year);
            books.add(book);
        }
        
        System.out.println("");
        
        System.out.print("What information will be printed? ");
        String search = scanner.nextLine();
        
        if (search.contains("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (search.contains("name")) {
            for (Book book : books) {
                book.printTitle();
            }
        } 

    }
}
