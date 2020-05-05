package oopConcept2;

public class BMW extends Car {//has a relationship


    //when same method is present in parent class as well as child class with the same name and same number of arguments
    // is called method overriding
    public void start(){
        System.out.println("BMW --start");

    }
    public void theftSafety(){
        System.out.println("BMW --theftSafety");

    }

}
