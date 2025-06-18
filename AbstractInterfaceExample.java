/**
 * @author shree
 **/
abstract class Dog implements Animal{
   public void eat(){
       System.out.println("Dogs eat bones");
   }
   abstract void bark();
}
class Labrador extends Dog{
    public void bark(){
        System.out.println("labrador barks loudly");
    }
}
interface Animal{
    void eat();
}

public class AbstractInterfaceExample {
    public static void main(String[] args) {
       Labrador obj = new Labrador();
       obj.bark();
       obj.eat();
    }
}
