package oppConcept3;

public class TestBank {
    public static void main(String[] args) {

        ICICBank ic = new ICICBank();
        ic.educationLoan();
        ic.carLoan();
        ic.homeLoan();
        ic.credit();
        ic.credit();
        ic.debit();
        ic.mututualFund();


        System.out.println(USBank.min_bal);

       USBank us = new ICICBank();
       us.credit();
       us.debit();
       us.transferMoney();



    }
}
