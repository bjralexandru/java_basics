package primitives;

public class AllPrimitives {
    public static void main(String[] args) {
        // They are the sticks and rocks
        

        // Can only store -128 to 127
        // Also can store char's 
        // Only stores whole numbers 
        byte myByte = 12;
        System.out.println(myByte);

        /*  Can store a little more -32,768 
        to 32,767.

        Can do more than byte can but it's so
        in the middle that you won't really
        use it.  */ 
        short myShort = 1234;
        System.out.println(myShort);

        /*  Important to note that this primitive
        can go up to only 2 billion in both 
        directions. */

        int myInt = 283213217;
        
        /* For numbers larger than 2 billion 
        you should use this primitive instead.
        */

        System.out.println(myInt);
        long myLong = 123154654623L;
        // Mind the "L" (can be lowercase) at 
        // the end which tells Java
        // you mean to make it a long type.
        System.out.println(myLong);

        // There are memory arguments about this
        // primitives. But for pedestrian apps 
        // this won't be an issue. 

        float myFloat = 6.3f;
        // Float gives you 6 decimals of precision.
        // Without the "f" at the end it assumes it
        // is a double;
        System.out.println(myFloat);

        // For more than 6 decimals of precision
        // use double.

        double myDouble = 45.2321321321;
        System.out.println(myDouble);

        // Booleans are a straight forward 
        // primitive.

        boolean myTrue = true;
        boolean myFalse = false;

        // Check equality or validity

        boolean moreThan100 = (myInt > 1000);

        System.out.println(myTrue);
        System.out.println(myFalse);
        System.out.println(moreThan100);

        // Char primitives

        char myChar = 'W';
        // you put the character in single quotes.
        // only strings use double quotes.

        System.out.println(myChar);
        

    }
        
}

