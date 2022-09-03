public class AnotherDebugExample {
    public static void main(String[] args){
        // Here is another example in which we'll be
        // debugging classes.

        // By setting a break point at rows 10 and 15
        // we'll see how the cat1 and cat2 objects 
        // are initialized without any field values
        // which are afterwards populated with data.
        Cat cat1 = new Cat("Kramer");
        cat1.setLitterPreference("TidyCats");
        cat1.setAge(3);


        Cat cat2 = new Cat("George");
        cat2.setLitterPreference("Fresh Step");
        cat2.getLitterPreference();

        System.out.println(cat2.getAge());

        Cat[] cats = new Cat[2];
        // By this point we'll see how the objects
        // are appended to the array.

        cats[0] = cat1;
        cats[1] = cat2;

        // Pay attention to the id's of the objects.
        // This way you can be sure that they refference the
        // same object in memory.
    }
}
