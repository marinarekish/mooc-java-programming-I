
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
        // return this.squares > compared.squares; // easy way
    }
    
    // can add new method and use price() instead of _.squares * _.princePerSquare
    //  private int price() {
    //      return squares * princePerSquare ;
    //  }
    
    public int priceDifference(Apartment compared){
        return Math.abs((this.squares * this.princePerSquare) - (compared.squares * compared.princePerSquare));
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if (this.squares * this.princePerSquare > compared.squares * compared.princePerSquare) {
            return true;
        }
        return false;
    }

}
