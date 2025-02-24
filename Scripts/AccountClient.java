public class AccountClient {

    public static void main(String args[]){
        Account A1; //object declration
        A1 = new Account(); //object creation

        A1.deposit(4000);
        A1.withdraw(2000);
        System.out.println(A1.checkBalance());

        Account A2;
        A2 = new Account();

        A2.deposit(2000);
    }
    
}
