import raven.chat.component.ChatArea;
import raven.chat.component.ChatBox;
import raven.chat.model.ModelMessage;
import raven.chat.swing.ChatEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatInterface extends ChatArea {
    ChatInterface(){
        setOpaque(true);
        setSize(390,450);
//        setBackground(Color.red);
        setTitle("hihi");
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy. hh:mmaa");
        addChatEvent(new ChatEvent() {
            @Override
            public void mousePressedSendButton(ActionEvent evt) {
                Icon icon= new ImageIcon(".\\f.png");
                String name="Me";
                String date= df.format(new Date());
                String  mess=ChatInterface.getText().trim();
                if (!mess.isEmpty())
                    addChatBox(new ModelMessage(icon,name,date,mess), ChatBox.BoxType.RIGHT);


            }

            @Override
            public void mousePressedFileButton(ActionEvent evt) {

            }

            @Override
            public void keyTyped(KeyEvent evt) {

            }
        });

    }

}
