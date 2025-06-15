/**
@author shree
**/

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("bike is running");
    }
}
public class PolymorphismExample {
    public static void main(String[] args){
        Vehicle obj = new Bike();
        obj.run();
    }
}
