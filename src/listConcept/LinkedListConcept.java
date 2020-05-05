package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        //add

        ll.add("test");
        ll.add("qtp");
        ll.add("selenium");
        ll.add("rpa");
        ll.add("RFT");

        //print
        System.out.println("content of Linklist"+ll);

        //addfirst
        ll.addFirst("kamal");
        //add last
        ll.addLast("sah");

        System.out.println("content of Linklist"+ll);

        //get:
        System.out.println(ll.get(0));

        //set
        ll.set( 0,"tom");
        System.out.println(ll.get(0));

        //remove first and last element
        ll.removeFirst();
        ll.removeLast();
        System.out.println("content of linkList:"+ll);

        ll.remove(2);
        System.out.println("content of linkList:"+ll);



        //how to iterate/print all the values of linkedList:
        //for loop
        System.out.println("for loop");

        for (int n = 0; n<ll.size(); n++){
            System.out.println(ll.get(n));

        }

        //Advance for loop
        System.out.println("advance for loop");

        for (String str :ll){
            System.out.println(str);
        }


        //iterator

        System.out.println("iterator");

        Iterator<String> it = ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //while loop
        System.out.println("*** while loop");
        int num = 0;
        while (ll.size()>num){

            System.out.println(ll.get(num));
            num++;

        }







    }



}
