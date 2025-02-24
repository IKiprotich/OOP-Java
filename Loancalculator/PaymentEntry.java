public class PaymentEntry {
    private final int month;
    private final double payment;
    private final double principal;
    private final double interest;
    private final double remainingBalance;

    public PaymentEntry(int month, double payment, double principal, 
                      double interest, double remainingBalance) {
        this.month = month;
        this.payment = payment;
        this.principal = principal;
        this.interest = interest;
        this.remainingBalance = remainingBalance;
    }

    // Getters
    public int getMonth() { return month; }
    public double getPayment() { return payment; }
    public double getPrincipal() { return principal; }
    public double getInterest() { return interest; }
    public double getRemainingBalance() { return remainingBalance; }
}
