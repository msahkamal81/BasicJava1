package BasicJava;

public class LoopsConcepts {
    public static void main(String[] args) {
        //1 while loop:
        //Disadvantage of while loop: it will generate infinite loop if you do not give increment/decrement.
        int i =0;
        while(i<10){
            System.out.println(i);
            i=i+1;

        }

        int j =0;//initiatization
        while (j<=10){//conditional part
            System.out.println(j);j=j+1;//incremental part/decremental
        }

        System.out.println("*******");

        //for loop
        //k++ means k = k+1
        //print 1 to 10

        for (int k=1;k<=10;k++){//initialization,conditional part ,incremental
            System.out.println(k);
        }


        System.out.println("**********");

        //print 10 to 1

        for (int m=10;m>=1;m--){
            System.out.println(m);
        }

        System.out.println("*******");//initialization,conditional part ,incremental
        for (int n=10;n>=0;n--){
            System.out.println(n);
        }


    }
}
