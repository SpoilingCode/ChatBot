package view;

import bot.ChatBot;
import listener.MessagesListener;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.lang.*;

/**
 * Class is the face of the chat
 */
public class ChatFace extends JFrame{

    private JTextArea messageBoard;
    private JTextField messageField;
    private ChatBot chatBot;
    private SimpleAttributeSet botStyle;
    private static final String APPLICATION_NAME = "Chat Bot";
    private final int START_POSITION = 200;
    private final int WINDOW_WIDTH = 360;
    private final int WINDOW_HEIGHT = 480;

    public static void main(String[] args) {
        ChatFace chatFace = new ChatFace();
        chatFace.drawWindowAndElements();
    }

    public void drawWindowAndElements(){
        MessagesListener messagesListener = new MessagesListener();
        setTitle(APPLICATION_NAME);
        setBounds(START_POSITION, START_POSITION,
                  WINDOW_WIDTH,WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setBackground(Color.pink);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        messageBoard = new JTextArea();
        messageBoard.setEditable(false);
        messageBoard.setLineWrap(true);

        JScrollPane scrollBar = new JScrollPane(messageBoard);
        add(BorderLayout.CENTER, scrollBar);
        botStyle = new SimpleAttributeSet();
        StyleConstants.setItalic(botStyle,true);
        StyleConstants.setForeground(botStyle, Color.DARK_GRAY);

        JPanel bottomMessageMenu = new JPanel();
        bottomMessageMenu.setLayout(new BoxLayout(bottomMessageMenu,
                                                  BoxLayout.X_AXIS));

        messageField = new JTextField();
        messageField.addActionListener(messagesListener);
        bottomMessageMenu.add(messageField);

        JButton submitBtn = new JButton();
        submitBtn.setText("submit");
        submitBtn.addActionListener(messagesListener);
        bottomMessageMenu.add(submitBtn);

        messagesListener.setBotStyle(botStyle);
        chatBot = new ChatBot();
        messagesListener.setChatBot(chatBot);
        messagesListener.setMessageField(messageField);
        messagesListener.setMessageBoard(messageBoard);

        add(BorderLayout.SOUTH, bottomMessageMenu);

        setVisible(true);
    }
}
