package oopConcept;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(20, 30);



    }
    //we can overload main method also
    //you can't create a method inside the method
    //duplicate method : same method name with same number of arguments are not allowed.
    //method overloading : when the method name is same with different argument or input parameters with in the same class.
    public void sum(){
        System.out.println("SUM method -- zero parameter");
    }
    public void sum(int i){//  input 1 parameter
        System.out.println("Sum method  -- input 1 parameter");
        System.out.println(i);
    }

    public void sum(int k, int l){// input 2 parameter
        System.out.println("sum method -->input 2 parameter");
        System.out.println(k+l);
    }
}
