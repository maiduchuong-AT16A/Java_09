/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lesson6;

/**
 *
 * @author ADMIN
 */
public class Pratice {

    public static final double sum(double... x) {
        double s = 0;
        for (double num : x) {
            s += num;
        }
        return s;
    }

    public static final double getMin(double... x) {
        double min = x[0];
        for (double num : x) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double max = x[0];
        for (double num : x) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        char[] chuoi = str.toCharArray();
        for (int i = 0; i < chuoi.length; i++) {
            if (chuoi[i] >= 'a' && chuoi[i] <= 'z') {
                chuoi[i] = (char) (chuoi[i] - 32);
            }
        }
        return new String(chuoi);
    }

    public static String toLower(String str) {
        char[] chuoi = str.toCharArray();
        for (int i = 0; i < chuoi.length; i++) {
            if (chuoi[i] >= 'A' && chuoi[i] <= 'Z') {
                chuoi[i] = (char) (chuoi[i] + 32);
            }
        }
        return new String(chuoi);
    }

    public static String toUpperFirstChar(String str) {
        str = toLower(str);
        String[] temp = str.split(" ");
        for (int i = 0; i < temp.length; i++) {
            char firstChar = temp[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            temp[i] = upperFirstChar + temp[i].substring(1);

        }
        String result = String.join(" ", temp);
        return result;
    }

    public static long getFibonacci(int position) {
        if (position <= 1) {
            return position;
        }
        return getFibonacci(position - 1) + getFibonacci(position - 2);
    }
    
    
}
