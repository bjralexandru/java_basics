package learn_interfaces;

public class Car implements carControl {
    // This is a superclass which all
    // brand subclass will extend.

    /*
     * Also, because this super class implements
     * carControl, all subclasses will implement it
     * by default.
     */

    protected String brand;
    protected String model;
    protected int horsePower;
    protected int currentSpeed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

    public void setHP(int power) {
        horsePower = power;
    }

    public int getHP() {
        return horsePower;
    }

    public void startEngine() {
        currentSpeed = 0;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public int readSpeedometer() {
        return currentSpeed;
    }

    public void pressAcceleration() {
        currentSpeed += 15;
    }

    public void pressBreak() {
        currentSpeed -= 5;
    }

}
