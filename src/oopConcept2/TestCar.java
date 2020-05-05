package oopConcept2;

public class TestCar {
    public static void main(String[] args) {

        //static polymorphis --compile time polymorphis
        BMW b = new BMW();
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();
        b.engine();
        System.out.println("=======");


        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();

        System.out.println("=====");
        //child class object can be referred by parent class reference variable
        //called dynamic variable or Run time polymorphise
        //Top casting
       Car c1 =  new BMW();
       c1.start();
       c1.stop();
       c1.refuel();

       //down casting

        BMW b1 = (BMW)new Car();//ClassCastException









    }

}
