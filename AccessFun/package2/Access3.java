// package AccessFun.package2;

// import AccessFun.package1.Access1;

// public class Access3 {
//     public static void main(String[] args) {
        
//         // Notice that we're inside another 
//         // package and in order for it to work
//         // it will import the class from package1.

//        // For some reason when inside other packages
//        // the defaults are not visible.

//         Access1 a = new Access1();
//         System.out.println(a.hours);
//         System.out.println(a.minutes);  

//         // When using public defined fields 
//         // they're still accessible to the
//         // Access2 class. 
        

//         System.out.println(a.age);

    
//         // If we try to print the private field's 
//         // values we'll throw an error.
//         // Error: field is not visible.
        
//         System.out.println(a.workplace);


//         // When we're using protected defined 
//         // fields inside another package
//         // they are no longer  accessible.
//         System.out.println(a.pinCode);
//         System.out.println(a.password);
//     }
// }

