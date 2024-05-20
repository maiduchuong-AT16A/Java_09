/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject39;

//import java.util.Scanner;

/**
 *
 * @author dell-vip
 */
public class Practice {
     //static Scanner sc = new Scanner(System.in);
    

    public static final double sum(double...x) {
        double sum = 0;
        for (double a : x) {
            sum += a;
        }
        return sum;
    }

    public static final double getMin(double...x) {
        double min = x[0];

        for (double a : x) {
            if (a < min) {
                min = a;
            }

        }

        return min;
    }

    public static final double getMax(double...x) {
        double max = x[0];
        for (double a : x) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    

    public static String toUpper(String str) {
        StringBuilder TEN = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a >= 'a' && a <= 'z') {
                a = (char) (a - 32);
            }
            TEN.append(a);
        }
        return TEN.toString();
    }
    
    public static String toLower(String str) {
        StringBuilder ten = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a >= 'A' && a <= 'Z') {
                a = (char) (a + 32);
            }
            ten.append(a);
        }
        return ten.toString();
    }
    
    public static String toUpperFirstChar(String str){
        String[] words = str.split(" ");
        for(int i = 0; i< words.length; i++){
            char firstchar = words[i].charAt(0);
            char upperFirstChar = String.valueOf(firstchar).toUpperCase().charAt(0);
            
            words[i] = upperFirstChar + words[i].substring(1);
        }
        String result = String.join(" ", words);
        return result;
    }
    public static long getFibonacci(int position){
        if (position <= 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else {
            return getFibonacci(position - 1) + getFibonacci(position - 2);
        }
    }
    
}
