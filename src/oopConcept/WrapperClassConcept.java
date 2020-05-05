package oopConcept;

public class WrapperClassConcept {

    public static void main(String[] args) {
        String x = "100";
        System.out.println(x+20);

        //data conversion : String to int

        int i = Integer.parseInt(x);
        System.out.println(i+20);

        //integer, double, boolean (char can not convert)
        //String to double conversion

        String y = "12.33";
        double d = Double.parseDouble(y);
        System.out.println(d+10);

        //String to boolean conversation

        String k = "true";

        boolean b = Boolean.parseBoolean(k);
        System.out.println(b);


        //int to string convert
        int j = 100;
        System.out.println(j+20);
        String s = String.valueOf(j);
        System.out.println(s+30);


        String u = "100A";//number format exception
        Integer.parseInt(u);


    }
}
