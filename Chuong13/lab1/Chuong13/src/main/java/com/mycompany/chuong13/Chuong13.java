/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chuong13;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chuong13 {

     static Scanner sc = new Scanner(System.in);
    static LinkedList<Integer> ds = new LinkedList<>();

    static void func01() {
        char kiTu = sc.next().charAt(0);
        switch (kiTu) {
            case 'F' ->
                ds.add(0, sc.nextInt());
            case 'L' ->
                ds.add(ds.size(), sc.nextInt());
            default -> {
                int x, y;
                y = sc.nextInt();
                x = sc.nextInt();
                ds.add(y, x);
            }
        }
    }

    static void func02() {
        int count = 0, x = sc.nextInt();
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i) == x) {
                ds.remove(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void func03() {
        int count = 0, x = sc.nextInt();
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i) == x) {
                count++;
            }
        }
        System.out.println(count);
    }

    static void func04() {
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        for (int i = x; i <= y; i++) {
            System.out.print(ds.get(i) + " ");
        }
        System.out.println("");
    }

    static void func05() {
        for (int i = 0; i < ds.size(); i++) {
            System.out.printf(ds.get(i) + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int n, N = sc.nextInt();
        for (n = 1; n <= N; n++) {
            short choice = sc.nextShort();
            switch (choice) {
                case 1 -> func01();
                case 2 -> func02();
                case 3 -> func03();
                case 4 -> func04();
                case 5 -> func05();
            }
        }
    }
}
