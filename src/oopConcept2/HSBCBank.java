package oopConcept2;
//we are achieving multiple Inheritance
// is a relationship
public class HSBCBank implements USBank,BrazilBank {

    //if a class implementing any Interface, then it mandatory
    //to define/override all method of Interface
    //overriding from UsBank
    public void credit(){
        System.out.println("hsbc----credit");
    }
    public void debit(){
        System.out.println("hsbc ----debit");
    }
    public void transferMoney(){
        System.out.println("hsbc ----transfermoney");

    }

    //seperate method of HSBCBank class

    public void educationLoan(){
        System.out.println("hsbc   ---education loan");
    }

    public void carLoan(){
        System.out.println("hsbc ---carloan");
    }

    //brazil bank method , overriding from Brazil Bank

    public void mutualFund(){
        System.out.println("hsbc --mutual fund");
    }
}
