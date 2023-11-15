import javaswingdev.drawer.DrawerItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exit extends DrawerItem{

    Exit() {
        super("Exit");
        setBackground(new Color(8, 131, 149));

        ImageIcon icon = new ImageIcon("D:\\IT\\java things\\TestGui\\src\\main\\icon\\exit.png");
        Image originalImage = icon.getImage();

        // Define the desired width and height for the resized ImageIcon
        int desiredWidth = 20;
        int desiredHeight = 20;

        // Scale the original Image to the desired dimensions
        Image resizedImage = originalImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);

        // Create a new ImageIcon with the resized Image
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        icon(resizedIcon);
    }
}
