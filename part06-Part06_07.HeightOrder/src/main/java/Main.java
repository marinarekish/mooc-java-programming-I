
public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("Shortest: " + room.shortest());
        
        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }
}
