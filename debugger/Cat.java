public class Cat {
    
    String name;
    String litter;
    int age;

    public Cat(String name){
        this.name = name;
    }

    public void  setLitterPreference(String litter){
        this.litter = litter;    
    }
    
    public String getLitterPreference() { 
        return (name + "'s preferate litter is: "+ litter);
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getAge() {
        return (name + "'s age is: "+ age);
    }
}
