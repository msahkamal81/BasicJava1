package BasicJava;

public class A {
    public A(){
        System.out.println("Parent class Constructor");
    }

    public A(int i){
        System.out.println("parent class constructor with value of i " + i);
    }

    public A(int i, int j){
        System.out.println("parent class constructor with value of i " + i);
        System.out.println("parent class constructor with value of j " + j);
    }

}
