
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int newEuros = euros + addition.euros;
        int newCents = cents + addition.cents;
        
        Money newMoney = new Money(newEuros, newCents); 

        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this == compared) {
            return false;
        }

        Money comparedMoney = (Money) compared;

        if (euros < comparedMoney.euros 
                || euros <= comparedMoney.euros && cents < comparedMoney.cents) {
            return true;
        }

        return false;
    }
    
    public Money minus(Money decreaser){
        int decreaseEuros = euros - decreaser.euros;
                
        int decreaseCents = cents - decreaser.cents;
        
        if (decreaseCents < 0) {
            decreaseCents += 100;
            decreaseEuros--;
        }
        
        if (decreaseEuros < 0) {
            decreaseEuros = 0;
            decreaseCents = 0;
        }
        
        Money decreaseMoney = new Money(decreaseEuros, decreaseCents); 
        
        return decreaseMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
