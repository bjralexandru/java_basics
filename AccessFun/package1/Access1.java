package AccessFun.package1;

public class Access1 {

    // default, public, private and protected

    // This are defaults: 
    int hours = 3; 
    int minutes =  47;

    // Publics:

    public String name = "Alex";
    public int age = 25;

    // Privates:

    private String workplace = "The StartUp";
    private int salary = 47000;

    public String getWorkplace(){
        return "He works at " + workplace;
    }

    public String getSalary() {
        return "He earns " + salary;
    }

    // Protected:

    protected int pinCode = 7582;
    protected String password = "123456";
}
