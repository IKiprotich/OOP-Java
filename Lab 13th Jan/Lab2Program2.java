import javax.swing.*;

public class Lab2Program2 {

    public static void main (String [] args) {
          
	
	String fullName = JOptionPane.showInputDialog("Enter your full name (e.g., Belle Tway):");

	String[] parts = fullName.split(" ");

	String firstName = parts[0];

	String lastName = parts[1];

	JOptionPane.showMessageDialog(null, "Your first name is " + firstName);
	JOptionPane.showMessageDialog(null, "Your last name is " + lastName);

	JOptionPane.showMessageDialog(null, "Your initials are " + firstName.charAt(0) + "." + lastName.charAt(0) + ".");
    }
}
