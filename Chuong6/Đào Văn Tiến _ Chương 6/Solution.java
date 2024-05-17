
package javacore.basic.lesson6;

import java.util.Scanner;

public class Solution {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        byte T = sc.nextByte();
        for (byte t = 1; t <= T; t++) {
            short n = sc.nextShort();
            double[] arr = new double[n];
            for (short i = 0; i < n; i++) {
                arr[i] = sc.nextDouble();
            }
            sc.nextLine();
            String str1, str2;
            str1 = sc.nextLine();
            str2 = sc.nextLine();
            byte k = sc.nextByte();
            
            System.out.printf("Case #%d:\n", t);
            System.out.printf("Sum: %.02f\n", Practice.getSum(arr));
            System.out.printf("Min: %.01f\n", Practice.getMin(arr));
            System.out.printf("Max: %.01f\n", Practice.getMax(arr));
            System.out.println("To upper: "+Practice.toUpper(str1));
            System.out.println("To lower: "+ Practice.toLower(str2));
            System.out.println("To upper first char: "+Practice.toUpperFirstChar(str1)+" - "+Practice.toUpperFirstChar(str2));
            System.out.printf("Fibonacci(%d): %d", k,Practice.getFibonacci(k));
        }

    }

}
