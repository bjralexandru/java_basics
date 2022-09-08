package learn_interfaces;

public class Test {
    public static void main(String[] args) {
        BMW myCar = new BMW("BMW", "5 series");

        myCar.setHP(143);
        System.out.println("My car has " + myCar.getHP() + " horse power.");
        System.out.println("Currently I have " + myCar.readSpeedometer() + " km/h.");
        System.out.println("Oh, I forgot to start the car :)))");
        myCar.startEngine();
        myCar.pressAcceleration();
        myCar.pressAcceleration();
        myCar.pressAcceleration();
        myCar.pressAcceleration();
        myCar.pressAcceleration();
        System.out.println("Now I have " + myCar.readSpeedometer() + " km/h.");
        myCar.pressBreak();
        myCar.pressBreak();
        myCar.pressBreak();
        myCar.pressBreak();
        System.out
                .println("Better lower it down. Geez now I have " + myCar.readSpeedometer() + " km/h. Much safer :D.");
    }
}
