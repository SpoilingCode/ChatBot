package listener;

import bot.ChatBot;
import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class for listening to messages from the chat
 */
public class MessagesListener implements ActionListener {
    private JTextField messageField;
    private String message;
    private ChatBot chatBot;
    private SimpleAttributeSet botStyle;
    private JTextArea messageBoard;

    public void setChatBot(ChatBot chatBot) {
        this.chatBot = chatBot;
    }

    public void setBotStyle(SimpleAttributeSet botStyle) {
        this.botStyle = botStyle;
    }

    public void setMessageField(JTextField messageField) {
        this.messageField = messageField;
    }

    public void setMessageBoard(JTextArea messageBoard) {
        this.messageBoard = messageBoard;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       message =  messageField.getText();

        if( !isEmptyMessage(message) ){
            messageBoard.append(message + "\n");
            messageBoard.append(chatBot.talk(message));
        }
        messageField.setText("");
        messageField.requestFocusInWindow();
    }

    public boolean isEmptyMessage(String message){
        String messageWithoutSpaces = message.trim();
        int messageLength = messageWithoutSpaces.length();
        return messageLength == 0;
    }
}
