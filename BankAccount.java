public class BankAccount {
    // attributes/data members
    String accountName;
    double accountBalance;

    // constructors
    public BankAccount() {
        accountName = "unknown";
        accountBalance = 5000;
    }

    // Setter Methods / mutators
    void setAccountName(String name) {
        accountName = name;
    }

    void setAccountBalance(double bal) {
        accountBalance = bal;
    }

    // Getter Methods / accessors
    String getAccountName() {
        return accountName;
    }

    double getAccountBalance() {
        return accountBalance;
    }

    // Functionality methods
    void withdraw(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    double checkBalance() {
        return accountBalance;
    }
}