package enums;

public class EnumTutorial {
    public static void main(String[] args) {
        DaysOftheWeek.values();
        // returns all values stored in a string array

        // Example of usage:
        for (DaysOftheWeek myDay: DaysOftheWeek.values()){
            System.out.println(myDay);
        }

        // Example of fields use
        System.out.println(DaysOftheWeek.MONDAY.levelOfTiredness);
    }
}
