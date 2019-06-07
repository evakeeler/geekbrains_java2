package com.Course02;

public class Main {

    public static void main(String[] args) {
        String Parameters = "118 2.05\n" +
                "106 1.77\n" +
                "87 1.83\n" +
                "45 1.12\n" +
                "70 1.87\n" +
                "54 1.57\n" +
                "105 1.76\n" +
                "50 1.96\n" +
                "114 1.76\n" +
                "72 2.45\n" +
                "53 2.10\n" +
                "66 2.25\n" +
                "54 1.50\n" +
                "95 1.62\n" +
                "86 1.72\n" +
                "62 1.57\n" +
                "65 2.24\n" +
                "72 1.43\n" +
                "93 2.01\n" +
                "109 3.01\n" +
                "106 2.97\n" +
                "77 1.69\n" +
                "114 2.09\n" +
                "98 1.72\n" +
                "85 2.46\n" +
                "113 1.94\n" +
                "53 1.77\n" +
                "106 2.30\n";

        int x = 0, point, lineCount = 1;
        String cutLine = "";
        double bmi;
        point = Parameters.indexOf("\n", x);
        while (point != -1) {
            cutLine = Parameters.substring(x, point);
            String person[] = cutLine.split(" ");
            bmi = Integer.parseInt(person[0]) / Math.pow(Double.parseDouble(person[1]), 2);
            if (bmi < 18.5) {
                System.out.println("Человек " + lineCount + " BMI=" + bmi + " - недостаточная масса");
            } else if (18.5 <= bmi && bmi < 25.0) {
                System.out.println("Человек " + lineCount + " BMI=" + bmi + " - норма");
            } else if (25.0 <= bmi && bmi < 30.0) {
                System.out.println("Человек " + lineCount + " BMI=" + bmi + " - избыточная масса");
            } else if (30.0 <= bmi) {
                System.out.println("Человек " + lineCount + " BMI=" + bmi + " - ожирение");
            }
            lineCount += 1;
            x = point + 1;
            point = Parameters.indexOf("\n", x);
        }
    }
}
