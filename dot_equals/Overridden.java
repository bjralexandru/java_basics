public class Overridden {
    public static void main(String[] args) {
        /*
         * In this example the .equals
         * method is overriden, so it
         * will resulting in
         * a true result.
         */

        Car_Overridden myCar = new Car_Overridden(6, "Mercedes");
        Car_Overridden yourCar = new Car_Overridden(6, "Mercedes");

        if (myCar.equals(yourCar)) {
            System.out.println("The cars are equal");
        } else {
            System.out.println("The cars are not equal");
        }
    }
}
