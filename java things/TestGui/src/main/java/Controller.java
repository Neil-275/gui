import javaswingdev.drawer.DrawerItem;

import javax.swing.*;
import java.awt.*;

public class Controller extends DrawerItem{

    Controller() {
        super("Controller");
        setBackground(new Color(8, 131, 149));

        ImageIcon icon = new ImageIcon("D:\\IT\\java things\\TestGui\\src\\main\\icon\\chat.png");
        Image originalImage = icon.getImage();

        // Define the desired width and height for the resized ImageIcon
        int desiredWidth = 20;
        int desiredHeight = 20;

        // Scale the original Image to the desired dimensions
        Image resizedImage = originalImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);

        // Create a new ImageIcon with the resized Image
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        icon(resizedIcon);
    }
}
