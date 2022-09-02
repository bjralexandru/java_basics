package constructors;

public class Dog {
    // Even if there is no method defined on this class
    // Java assumes you will want to build obj with it
    // and automatically assigns a default constructor to it.
    String name;
    int age;

    
    public Dog(String name) {
        // this. reffers to the field on the object
        this.name = name;
    }

    public Dog(int age) {
        // this. reffers to the field on the object
        this.age = 4;
    }

    public Dog(String name, int age) {
        // this. reffers to the field on the object
        this.name = name;
        this.age = age;
    }
}
