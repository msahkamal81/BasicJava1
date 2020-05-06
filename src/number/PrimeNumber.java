package number;

public class PrimeNumber {
   //2 is the lowest prime number
    // 3 is the prime number
    // number 20

    public static boolean isPrimNumber(int num){
    // edge/corner cases
        if (num<=1){
            return false;
        }
        for (int i = 2; i<num; i++){
            if (num % i == 0){

                return false;

            }
        }

        return true;
    }

    public static void getPrimeNumbers(int num){
        System.out.println("prime number upto "+ num);
        System.out.println();
        for (int i = 2; i<=num; i++){
            if (isPrimNumber(i))
                System.out.println(i + " ");
        }
    }




    public static void main(String[] args) {

        System.out.println("2 is prime number : "+ isPrimNumber(2));
        System.out.println("3 is prime number : "+ isPrimNumber(3));
        System.out.println("10 is prime number : "+ isPrimNumber(10));
        System.out.println("17 is prime number : "+ isPrimNumber(17));
        System.out.println("0 is prime number : "+ isPrimNumber(0));
        System.out.println("1 is prime number : "+ isPrimNumber(1));
        System.out.println("-3 is prime number : "+ isPrimNumber(-3));


        getPrimeNumbers(7);
        getPrimeNumbers(13);
        getPrimeNumbers(20);



    }
}
