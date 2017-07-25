package view;

import bot.ChatBot;
import listeners.MessagesListener;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

/**
 * Class is the face of the chat
 */
public class ChatFace extends JFrame{

    JTextArea windowDialog;
    JCheckBox checkBox;
    JTextField messageDialog;
    ChatBot chatBot;
    SimpleAttributeSet botStyle;
    public static final String APPLICATION_NAME = "Chat Bot";
    final int START_POSITION = 200;
    final int WINDOW_WIDTH = 360;
    final int WINDOW_HEIGHT = 480;

    public ChatFace(){
        drawWindowAndElements();
    }

    public static void main(String[] args) {
        new ChatFace();
    }

    public void drawWindowAndElements(){
        MessagesListener messagesListener = new MessagesListener();
        setTitle(APPLICATION_NAME);
        setBounds(START_POSITION, START_POSITION,
                WINDOW_WIDTH,WINDOW_HEIGHT);
        setBackground(Color.pink);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        windowDialog = new JTextArea();
        windowDialog.setEditable(false);
        windowDialog.setLineWrap(true);

        JScrollPane scrollBar = new JScrollPane(windowDialog);
        add(BorderLayout.CENTER, scrollBar);
        botStyle = new SimpleAttributeSet();
        StyleConstants.setItalic(botStyle,true);
        StyleConstants.setForeground(botStyle, Color.DARK_GRAY);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        checkBox = new JCheckBox();
        checkBox.doClick();
        panel.add(checkBox);

        messageDialog = new JTextField();
        messageDialog.addActionListener(messagesListener);
        panel.add(messageDialog);

        JButton submitBtn = new JButton();
        submitBtn.setText("submit");
        submitBtn.addActionListener(messagesListener);
        panel.add(submitBtn);

        messagesListener.setBotStyle(botStyle);
        messagesListener.setChatBot(chatBot);
        messagesListener.setCheckBox(checkBox);
        messagesListener.setMessageDialog(messageDialog);
        messagesListener.setWindowDialog(windowDialog);
        add(BorderLayout.SOUTH, panel);
        setVisible(true);
    }

}
