package learn_interfaces;

public interface carControl {
    /*
     * Here I write an interface and will
     * try to implement it first to the Car
     * superclass. Then modify it for the BMW
     * subclass (child).
     */

    public void pressAcceleration();

    public void pressBreak();

    public void startEngine();

    public void stopEngine();

    public int readSpeedometer();
}
