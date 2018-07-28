package com.Course02;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        // Нет исключений массива с неверной длинной
        String arrCorrect[][] = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        // throw Exception для массива arrLenghtError[][] с неверной длинной
        //String arrLenghtError[][] = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        // throw Exception для массива arrConvertError[][] с неверным типом данных
        String arrConvertError[][] = {{"1", "2", "d", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            if (arrConvertError.length != 4) {
                throw new MyArraySizeException("MyArraySizeException: Массив первого порядка не 4");
            }
        } catch (MyArraySizeException e) {
            System.out.println(e);
        } catch (MyArrayDataException e){
            System.out.println("MyArrayDataException: Не верное содержание массива" + e);
        }

        try {
            for (int i = 0; i < 4; i++) {
                if (arrConvertError[i].length != 4) {
                    throw new MyArraySizeException("MyArraySizeException: Массив [" + i + "] не 4 длинной");
                }
            }
        } catch (MyArraySizeException |ArrayIndexOutOfBoundsException  e) {
            System.out.println("MyArraySizeException: Массив второго порядка не 4 длинной +" + e);
        }

        try {
            arrExeptions(arrConvertError);
        } catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException: " + e);
        }

    }

    static void arrExeptions(String array[][]) throws ArrayIndexOutOfBoundsException, NumberFormatException {
        int sums = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sums = sums + Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    System.out.println("MyArrayDataException: array" + "[" + i + "]" + "[" + j + "] =" + e);
                }

            }
        }
        System.out.println(sums);
    }

}

class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super(message);

    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);

    }
}
