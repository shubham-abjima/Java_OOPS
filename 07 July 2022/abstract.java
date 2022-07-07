abstract class Car
{
 Car()
 {
  System.out.println("Car is built. ");
 }
 abstract void drive();
 void gearChange()
 {
  System.out.println("Gearchanged!!");
 }
} 

class Tesla extends Car
 {
  void drive()
  {
   System.out.println("Drive Safely");
  }
 }

class Abstraction 
 {
  public static void main (String args[])
  {
   Car obj = new Tesla();
   obj.drive();
   obj. gearChange();
  }
 }