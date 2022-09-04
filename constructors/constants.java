package constructors;

public class constants {

    // In order to prevent somebody creating an object
    // with this class using the default constructor
    // -> You'll define the default constructor yourself
    // but make it private

    private constants(){
        
    }
    public static final int NUMBER_OF_MONTHS_IN_A_YEAR = 12;
    // Here you should pay attention to the "final"
    // token because it means that nobody can change the 
    // constants value.

    public static final int NUMBER_OF_DAYS_IN_A_WEEK = 7;

    public static final String MY_NAME = "Alex";
}
