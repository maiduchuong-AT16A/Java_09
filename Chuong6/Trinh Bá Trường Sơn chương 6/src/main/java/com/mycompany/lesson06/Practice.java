/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson06;

/**
 *
 * @author Admin
 */
public class Practice {

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

    public static java.lang.String toUpper(String str) {
        char[] chuoi = str.toCharArray();
        for (int i = 0; i < chuoi.length; i++) {
            if (chuoi[i] >= 'a' && chuoi[i] <= 'z') {
                chuoi[i] = (char) (chuoi[i] - 32);
            }
        }
        return new String(chuoi);
    }

    public static java.lang.String toLower(String str) {
        char[] chuoi = str.toCharArray();
        for (int i = 0; i < chuoi.length; i++) {
            if (chuoi[i] >= 'A' && chuoi[i] <= 'Z') {
                chuoi[i] = (char) (chuoi[i] + 32);
            }
        }
        return new String(chuoi);
    }

    public static String toUpperFirstChar(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1);
        }
        String result = String.join(" ", words);
        return result;
    }

    public static long getFibonacci(int position) {
        if (position <= 1) {
            return position;
        }
        return getFibonacci(position - 1) + getFibonacci(position - 2);
    }

    private static char[] String(char[] chuoi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
