/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Leson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab01_Main {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        LinkedList<Integer> number = new LinkedList<>();

        for (int i = 0; i < testcase; i++) {
            int t_h = sc.nextInt();
            switch (t_h) {
                case 1:
                    char k = sc.next().charAt(0);

                    switch (k) {
                        case 'F':
                            int x = sc.nextInt();
                            number.addFirst(x);
                            break;

                        case 'L':
                            int x1 = sc.nextInt();
                            number.addLast(x1);
                            break;
                        case 'P':
                            int y = sc.nextInt();
                            int x2 = sc.nextInt();
                            number.add(y, x2);
                    }
                    break;
                case 2:
                    
                    int xy = sc.nextInt();
                    int dem = 0;
                    
                    for(int i2 = 0;i2<number.size();i2++) {
                       if(number.get(i2) == xy) {
                           number.remove(i2);
                           dem ++;
                       }
                    }
                    System.out.println(dem);
                    


                    
                    break;
                case 3:
                    int x1 = sc.nextInt();
                    int dem1 = 0;
                    for (Integer n2 : number) {
                        if (n2 == x1) {
                            dem1++;
                        }
                    }
                    System.out.println(dem1);
                    break;
                case 4:
                    int l = sc.nextInt();
                    int r = sc.nextInt();
                    
                    for (int j = l; j <= r; j++) {
                        System.out.print(number.get(j) + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    for (Integer k1 : number) {
                        System.out.print(k1 + " ");
                    }
                    break;

            }
        }
    }
}
