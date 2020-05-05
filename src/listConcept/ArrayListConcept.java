package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
    public static <E> void main(String[] args) {

        int a[] = new int[3];//static array -- size is fixed
        //dynamic array --- ArrayList

        //can contain duplicate values/elements
        //maintain insertion order
        //Synchronized
        //allow random access to fetch the element because it store the value
        //on the basis of index






        ArrayList ar = new ArrayList();
        ar.add(10);//1
        ar.add(20);//2
        ar.add(30);//3

        System.out.println(ar.size());

        ar.add(50);//4
        ar.add(50);//5
        System.out.println(ar.size());//size of array
        System.out.println(ar.get(4));//to get the value from on index


        //to print all the values from arrayList: for loop
        //iterator
        for (int i = 0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        //non generic
        // generic---->
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(100);
        //ar1.add("selenium")

        ArrayList<String>ar2 = new ArrayList<String>();
        ar2.add("Tom");

        ArrayList<E> ar3 = new ArrayList<E>();


        //employee class objects
        Employee e1 = new Employee("kamal",27, "QA");
        Employee e2 = new Employee("jamal",26, "QA");
        Employee e3 = new Employee("amal",25, "QA");

        //create arraylist
        ArrayList<Employee> ar4 = new ArrayList<Employee>();
        ar4.add(e1);
        ar4.add(e2);
        ar4.add(e3);

        //iterator to traverse the value

        Iterator<Employee> it = ar4.iterator();
        while (it.hasNext()){
            Employee emp = it.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.dept);
        }

           //addall()
        ArrayList<String> ar5 = new ArrayList<String>();
        ar5.add("test");
        ar5.add("Selinium");
        ar5.add("QTP");


        ArrayList<String> ar6 = new ArrayList<String>();
        ar6.add("dev");
        ar6.add("java");
        ar6.add("javascript");

        ar5.addAll(ar6);
        for (int i = 0;i<ar5.size();i++){
            System.out.println(ar5.get(i));
        }

        System.out.println("+++++++");

        //remove all
        ar5.removeAll(ar6);
        for (int i = 0; i<ar5.size();i++){
            System.out.println(ar5.get(i));
        }

        System.out.println("**************");
        //retain all

        ArrayList<String> ar7 = new ArrayList<String>();
        ar7.add("test");
        ar7.add("Selinium");
        ar7.add("QTP");


        ArrayList<String> ar8 = new ArrayList<String>();
        ar8.add("test");
        ar8.add("java");


        ar7.retainAll(ar8);
        for (int i = 0; i<ar7.size();i++){

            System.out.println(ar7.get(i));
        }






    }
}
