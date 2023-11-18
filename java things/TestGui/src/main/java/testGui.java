import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class testGui {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("JTextPane Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextPane textPane = new JTextPane();
            textPane.setText("Hello, world!");

            int borderRadius = 10; // Adjust the radius as desired
            Color borderColor = Color.RED; // Adjust the color as desired

            Border roundBorder = BorderFactory.createLineBorder(borderColor, 2 * borderRadius);
            textPane.setBorder(roundBorder);

            JScrollPane scrollPane = new JScrollPane(textPane);
            frame.getContentPane().add(scrollPane);

            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}