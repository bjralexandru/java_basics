public class DebuggingExample {
    public static void main(String[] args) {

        int firstINt = 7;
        int secondInt = 8;
        // Setting a breakpoint at line 7 and then 
        // Run adn Debug
        int sum = add(firstINt, secondInt);

        System.out.println("The sum is: " +sum);
    }

    private static int add(int int1, int int2) {
        // By going "Inside the function" you can change
        // the values for the variables in the Debugger tab
        // to see how it would change the end result.
        int sum = int1 + int2;
        return sum;
    }
}