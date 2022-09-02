package enums;

public enum DaysOftheWeek {
   
    SUNDAY(10), 
    MONDAY(50), 
    TUESDAY(60), 
    WEDNESDAY(80), 
    THURSDAY(90), 
    FRIDAY(65), 
    SATURDAY(30);

    final int levelOfTiredness;
    // If you don't include the "final" token 
    // somebody can change the values of your fields.



     // You can assign fields to your enums 
    // with the help of a method  like this

    DaysOftheWeek (int levelOfTiredness){
        this.levelOfTiredness = levelOfTiredness;
    }
}
