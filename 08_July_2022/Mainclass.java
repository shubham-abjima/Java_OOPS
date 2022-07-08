public record Mainclass() {
    public static void main(String[] args){
        Person p1 =  new Person();
        p1.age = 54;
        p1.name = "peter";  

        Person p2 = new Person(54,"Peter");
        // p2.age = 45;
        // p2.name = "Alex";

        System.out.println(p1.age+" "+ p2.name);
        System.out.println(p2.age+" "+ p2.name);

        p1.eat();
        p2.walk();
        p2.walk(10);   
        p1.eat(50);
        System.out.println(Person.count);

        Developer d1 =  new Developer(54,"peter");
        d1.walk();
    }
}
class Developer extends Person{
    public Developer(int age, String name){
        super(age,name);
    
    }
    // this walk() using run time polymorphism
    public void walk(){
        System.out.println("Developer " + name + " is walking. ");
    }



}


class Person{
    String name;
    int age;
    static int count;
    public  Person(){
        System.out.println("Constructore is called");
        count++;
    }
    public Person(int age, String name){
    // public Person(int myAge, String myName){
        // this() is used to call the constructor or the parameter  of the constructor.
        this();
        // System.out.println(myName+" is " + myAge + " years old ");
        // age  =   myAge;
        // name = myName;
        this.name  = name;
        this.age =  age;
    }

    void eat(){
        System.out.println(name+ "is eating.");

    }
    public void walk(){
        System.out.println(name+ "is walking.");
    }
    // this walk() function using the compile time polymorphism
    void walk(int steps){
        System.out.println(name + " walked " + steps);
    }
    void eat(int items){
        System.out.println(name +" ate "+ items + " items");
    }
    void Work(){
        System.out.println("Working fine");
    }

}
