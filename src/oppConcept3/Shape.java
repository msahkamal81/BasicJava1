package oppConcept3;

public abstract class Shape {

    Shape(){
        System.out.println("shape class constructor");
    }

    int colour;
    abstract void drawing();

    public void fill(){
        System.out.println(" shape  --- fill");

    }

    //can not create object of interface

}
