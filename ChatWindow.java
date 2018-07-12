package com.Course02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    JTextArea textArea;
    JTextField textMsg;

    public ChatWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 150, 900, 700);
        textArea = new JTextArea();
        JButton sendMsgB = new JButton("Отправить");
        textMsg = new JTextField();
        JPanel bottomConter = new JPanel();
        bottomConter.setLayout(new BorderLayout());
        bottomConter.add(textMsg, BorderLayout.CENTER);
        bottomConter.add(sendMsgB, BorderLayout.LINE_END);
        setLayout(new BorderLayout()); // выбор компоновщика элементов
        add(textArea, BorderLayout.CENTER); // добавление кнопки на форму
        add(bottomConter, BorderLayout.SOUTH);
        textMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SendText();
            }
        });
        sendMsgB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SendText();
            }
        });
        setVisible(true);
    }

    public void SendText() {
        System.out.println("Your message: " + textMsg.getText());
        textArea.append(textMsg.getText() + "\n");
        textMsg.setText("");
    }
}