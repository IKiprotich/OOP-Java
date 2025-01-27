import java.util.ArrayList;
import java.util.List;

public class Loan {
    private final double principal;
    private final double annualInterestRate;
    private final int loanTermYears;

    public Loan(double principal, double annualInterestRate, int loanTermYears) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTermYears = loanTermYears;
    }

    public double getMonthlyPayment() {
        double monthlyRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = loanTermYears * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) 
              / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);
    }

    public List<PaymentEntry> generateAmortizationSchedule() {
        List<PaymentEntry> schedule = new ArrayList<>();
        double balance = principal;
        double monthlyPayment = getMonthlyPayment();
        double monthlyRate = (annualInterestRate / 100) / 12;

        for (int month = 1; month <= loanTermYears * 12; month++) {
            double interest = balance * monthlyRate;
            double principalPaid = monthlyPayment - interest;
            
            if (balance < principalPaid) {
                principalPaid = balance;
                monthlyPayment = principalPaid + interest;
            }
            
            balance -= principalPaid;
            schedule.add(new PaymentEntry(month, monthlyPayment, principalPaid, interest, balance));
            
            if (balance <= 0) break;
        }
        return schedule;
    }
}