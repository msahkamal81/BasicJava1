package oopConcept2;

public class TestBank {
    public static void main(String[] args) {

        System.out.println(USBank.min_bal);
        HSBCBank hs = new HSBCBank();
        hs.credit();
        hs.debit();
        hs.transferMoney();
        hs.educationLoan();
        hs.carLoan();


        //dynamic polymorphisem
        //child class object can be referred by parent Interface reference variable
        USBank b = new HSBCBank();
        b.credit();
        b.debit();
        b.transferMoney();


    }
}
