package com.Course02;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        int arrCount = 0;
        String count[][] = new String[20][2];
        ArrayList<String> al = new ArrayList<String>();
        al.add("Марина");
        al.add("Андрей");
        al.add("Марина");
        al.add("Андрей");
        al.add("Витя");
        al.add("Оля");
        al.add("Лена");
        al.add("Влад");
        al.add("Кирилл");
        al.add("Маша");
        al.add("Света");
        al.add("Иван");
        al.add("Стас");
        al.add("Георг");
        al.add("Слава");
        al.add("Петр");
        al.add("Абрам");
        al.add("Зина");
        al.add("Марат");
        al.add("Катя");

        for (int i = 0; i < count.length; i++) {
            count[i][0] = "";
            count[i][1] = "";
        }

        for (Iterator it = al.iterator(); it.hasNext(); ) {
            String s = (String) it.next();
            boolean match = false;
            for (int i = 0; i < count.length; i++) {
                if (count[i][0].equals(s)) {
                    count[i][1] = String.valueOf(Integer.parseInt(count[i][1]) + 1);
                    match = true;
                }
            }
            if (match == false) {
                count[arrCount][0] = s;
                count[arrCount][1] = "1";
                arrCount += 1;
            }
        }

        for (int i = 0; i < count.length - 1; i++) {
            System.out.println("[" + i + "][0]=" + count[i][0]);
            System.out.println("count[" + i + "][1]=" + count[i][1]);
            System.out.println("-------");
        }

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Злата", "999-99-99");
        phoneBook.addPerson("Ямагучи", "777-77-77");
        phoneBook.addPerson("Ямагучи", "666-66-66");
        phoneBook.addPerson("Шведов", "111-11-11");
        phoneBook.addPerson("Акопий", "555-55-55");
        phoneBook.getNumber("Ямагучи");
        phoneBook.print();
    }
}