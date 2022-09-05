package Encapsulation_Verbose;

class Encapsulate {
    /* By declaring variables as private we 
    make them accessible only to public methods
    defined inside this class. */    
    private String myName;
    private int Roll;
    private int Age;

    // get method for age to access the 
    // private var
    public int getAge() {return Age;}

    // get method for name 
    public String getName() {return myName;}

    // get method for Roll
    public int getRoll() {return Roll;}

    // The setter methods are used to modify the 
    // values of the variables.

    // They dont return anything, they just modify
    // the existing values.

    public void setAge(int newAge) {Age = newAge;}

    // set method for name 

    public void setName(String newName) {
        myName = newName;
    }

    public void setRoll(int newRoll) {Roll = newRoll;}

    

}
