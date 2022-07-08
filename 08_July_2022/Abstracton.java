public class Abstracton {
    public static void main(String[] main){

        Mini v1 =  new Mini();
        v1.Start();

        Cooper c1 =  new Cooper();
        c1.Start();

        


    }
    
}
class Mini extends Car{
    @Override
    void Start(){
        System.out.println("Mini working");
    }

}

class Cooper extends Car{
    @Override
    void Start(){
        System.out.println("Cooper working");
    }

}
// abstact class
abstract class Car{
    int price;
    // abstract method inside class
    abstract void Start();
    // inside the abstarct class we can define the body 
    void breaks(){
        System.out.println("Breaking the rule.");
    }

}