package inheritance;

public class Bicycle {
    // Define some fields, also make them
    // public so they are available to other
    // classes.

    public int gear;
    public int speed;

    // One constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // implement some methods
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    // Info getter methods
    public String toString() {
        return ("Number of gears is: "+gear+"\n"+"Speed of the bicycle currently is: "+speed+" km/h");
    }
}
