/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore.basic.leson6;

/**
 *
 * @author Admin
 */
public class Practice {

    public static final double sum(double... x) {
        double sum = 0;
        for (double a : x) {
            sum += a;
        }
        return sum;
    }
    public static final double getMin(double... x) {
        double min = x[0];
        for (double a : x) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }

    public static final double getMax(double... x) {
        double max = 0;
        for (double a : x) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        char[] ch = str.toCharArray();
        for (short i = 0; i < ch.length; i++) {
            if ('a' <= ch[i] && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 'a' + 'A');
            }
        }
        return new String(ch);
    }

    public static String toLower(String str) {
        char[] ch = str.toCharArray();
        for (short i = 0; i < ch.length; i++) {
            if ('A' <= ch[i] && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] - 'A' + 'a');
            }
        }
        return new String(ch);
    }

    public static String toUpperFirstChar(String str) {
        String[] word = str.split(" ");
        char firstChar;
        for (short i = 0; i < word.length; i++) {
            word[i] = toLower(word[i]);
            firstChar = word[i].charAt(0);
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
            word[i] = upperFirstChar + word[i].substring(1);

        }
        String kq = String.join(" ", word);
        return kq;
    }

    public static long getFibonacci(int position) {
        if (position < 3) {
            return 1;
        }
        return (getFibonacci(position - 2) + getFibonacci(position - 1));
    }
}
