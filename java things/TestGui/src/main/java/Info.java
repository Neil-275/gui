import javaswingdev.drawer.DrawerItem;
import javax.swing.*;
import java.awt.*;
public class Info extends DrawerItem {
    public Info(){
        super("Info");
        setBackground(new Color(8, 131, 149));
        ImageIcon icon = new ImageIcon(main.class.getResource(".\\icon\\info.png"));
        icon = new ImageIcon(main.resize(icon,20,20));

        icon(icon);

    }
}
