import java.text.DecimalFormat;
import javax.swing.*;

public class UserInterface {
    private final DecimalFormat df = new DecimalFormat("$#,##0.00");
    
    public void run() {
        showWelcomeMessage();
        
        double principal = getValidDoubleInput("Loan Amount:", 1000, 1_000_000);
        double rate = getValidDoubleInput("Annual Interest Rate (%):", 0.1, 25);
        int years = getValidIntInput("Loan Term (years):", 1, 30);

        Loan loan = new Loan(principal, rate, years);
        showResults(loan);
    }

    private double getValidDoubleInput(String message, double min, double max) {
        while(true) {
            String input = JOptionPane.showInputDialog(null, message, "Loan Calculator", JOptionPane.QUESTION_MESSAGE);
            try {
                double value = Double.parseDouble(input);
                if(value >= min && value <= max) return value;
                JOptionPane.showMessageDialog(null, String.format("Please enter value between %.1f and %.1f", min, max));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }
    }

    private int getValidIntInput(String message, int min, int max) {
        while(true) {
            String input = JOptionPane.showInputDialog(null, message, "Loan Calculator", JOptionPane.QUESTION_MESSAGE);
            try {
                int value = Integer.parseInt(input);
                if(value >= min && value <= max) return value;
                JOptionPane.showMessageDialog(null, String.format("Please enter value between %d and %d", min, max));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a whole number.");
            }
        }
    }

    private void showResults(Loan loan) {
        String monthlyPayment = df.format(loan.getMonthlyPayment());
        JOptionPane.showMessageDialog(null, 
            "Monthly Payment: " + monthlyPayment, 
            "Results", 
            JOptionPane.INFORMATION_MESSAGE);

        int choice = JOptionPane.showConfirmDialog(null, 
            "Would you like to see the full amortization schedule?",
            "Amortization Schedule",
            JOptionPane.YES_NO_OPTION);

        if(choice == JOptionPane.YES_OPTION) {
            showAmortizationSchedule(loan);
        }
    }

    private void showAmortizationSchedule(Loan loan) {
        StringBuilder schedule = new StringBuilder();
        schedule.append("Month\tPayment\t\tPrincipal\tInterest\tBalance\n");
        
        for (PaymentEntry entry : loan.generateAmortizationSchedule()) {
            schedule.append(String.format("%d\t%s\t%s\t%s\t%s%n",
                entry.getMonth(),
                df.format(entry.getPayment()),
                df.format(entry.getPrincipal()),
                df.format(entry.getInterest()),
                df.format(entry.getRemainingBalance())));
        }

        JTextArea textArea = new JTextArea(schedule.toString(), 20, 60);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        JOptionPane.showMessageDialog(null, scrollPane, 
            "Amortization Schedule", JOptionPane.PLAIN_MESSAGE);
    }

    private void showWelcomeMessage() {
        JOptionPane.showMessageDialog(null, """
                                            Welcome to Loan Calculator!
                                            
                                            This program will help you calculate:
                                            - Monthly loan payments
                                            - Full amortization schedule""",
            "Loan Calculator",
            JOptionPane.INFORMATION_MESSAGE);
    }
}