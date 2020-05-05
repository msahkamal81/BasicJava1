package oopConcept;

public class CallbyValuCallbyRef {
    int p;
    int q;
    public static void main(String[] args) {
        CallbyValuCallbyRef obj = new CallbyValuCallbyRef();
        int x = 20;
        int y = 30;

        obj.testSum(x, y);//call by value or pass by value

        obj.p = 50;
        obj.q = 60;

        obj.swap(obj);
        //after swap
        System.out.println(obj.p);
        System.out.println(obj.q);








    }
    public int testSum(int a,int b){
        a = 30;
        b = 40;
        int c = a+b;
        return c;
    }

    //call by ref

    public void swap(CallbyValuCallbyRef t){
        int temp;
        temp = t.p;//temp = 50
        t.p = t.q; //t.p = 60
        t.q = temp;//t.q = 50


    }



}
