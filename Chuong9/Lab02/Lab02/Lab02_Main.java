/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leson09.lab02;

import java.util.Scanner;

/**
 *
 * @author tuan anh
 */
public class Lab02_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            PartTimeEmployee[] nvpt = new PartTimeEmployee[N];
            FullTimeEmployee[] nvft = new FullTimeEmployee[M];
            int P = sc.nextInt();
            int Q = sc.nextInt();
            for (int i = 0; i < M; i++) {
                sc.nextLine();
                nvft[i] = new FullTimeEmployee(sc.nextLine(), sc.nextInt());
            }

            for (int i = 0; i < N; i++) {
                sc.nextLine();
                nvpt[i] = new PartTimeEmployee(sc.nextLine(), sc.nextInt(), sc.nextInt());
            }
            System.out.printf("Case #%d:\n", t);
            int j;
            for (int i = 0; i < P; i++) {
                j = sc.nextInt();
                nvft[j].showInfo();
            }
            int k;
            for (int i = 0; i < Q; i++) {
                k = sc.nextInt();
                nvpt[k].showInfo();
            } 
        } 
    }

}
