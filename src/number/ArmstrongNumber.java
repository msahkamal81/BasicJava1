package number;

public class ArmstrongNumber {

    //153
    //1*1*1 = 1
    //5*5*5 = 125
    //3*3*3 = 27

    public static void isArmstrongNumber(int num){

        System.out.println("given number is "+ num );

        int cube = 0;
        int r;
        int t;

        t=num;
        while (num>0){
            r = num%10;
            num =num/10;
            cube = cube+(r*r*r);
        }
        if (t==cube){
            System.out.println("this is the armstrong number");
        }else {
            System.out.println("this is  not the armstrong number");
        }



    }





    public static void main(String[] args) {
        isArmstrongNumber(153);
        isArmstrongNumber(371);
        isArmstrongNumber(370);
        isArmstrongNumber(0);
        isArmstrongNumber(1);
        isArmstrongNumber(455);

    }

}
