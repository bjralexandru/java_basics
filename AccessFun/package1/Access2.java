package AccessFun.package1;

public class Access2 {
    public static void main(String[] args) {
        
        // Notice that we're inside the same package

        // By usind defaults, when initializing this
        // class we get access to all the fields inside
        // the class.
        Access1 a = new Access1();
        System.out.println(a.hours);
        System.out.println(a.minutes);  

        // When using public defined fields 
        // they're still accessible to the
        // Access2 class. 
        
        System.out.println(a.age);


        // If we try to print the private field's 
        // values we'll throw an error.
        // Error: field is not visible.
        
        System.out.println(a.workplace);


        // When we're using protected defined 
        // fields inside the same package
        // they are still accessible.
        System.out.println(a.pinCode);
        System.out.println(a.password);
    }
}
