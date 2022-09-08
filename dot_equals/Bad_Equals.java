public class Bad_Equals {
    public static void main(String[] args) {
        /*
         * In this example the .equals
         * method is not overriden, so it
         * will just return the == default
         * comparison. Thus, resulting in
         * a false result.
         */

        Car myCar = new Car();
        Car yourCar = new Car();

        if (myCar.equals(yourCar)) {
            System.out.println("The cars are equal");
        } else {
            System.out.println("The cars are not equal");
        }
    }
}