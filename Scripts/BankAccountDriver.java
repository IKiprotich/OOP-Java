
public class BankAccountDriver{
    public static void main(String args[]){

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();
        BankAccount herAccount = new BankAccount();

        myAccount.setAccountName("Nochieng");
        yourAccount.setAccountName("Abeid Azhar");
        hisAccount.setAccountName("Maina Leonel");
        herAccount.setAccountName("Ogwayo Emma");

        System.out.println(herAccount.getAccountName());

        myAccount.deposit(13000);
        myAccount.withdraw(3000);

        double balance = hisAccount.checkBalance();
        System.out.println(balance);



    }}
