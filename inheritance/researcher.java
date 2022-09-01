package inheritance; 

public class researcher{
    // Defined a blueprint for a typical researcher
    // Which we'll use to build our lab's team

    public String name;
    public int age;
    public String degree;
    public String[] expertise;
    public String[] studies;
    public String group;
    

    public int increaseSalary(int currentSalary, int raiseAmout) {
        // My favorite method: SALARY RISE! 
        // Made it public to be accesible from another file
        // Also made it return an int 

        return currentSalary + raiseAmout;
    }

}