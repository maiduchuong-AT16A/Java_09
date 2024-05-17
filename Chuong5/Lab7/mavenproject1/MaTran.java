/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Tuan Anh
 */
public class MaTran {

    int a, b;
    int mt[][];

    public MaTran() {
        super();

    }

    public MaTran(int a, int b, int[][] mt) {
        this.a = a;
        this.b = b;
        this.mt = mt;

    }

    void input() {

        Scanner SC = new Scanner(System.in);
        a = SC.nextInt();
        b = SC.nextInt();
        int i, j;
        mt = new int[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                mt[i][j] = SC.nextInt();
            }
        }

    }

    void output() {
        int i, j;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.printf("%4d ", mt[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
    }

    void xoaytrai90() {
        int i, j;
        int max = a * b;
        int dem1 = 0;
        int dem2 = 0;
        int arr[] = new int[max];
        for (i = b - 1; i >= 0; i--) {
            for (j = 0; j < a; j++) {
                arr[dem1++] = mt[j][i];
            }
        }
        int temp = a;
        a = b;
        b = temp;
        mt = new int[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                mt[i][j] = arr[dem2++];
            }

        }

    }

    void xoayphai90() {
        int i, j;
        int max = a * b;
        int dem1 = 0;
        int dem2 = 0;
        int arr[] = new int[max];
        for (i = 0; i < b; i++) {
            for (j = a - 1; j >= 0; j--) {
                arr[dem1++] = mt[j][i];
            }
        }

        int temp = a;
        a = b;
        b = temp;
        mt = new int[a][b];
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                mt[i][j] = arr[dem2++];
            }

        }

    }

    void xoay180() {
        int i, j;
        int max = a * b;
        int dem1 = 0;

        int arr[] = new int[max];
        for (i = a - 1; i >= 0; i--) {
            for (j = b - 1; j >= 0; j--) {
                mt[i][j] = arr[dem1++];
            }

        }

    }
}
