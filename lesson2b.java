package com.Course02;

import java.time.DayOfWeek;

public class Main {

    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    private static String getWorkingHours(Enum d) {
        String hours = "";
        if (d.ordinal() < 6) {
            hours = String.valueOf((5 - d.ordinal()) * 8);
        } else {
            System.out.println("Уже выходной. 0 рабочих часов");
        }
        return hours;
    }

}
