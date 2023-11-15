import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatIntelliJLaf;

public class testGui {
    public static void main(String [] args){
        FlatIntelliJLaf.setup(); //setting the look and feel
        JFrame frame= new JFrame();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        frame.getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(23,180,252));
//        frame.getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);

    }
}
