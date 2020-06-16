package com.company;

public class Main {

    public static void main(String[] args) {
        double[] digits = new double[15];
        digits[0] = 16.4;
        digits[1] = 23.7;
        digits[2] = -19.5;
        digits[3] = -23.7;
        digits[4] = 2.9;
        digits[5] = 34.8;
        digits[6] = 45.9;
        digits[7] = -11;
        digits[8] = -9.5;
        digits[9] = 15.1;
        digits[10] = 78.3;
        digits[11] = -39.1;
        digits[12] = -10.2;
        digits[13] = -73.2;
        digits[14] = 19.5;

        double result = 0;
        double colvo = 0;
        boolean isOtr = false;


        for (double amount : digits) {
            if (amount < 0) {
                isOtr = true;

            } else {
                if (isOtr) {

                    result += amount;
                    colvo++;
                }

            }


        }


        System.out.println("Среднее арифметическое" + " " + result / colvo);

    }
}
