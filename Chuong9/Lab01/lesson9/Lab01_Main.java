/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Lab01_Main {

    public static void main(String[] args) throws FileNotFoundException {
        //System.setIn(new FileInputStream("test_case_lab1_lesson9.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {

            int M = sc.nextInt();
            int N = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();

            Rectangle[] HCN = new Rectangle[M];
            Circle[] Tron = new Circle[N];
            int[] posRec = new int[P];
            int[] posCir = new int[Q];

            for (int i = 0; i < M; i++) {
                HCN[i] = new Rectangle(sc.nextDouble(), sc.nextDouble());
            }
            for (int j = 0; j < N; j++) {
                Tron[j] = new Circle(sc.nextDouble());
            }
            for (int m = 0; m < P; m++) {
                posRec[m] = sc.nextInt();
            }
            for (int n = 0; n < Q; n++) {
                posCir[n] = sc.nextInt();
            }
            System.out.printf("Case #%d:\n", t);
            for (int m = 0; m < P; m++) {
                HCN[posRec[m]].show();
            }
            for (int n = 0; n < Q; n++) {
                Tron[posCir[n]].show();
            }
        }

    }
}
