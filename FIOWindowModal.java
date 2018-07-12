package com.Course02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class FIOWindowModal extends FIOWindow{
        JFrame FIOthis;
    public FIOWindowModal(){
        FIOthis = this;
        setLocation(300,200);
        setTitle("Доп окно внесения данных");
        button.setText("Ок");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        surname.setEnabled(true);
        name.setEnabled(true);
        patronymic.setEnabled(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.fioWindow.surname.setText(surname.getText());
                Main.fioWindow.name.setText(name.getText());
                Main.fioWindow.patronymic.setText(patronymic.getText());
                surname.setText("");
                name.setText("");
                patronymic.setText("");
                WindowEvent wev = new WindowEvent(FIOthis, WindowEvent.WINDOW_CLOSING);
                Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
            }
        });
    }
}
