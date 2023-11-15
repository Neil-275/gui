import javax.swing.*;

import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import org.w3c.dom.css.RGBColor;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {
    private JPanel heheeh;
    private JButton dropdownButton;
    private DrawerController drawer;

    private void menuActionPerformed(ActionEvent evt){
        if (drawer.isShow())
            drawer.hide();
        else drawer.show();
    }
    private  void remakeButton(){
        ImageIcon icon = new ImageIcon("D:\\IT\\java things\\TestGui\\src\\main\\icon\\hamburger.png");
        Image originalImage = icon.getImage();

        // Define the desired width and height for the resized ImageIcon
        int desiredWidth = 20;
        int desiredHeight = 20;

        // Scale the original Image to the desired dimensions
        Image resizedImage = originalImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);

        // Create a new ImageIcon with the resized Image
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        dropdownButton.setIcon(resizedIcon);
        dropdownButton.setEnabled(true);
        dropdownButton.setPreferredSize(new Dimension(30,30));
    }

    public main(){
        getRootPane().putClientProperty("JRootPane.titleBarBackground", new Color(5, 191, 219));
        getRootPane().putClientProperty("JRootPane.titleBarForeground", Color.white);
        remakeButton();
        drawer= Drawer.newDrawer(this)
                .header(new JLabel("Header Test"))
                .separator(2,new Color(22, 169, 255))
                .background(new Color(160, 233, 255))
//                .backgroundTransparent(0.3f)
                .drawerWidth(250)
                .enableScroll(true)
                .addChild(new Controller().build())
                .addChild(new Info().build())

                .addFooter(new Exit().build())
                .build();
        add(heheeh);
        heheeh.setBackground(new Color(242, 242, 242));
        setTitle("Hehe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setLocationRelativeTo(null);
        setVisible(true);
        dropdownButton.addActionListener(this::menuActionPerformed);
    }
    public static void main (String [] args){
        FlatLightLaf.setup();
        JFrame.setDefaultLookAndFeelDecorated(true);

        UIManager.put( "Button.arc", 999 );

        new main();
    }



}

