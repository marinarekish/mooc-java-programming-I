
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
  
//        part 1-2
//        PaymentCard card = new PaymentCard(50);
//        System.out.println(card);
//        
//        card.eatAffordably();
//        System.out.println(card);
//
//        card.eatHeartily();
//        card.eatAffordably();
//        System.out.println(card);

//        part 3
//        PaymentCard card = new PaymentCard(5);
//        System.out.println(card);
//
//        card.eatHeartily();
//        System.out.println(card);
//
//        card.eatHeartily();
//        System.out.println(card);

//        part 4
//        PaymentCard card = new PaymentCard(10);
//        System.out.println(card);
//
//        card.addMoney(15);
//        System.out.println(card);
//
//        card.addMoney(10);
//        System.out.println(card);
//
//        card.addMoney(200);
//        System.out.println(card);
        
//        part 5
//        PaymentCard card = new PaymentCard(10);
//        System.out.println("Paul: " + card);
//        card.addMoney(-15);
//        System.out.println("Paul: " + card);
        
//        part 6
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        
        System.out.println("Paul: " + paulsCard);        
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.addMoney(20.0);
        mattsCard.eatHeartily();
        
        System.out.println("Paul: " + paulsCard);        
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50.0);

        System.out.println("Paul: " + paulsCard);        
        System.out.println("Matt: " + mattsCard);
    }
}
