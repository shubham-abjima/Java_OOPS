public class Interfaces implements Car,Person{

    public static void main(String[] args){

    }
    @Override
    public void Start(){
        System.out.println("Working fine");
        
    }
    @Override
    public void walk(){
        System.out.println("Person doing great");

    }
    }
interface Car{
    public void Start();
    // void Start(){   We cannot define the body inside interface it will give an error.

        
    // }
}

interface Person{
    public void walk();
}
    

