package BasicJava;

import java.sql.SQLOutput;

public class IfElesConcept {
    public static void main(String[] args) {
        int a =30;
        int b =20;

        if(b>a){
            System.out.println("b is grater than a ");
        }else{
            System.out.println("a is greater than b");
        }
        //comparison operators
        //< > <=> == !=

        int c = 40;
        int d = 40;
        if(c==d){
            System.out.println("c and d are equal");

        }else{
            System.out.println("c and d are not equal");

        }
        //write a logic to find out highest number

        int a1 = 100;
        int b1 = 200;
        int c1 = 300;

        //nested if-else
        //false & false = false
        // true & true = true
        //true & false = false
        if(a1>b1 & a1>c1){
            System.out.println("a1 isn the greatest");

        }else if(b1>c1){
            System.out.println(" b is the greatest");
        }else{
            System.out.println("c is the greatest");
        }

    }

}
