package com.Course02;

public class Main {
    static FIOWindow fioWindow;
    static FIOWindowModal fioWindowModal;

    public static void main(String[] args) {
        ChatWindow chatWindow = new ChatWindow();
        fioWindow = new FIOWindow();
        fioWindowModal = new FIOWindowModal();
        fioWindowModal.setVisible(false);
    }
}
