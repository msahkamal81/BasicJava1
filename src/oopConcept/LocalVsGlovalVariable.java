package oopConcept;

public class LocalVsGlovalVariable {
    //Global variable -- Class variable
    String name = "tom";
    int age = 25;

    public static void main(String[] args) {
        int i = 10;//local variables for main method
        System.out.println(i);

        LocalVsGlovalVariable obj = new LocalVsGlovalVariable();
        System.out.println(obj.name);
        System.out.println(obj.age);



    }
    public void sum(){
        int i = 10;//local variable for sum method
        int j = 20;
    }

}
