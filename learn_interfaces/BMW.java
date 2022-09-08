package learn_interfaces;

public class BMW extends Car {

    public BMW(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void pressAcceleration() {
        currentSpeed += 30;
    }

    @Override
    public void pressBreak() {
        currentSpeed -= 12;
    }

}
