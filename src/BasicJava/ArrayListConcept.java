package BasicJava;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();

        ar.add(100);
        ar.add(200);
        ar.add(300);

        System.out.println(ar.size());

        ar.add(400);
        ar.add(500);
        System.out.println(ar.size());

        ar.add("tom");
        ar.add("Hello");
        ar.add("12.33");
        ar.add("m");
        ar.add(600);

        System.out.println(ar.size());
        ar.remove(9);
        System.out.println(ar.size());

        System.out.println(ar.get(4));
        //System.out.println(ar.get(9));


        //to print all the value use for loop

        for (int i=0;i<ar.size(); i++){
            System.out.println(ar.get(i));

        }
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(100);


        ArrayList<String>ar2 = new ArrayList<String>();
        ar2.add("tom");




    }
}
