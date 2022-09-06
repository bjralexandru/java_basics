package inheritance;

class MountainBike extends Bicycle {

    // The subclass can add more fields
    public int seatHeight;

    // Another constructor for our class
    public MountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        seatHeight = startHeight;
                        
    }
    
    // We also can add another method
    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    // This class can and should override
    // the toString() method
    @Override public String toString(){
        return (super.toString() + "\nAnd the seat height is: "+seatHeight+" cm");
    }
}
