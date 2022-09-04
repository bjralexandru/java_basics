// package AccessFun.package2;

// import AccessFun.package1.Access1;

// public class Access3_Extends extends Access1 {
//     // By adding "extends Access1" we're making
//     // it a subclass of Access1 which gives it 
//     // access to all its fields.

//     // But in order for it to work we need to 
//     // initialize an instance of Access3 instead
//     // of Access1 on line 22.

//     // !! It doesnt work for this version of Java.
//     // Or the folder structure is different.
    
//     public static void main(String[] args) {
        
//         // Notice that we're inside another 
//         // package and in order for it to work
//         // it will import the class from package1.

//        // For some reason when inside other packages
//        // the defaults are not visible.

//         Access3 b = new Access3();
        
//         b.getClass();
//         // System.out.println(b.hours);
//         // System.out.println(b.minutes);  

//         // // When using public defined fields 
//         // // they're still accessible to the
//         // // Access2 class. 
        

//         // System.out.println(b.age);

    
//         // // If we try to print the private field's 
//         // // values we'll throw an error.
//         // // Error: field is not visible.
        
//         // System.out.println(b.workplace);


//         // // When we're using protected defined 
//         // // fields inside another package
//         // // they are no longer  accessible.


//         // System.out.println(b.pinCode);
//         // System.out.println(b.password);
//     }
// }

