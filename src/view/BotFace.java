package view;

import bot.ChatBot;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gerit on 24.07.2017.
 */
public class BotFace extends JFrame{

    JTextArea windowDialog;
    JCheckBox checkBox;
    JTextField messageDialog;
    ChatBot chatBot;
    SimpleAttributeSet botStyle;
    final String APPLICATION_NAME = "Chat Bot";
    final int START_POSITION = 200;
    final int WINDOW_WIDTH = 360;
    final int WINDOW_HEIGHT = 480;

    public BotFace(){
        drawWindowAndElements();
    }

    public static void main(String[] args) {
        new BotFace();
    }

    public void drawWindowAndElements(){
        setTitle(APPLICATION_NAME);
        setBounds(START_POSITION, START_POSITION,
                WINDOW_WIDTH,WINDOW_HEIGHT);
        setBackground(Color.pink);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        windowDialog = new JTextArea();
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
        messageDialog.addActionListener(this);
        panel.add(messageDialog);

        JButton submitBtn = new JButton();
        submitBtn.setText("submit");
        submitBtn.addActionListener(this);
        panel.add(submitBtn);

        add(BorderLayout.SOUTH, panel);
        setVisible(true);
    }

}
