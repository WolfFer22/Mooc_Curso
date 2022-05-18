
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
        return this.squares > compared.squares;
    }
    
    public int priceApartment(){
        return this.squares * this.princePerSquare;
    }
    
    public int priceDifference(Apartment compared){
        int thisApartmentPrice = this.squares * this.princePerSquare;
        int comparedApartmentPrice = compared.squares * compared.princePerSquare;        
        
        return Math.abs(thisApartmentPrice - comparedApartmentPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return this.priceApartment() > compared.priceApartment();
    }
    
}
