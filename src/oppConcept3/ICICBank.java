package oppConcept3;

public class ICICBank extends Finance implements USBank, RBI {

    //RBI Bank Interface
    @Override
    public void educationLoan() {
        System.out.println("icic edu");

    }

    @Override
    public void homeLoan() {
        System.out.println( "icic home" );

    }

    @Override
    public void carLoan() {
        System.out.println("icic car");

    }
    //USB Bank Interface
    @Override
    public void debit() {
        System.out.println("Icic debit");

    }

    @Override
    public void credit() {
        System.out.println("Icic credit");

    }

    @Override
    public void transferMoney() {
        System.out.println("Icic transfer ");

    }

    @Override
    public void trading() {
        System.out.println("icic transfer");

    }

    //icic bank class method

    public void mututualFund(){
        System.out.println("icic mutual");
    }

    public void insurance(){
        System.out.println("icic insurance");
    }

}
