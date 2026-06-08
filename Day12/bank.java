
import java.util.prefs.BackingStoreException;

public class bank {
    private double balance;
    public void deposite(double amount){
    if(amount>0)
    {
        balance=balance+amount;
        System.out.println("tour amount is deposited!"+amount);
    }
    else{
        System.out.println("Amount is invalid");
    }
   }
    public void withdraw(double amount){
        if(amount>0&& amount<=balance){
            balance=balance+amount;
             System.out.println("tour amount is withdraw!"+amount);
        }
        else{
            System.out.println("Amount is invalid!!");
        }
   }
   public double getbalance (){
         return balance;
   }

     public static void main(String[] args) {
        BackingStoreException
     }



}