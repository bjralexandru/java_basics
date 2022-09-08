public class Car_Overridden {

    private int gears;
    private String brand;

    public Car_Overridden(int gears, String brand) {
        this.gears = gears;
        this.brand = brand;
    }

    @Override // This is an annotation
    public boolean equals(Object obj) {

        // Check if the object is compared
        // with itself and return true
        if (obj == this) {
            return true;
        }
        // Check if obj is an instance of our
        // class or not, in which case we
        // return false.
        if (!(obj instanceof Car_Overridden)) {
            return false;
        }
        // Cast obj to our Class type so we can
        // compare data members
        Car_Overridden castedObj = (Car_Overridden) obj; // This is how you cast an object to another type.

        // Compare the data members and return
        // the bool response
        return Integer.compare(gears, castedObj.gears) == 0 && brand.compareTo(castedObj.brand) == 0;
        // Because we are overridding the .equals method we're now comparing 
        // strings with the .compareTo method
        // specifically built for string types.
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
