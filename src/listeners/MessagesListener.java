package listeners;

import bot.ChatBot;
import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class for listening to messages from the chat
 */
public class MessagesListener implements ActionListener {
    private JTextField messageDialog;
    private String message;
    private JCheckBox checkBox;
    private ChatBot chatBot;
    private SimpleAttributeSet botStyle;
    private JTextArea messageBoard;

    public void setChatBot(ChatBot chatBot) {
        this.chatBot = chatBot;
    }

    public void setBotStyle(SimpleAttributeSet botStyle) {
        this.botStyle = botStyle;
    }

    public void setMessageDialog(JTextField messageDialog) {
        this.messageDialog = messageDialog;
    }

    public void setCheckBox(JCheckBox checkBox) {
        this.checkBox = checkBox;
    }

    public void setMessageBoard(JTextArea messageBoard) {
        this.messageBoard = messageBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       message =  messageDialog.getText();
       String messageWithoutSpaces = message.trim();
       int messageLength = messageWithoutSpaces.length();

        if(messageLength > 0){
            try {
                messageBoard.append(message + "\n");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        messageDialog.setText("");
        messageDialog.requestFocusInWindow();
    }
}
