package oopConcept;

public class StaticAndNonstatic {

    //global variable : the global variable will be available across all the function with some condition.
    String name = "tom";//non static global variable
    static int age = 25;//static global variable

    public static void main(String[] args) {

        //how to call static method and variable
        //1--direct calling
        //2--calling by class name
        sum();
        StaticAndNonstatic.sum();

        //variable
        System.out.println(age);
        System.out.println(StaticAndNonstatic.age);

        //how to call non static method and  variable
        StaticAndNonstatic obj = new StaticAndNonstatic();
        obj.sendMail();
        System.out.println(obj.name);

        //can i access static method by using object reference? yes
        obj.sum();//warning will given


    }

    public void sendMail(){//non static method
        System.out.println("send mail method");

    }
    public static void sum(){//static method
        System.out.println("Sum method ");
    }
}
