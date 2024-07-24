/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javacore.basic.lesson13.lab1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Lab1 {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int t = SC.nextInt();

        for (int i = 0; i < t; i++) {
            int luachon = SC.nextInt();
            SC.nextLine(); 

            switch (luachon) {
                case 1:
                    char kt = SC.nextLine().charAt(0);
                    int value = SC.nextInt();
                    SC.nextLine(); 

                    if (kt == 'F') {
                        list.add(0, value);
                    } else if (kt == 'L') {
                        list.add(list.size(),value);
                    } else if (kt == 'P') {
                        int vt = SC.nextInt();
                        SC.nextLine();

                        if (vt < 0 || vt > list.size()) {
                            list.add(list.size(),value);
                        } else {
                            list.add(vt, value);
                        }
                    }
                    break;
                case 2:
                    int ptXoa = SC.nextInt();
                    SC.nextLine(); 
                    int count = 0;
                    for (int j = list.size() - 1; j >= 0; j--) {
                        if (list.get(j) == ptXoa) {
                            list.remove(j);
                            count++;
                        }
                    }
                    System.out.println(count);
                    break;
                case 3:
                    int ptXH = SC.nextInt();
                    SC.nextLine(); 
                    count = 0;
                    for (int value1 : list) {
                        if (value1 == ptXH) {
                            count++;
                        }
                    }
                    System.out.println(count);
                    break;
                case 4:
                    int x = SC.nextInt();
                    int y = SC.nextInt();
                    SC.nextLine(); 
                   
                        for (int j = x; j <= y; j++) {
                            System.out.print(list.get(j) + " ");
                        }
                        System.out.println();
                   
                    break;
                case 5:
                    for (int value2 : list) {
                        System.out.print(value2 + " ");
                    }
                    System.out.println();
                    break;
            }
        }
    }
}