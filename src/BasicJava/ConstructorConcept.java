package BasicJava;

import java.util.concurrent.Callable;

public class ConstructorConcept {

    public ConstructorConcept(){
        System.out.println("default const");
    }

    public ConstructorConcept(int i){
        System.out.println("single parameter constructor");
        System.out.println(" the value of i is " + i);
    }
    public ConstructorConcept(int i, int j){
        System.out.println("two parameter constructor ");
        System.out.println("the value of i " + i);
        System.out.println("the value of j " + j);

    }


    public static void main(String[] args) {
        ConstructorConcept obj = new ConstructorConcept();
        ConstructorConcept obj1 =  new ConstructorConcept(10);
        ConstructorConcept obj2 = new ConstructorConcept(10, 20);





            }




}
