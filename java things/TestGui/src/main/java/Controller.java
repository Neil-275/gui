import javaswingdev.drawer.DrawerItem;

import javax.swing.*;
import java.awt.*;

public class Controller extends DrawerItem{

    Controller() {
        super("Controller");
        setBackground(new Color(8, 131, 149));

        ImageIcon icon = new ImageIcon(main.class.getResource(".\\icon\\chat.png"));

        icon = new ImageIcon(main.resize(icon,20,20));
        icon(icon);
    }
}
