/**
 *
 * @author marina.rekish
 */

import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messages = new ArrayList<>();
    
    public void add(Message message){
        if (message.getContent().length() <= 280) {
            this.messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return this.messages;
    }

}
