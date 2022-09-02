package constructors;

public class cstruct {
    public static void main(String[] args){
    Dog myDog = new Dog("Jerry");

    System.out.println(myDog.name);
    // This attempt of defining an object with the
    // constants class raises an error because 
    // we've made it's default constructor private.

    //constants myConstant = new constants();
    }
}
