/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson09.lab01;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Lab01_Main {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int T = SC.nextInt();
        for (int t = 0; t < T; t++) {
            int M = SC.nextInt();
            int N = SC.nextInt();
            int P = SC.nextInt();
            int Q = SC.nextInt();

            Retangle r[] = new Retangle[M];
            for (int i = 0; i < M; i++) {
                r[i] = new Retangle(SC.nextDouble(), SC.nextDouble());
            }

            Circle c[] = new Circle[N];
            for (int i = 0; i < N; i++) {
                c[i] = new Circle(SC.nextDouble());
            }

            System.out.printf("Case #%d:\n", t + 1);

            for (int i = 0; i < P; i++) {
                int a = SC.nextInt();

                r[a].show();
                System.out.println("");

            }
            for (int i = 0; i < Q; i++) {
                int b = SC.nextInt();

                c[b].show();
                System.out.println("");
            }

        }

    }

}
