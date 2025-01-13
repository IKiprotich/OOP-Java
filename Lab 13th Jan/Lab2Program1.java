import javax.swing.JOptionPane;

public class Lab2Program1 {

    public static void main(String[] args) {

        javax.swing.JFrame window = new javax.swing.JFrame();

        window.setSize(500, 300);
        window.setTitle("My First Java Program in Lab");
        
        
        java.awt.Point position = new java.awt.Point(200, 500);
        
        window.setLocation(position);
        
        
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
    
        window.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Click OK to close me");
        JOptionPane.showMessageDialog(window, "Click OK to close me");

        
        window.dispose();
    }
}