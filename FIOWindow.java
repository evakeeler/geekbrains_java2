package com.Course02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FIOWindow extends JFrame {
    JTextField surname;
    JTextField name;
    JTextField patronymic;
    JButton button;

    public FIOWindow() {
        int interval=15, beginX=25, elementHeight=25, elementWidth=200;
        setTitle("Фио окно");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(null);
        Font font = new Font("Verdana", Font.BOLD, 12);

        JLabel surnameL = new JLabel("Фамилия:");
        surnameL.setFont(font);
        surnameL.setForeground(Color.BLUE);
        surnameL.setBounds(beginX,interval,elementWidth,elementHeight);

        surname = new JTextField();
        surname.setBounds(beginX,surnameL.getY()+surnameL.getHeight(),elementWidth,elementHeight);


        JLabel nameL = new JLabel("Имя:");
        nameL.setFont(font);
        nameL.setForeground(Color.BLUE);
        nameL.setBounds(beginX,surname.getY()+surname.getHeight()+interval,elementWidth,elementHeight);

        name = new JTextField();
        name.setBounds(beginX,nameL.getY()+nameL.getHeight(),elementWidth,elementHeight);

        JLabel patronymicL = new JLabel("Отчество:");
        patronymicL.setFont(font);
        patronymicL.setForeground(Color.BLUE);
        patronymicL.setBounds(beginX,name.getY()+name.getHeight()+interval,elementWidth,elementHeight);

        patronymic = new JTextField();
        patronymic.setBounds(beginX,patronymicL.getY()+patronymicL.getHeight(),elementWidth,elementHeight);

        button = new JButton("Внести");
        button.setBounds(beginX,patronymic.getY()+patronymic.getHeight()+interval,elementWidth,35);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.fioWindowModal.setVisible(true);
            }
        });

        add(surnameL);
        add(surname);
        add(nameL);
        add(name);
        add(patronymicL);
        add(patronymic);
        add(button);
        surname.setEnabled(false);
        name.setEnabled(false);
        patronymic.setEnabled(false);
        setBounds((screenSize.width/2)-((beginX*2+elementWidth+interval)/2), (screenSize.height/2)-((button.getY()+button.getHeight()+interval*4)/2), beginX*2+elementWidth+interval, button.getY()+button.getHeight()+interval*4);
        setVisible(true);
    }
}
