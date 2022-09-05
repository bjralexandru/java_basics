package Encapsulation_Verbose;

public class TestEncapsulation {
    public static void main(String[] args) {
        
        Encapsulate obj = new Encapsulate();

        // set values 
        obj.setAge(25);
        obj.setName("Bobby");
        obj.setRoll(51);

        // Display the values 
        System.out.println("The name is: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Roll is: " + obj.getRoll());
    }
}
