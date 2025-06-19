/**
 * @author shree
 **/
class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance(){ return balance;}
    public void deposit(double amount){
        balance+=amount;
    }
}
class SBI extends BankAccount{
    public SBI(double balance){
        super(balance);
    }
    public void showBank(){
        System.out.println("SBI bank");
    }
}
public class PolymorphismEncapsulationExample {
    public static void main(String[] args) {
        SBI sbiAccount = new SBI(5000);
        sbiAccount.deposit(500);
        System.out.println("balance: "+sbiAccount.getBalance());
        sbiAccount.showBank();
    }
}
