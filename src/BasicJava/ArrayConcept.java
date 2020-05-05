package BasicJava;

public class ArrayConcept {
    public static void main(String[] args) {
       // array: to store similar data type values in a array variable
        //1 int array:
        //one dimensional Array

        //disadvantage of Array
        //array size fixed --static array---------use coolection arraylist hashtable,dynamic array
        // stores only similar data types --to overcome this problem we use object array

        int i[] =new int[4];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        System.out.println(i[3]);
        //System.out.println(i[4]);//ArrayIndexOutOfBoundsException
        System.out.println(i.length);//size/length of array
        //print all the values of array:use for loop
        for(int j = 0;j<i.length;j++){
            System.out.println(i[j]);
        }

        //double array
        double d[] = new double[3];
        d[0] = 30.30;
        d[1] = 40.40;
        d[2] = 50.50;

        System.out.println(d[2]);

        //char array
        char c[] = new char[3];
        c[0] = 'a';
        c[1] = 2;
        c[2] = '$';

        //4 boolean array
        boolean b[] = new boolean[2];
        b[0] = true;
        b[1] = false;

        //5 String Array
        String s[] = new String[3];
        s[0] = "test";
        s[1] = "hello";
        s[2] = "world";

        System.out.println(s.length);
        System.out.println(s[1]);


        //object array (object is a class)---is used to store different data types value

        Object ob[] = new Object[6];
        ob[0] = "Tom";
        ob[1] = 25;
        ob[2] = 12.33;
        ob[3] = "01/01/1999";
        ob[4] ='m';
        ob[5] = "london";
        System.out.println(ob[5]);
        System.out.println(ob.length);

        for (int k = 0;k<ob.length;k++){
            System.out.println(ob[k]);
        }



    }
}
