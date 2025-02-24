public class Main {
    public static void main(String[] args) {
        // Use SwingUtilities to ensure thread safety
        javax.swing.SwingUtilities.invokeLater(() -> new UserInterface().run());
    }
}
