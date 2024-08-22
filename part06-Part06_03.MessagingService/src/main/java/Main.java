
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message newMessage = new Message("MessagingService", "The exercise template comes with a pre-defined Message class that can be used to create objects representing messages");
        
        System.out.println(newMessage.getSender());
        System.out.println(newMessage.getContent());
        
        System.out.println(newMessage);
    }
}
