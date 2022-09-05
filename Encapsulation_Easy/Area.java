package Encapsulation_Easy;

class Area {
    int length;
    int breadth;

    // Constructor to init the values
    Area (int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}
