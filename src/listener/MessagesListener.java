package listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gerit on 24.07.2017.
 */
public class MessagesListener implements ActionListener {
    private JTextField message;
    private JCheckBox checkBox;

    public void setMessage(JTextField message) {
        this.message = message;
    }

    public void setCheckBox(JCheckBox checkBox) {
        this.checkBox = checkBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int messageLength = message.getText()
                                    .trim()
                                    .length();
        if(messageLength > 0){

        }
    }
}
