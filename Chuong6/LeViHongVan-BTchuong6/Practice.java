/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacore.basic.lesson6;

/**
 *
 * @author van
 */
public class Practice {

    public static final double getSum(double... x) {
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
        double max = x[0];
        for (double a : x) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static String toUpper(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 97 && ch[i] <= 122) {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        return new String(ch);
    }

   public static String toLower(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        return new String(ch);
    }

    public static String toUpperFirstChar(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1);
        }
        String results = String.join(" ", words);

        return results;
    }

    public static long getFibonacci(int position) {
        if (position == 1 || position == 2) {
            return 1;
        }
        return getFibonacci(position - 1) + getFibonacci(position - 2);
    }

}
