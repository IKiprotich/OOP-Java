public class Account {
    
    //attributes
    private String accountNumber;
    private String accountName;
    private String accountType;
    private double balance;

    //methods/behavior

    public void withdraw(double amount){
        //logic/implementation
        balance = balance - amount;
    }

    public void deposit(double amount){
        //logic
        balance = balance + amount;
    }
    
    public double checkBalance(){
        return balance;
    }


    
}
